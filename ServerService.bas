B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=11.8
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
#End Region

Sub Process_Globals
	Private server As HttpServer
	Private templates As Map
	Private su As StringUtils
	Public port As Int = 8080
	Public greeting As String
	Dim ssocket As ServerSocket
	
End Sub
Sub Service_Create
	server.Initialize("Server")
	server.Start(port)
	templates.Initialize
	Dim n As Notification
	Dim n2 As Notification
	n.Initialize2(n.IMPORTANCE_HIGH)
	n.Icon = "icon"
	n.SetInfo("Http Server is running", "IP : " & ssocket.GetMyIP & CRLF & "Port : " & port, Main)
	n.Notify(1)
	Service.StartForeground(1, n)
End Sub

Sub Service_Start (StartingIntent As Intent)
	
End Sub

Sub Server_HandleRequest (Request As ServletRequest, Response As ServletResponse)
	Try
		Log("Client: " & Request.RemoteAddress)
		Log(Request.RequestURI) 'handle the request based on the URL
		CallSubDelayed2(Main,"logs",Request.RequestURI)
		Select True
			Case Request.RequestURI = "/"
				HandleMainPage (Response)
			Case Request.RequestURI.StartsWith("/list/")
				HandleList (Request, Response)
			Case Request.RequestURI.StartsWith("/pkg/")
				SetContentType(Request.RequestURI, Response)
				Response.SendFile(File.DirInternal & "/ESH/pkg", DecodePath(Request.RequestURI.SubString(5)))
			Case Request.RequestURI.StartsWith("/upload/")
				HandleUpload(Request, Response)
			Case Request.RequestURI.Contains("/Jailbreak/9.00/index.html")
				SetContentType(Request.RequestURI, Response)
				Response.SendFile(File.DirInternal & "/ESH/", DecodePath(Request.RequestURI.SubString(1)))
				Main.csu.RemoveCallsToSub("JB900")
				Main.csu.CallSubDelayedPlus(Main,"JB900",25000)
			Case Else
				'send a file as a response (this section is enough in order to host a site)
				SetContentType(Request.RequestURI, Response)
				Response.SendFile(File.DirInternal & "/ESH/", DecodePath(Request.RequestURI.SubString(1)))
		End Select
	Catch
		Response.Status = 500
		Log("Error serving request: " & LastException)
		Response.SendString("Error serving request: " & LastException)
	End Try
End Sub

Sub HandleMainPage (Response As ServletResponse)
	Dim MainPage As String = GetTemplate("index.html") 'load the template from the assets folder
	MainPage = MainPage.Replace("<u><b>Thanks To The Testers</b></u>","<u><b>Thanks To The Testers</b></u><br><u><b>Thanks Nazky for the APK</b></u>")
	Response.SetContentType("text/html")
	Response.SendString(MainPage)
End Sub

Sub GetFreeSpace As Long
	Dim jo As JavaObject
	jo.InitializeNewInstance("java.io.File", Array(File.DirInternal))
	Return jo.RunMethod("getFreeSpace", Null)
End Sub

Sub HandleUpload (Request As ServletRequest, Response As ServletResponse)
	Dim CurrentPath As String = DecodePath(Request.RequestURI.SubString("/upload/".Length))
	Dim upload As String = Request.GetUploadedFile("upfile")
	'copy the temporary file to the correct folder
	File.Copy(server.TempFolder, upload, CurrentPath, Request.GetParameter("upfile")) 'the file name is sent as a parameter
	File.Delete(server.TempFolder, upload) 'delete the temporary file.
	Response.SendRedirect("/list/" & EncodePath(CurrentPath)) 'redirect to the list page
End Sub

Sub HandleList(Request As ServletRequest, Response As ServletResponse)
	Dim CurrentPath As String = DecodePath(Request.RequestURI.SubString(6)) 'remove /list/
	If CurrentPath = "" Then CurrentPath = File.DirInternal.SubString(1) 'remove the first slash
	Dim listSb As StringBuilder
	listSb.Initialize
	listSb.Append("<ul>Files in ").Append(CurrentPath).Append(":</b><br/>")
	Dim all, files, folders As List
	files.Initialize
	folders.Initialize
	all = File.ListFiles(CurrentPath)
	If all.IsInitialized = False Then
		Response.SendString("Cannot access folder.")
		Return
	End If
	For Each f As String In all
		If File.IsDirectory(CurrentPath, f) Then
			folders.Add(f)
		Else
			files.Add(f)
		End If
	Next
	folders.Add("..") 'up folder
	folders.SortCaseInsensitive(True)
	files.SortCaseInsensitive(True)
	For Each f As String In folders
		listSb.Append("<li>")
		listSb.Append("<a href='/list/").Append(EncodePath(File.Combine(CurrentPath, f))).Append("/'>").Append(f).Append("</a>")
		listSb.Append("</li>")
	Next
	For Each f As String In files
		listSb.Append("<li>")
		listSb.Append(f).Append(" (").Append("<a href='/download/").Append(EncodePath(File.Combine(CurrentPath, f))).Append("'>View</a>)")
		listSb.Append("</li>")
	Next
	listSb.Append("</ul>")
	Dim listPage As String = GetTemplate("list_template.html")
	listPage = listPage.Replace("$UPLOADACTION$", "/upload/" & EncodePath(CurrentPath))
	listPage = listPage.Replace("$LIST$", listSb)
	Response.SetContentType("text/html")
	Response.SendString(listPage)
End Sub

Sub EncodePath(P As String) As String
	Return su.EncodeUrl(P, "UTF8")
End Sub

Sub DecodePath(S As String) As String
	Return su.DecodeUrl(S, "UTF8")
End Sub

Sub GetTemplate(Name As String) As String
	If templates.ContainsKey(Name) Then Return templates.Get(Name)
	Dim temp As String = File.ReadString(File.DirInternal & "/ESH/", Name)
	templates.Put(Name, temp)
	Return temp
End Sub

Sub SetContentType(FileName As String, Response As ServletResponse)
	Dim extension, ContentType As String
	Dim m As Matcher = Regex.Matcher("\.([^\.]*)$", FileName) 'find the file extension
	If m.Find Then
		extension = m.Group(1).ToLowerCase
		Select extension
			Case "html", "htm"
				ContentType = "text/html"
			Case "js"
				ContentType = "text/javascript"
			Case "gif", "png"
				ContentType = "image/" & extension
			Case "jpeg", "jpg"
				ContentType = "image/jpeg"
			Case "css", "xml"
				ContentType = "text/" & extension
			Case "ico"
				ContentType = "image/vnd.microsoft.icon"
			Case "txt"
				ContentType = "text/plain"
			Case Else
				ContentType = "application/octet-stream"
		End Select
		Response.SetContentType(ContentType)
	End If
End Sub


Sub Service_Destroy
	server.Stop
	Service.StopForeground(1)
End Sub
