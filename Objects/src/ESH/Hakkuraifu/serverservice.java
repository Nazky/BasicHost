package ESH.Hakkuraifu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class serverservice extends  android.app.Service{
	public static class serverservice_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (serverservice) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, serverservice.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, BA.class);
		}

	}
    static serverservice mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return serverservice.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "ESH.Hakkuraifu", "ESH.Hakkuraifu.serverservice");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "ESH.Hakkuraifu.serverservice", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (serverservice) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (serverservice) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (serverservice) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (serverservice) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (serverservice) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.HttpServer _vvvvvvvvvvvvvvvvvvvvvv7 = null;
public static anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvv4 = null;
public static anywheresoftware.b4a.objects.StringUtils _vvvvvvvvvvvvvvvvvvvvv0 = null;
public static int _v5 = 0;
public static String _v6 = "";
public static anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _v7 = null;
public ESH.Hakkuraifu.main _vvv1 = null;
public ESH.Hakkuraifu.starter _vvv2 = null;
public ESH.Hakkuraifu.httputils2service _vvv4 = null;
public static String  _vvvvvvvvvvvvvvvvvvvvv7(String _s) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub DecodePath(S As String) As String";
 //BA.debugLineNum = 132;BA.debugLine="Return su.DecodeUrl(S, \"UTF8\")";
if (true) return _vvvvvvvvvvvvvvvvvvvvv0.DecodeUrl(_s,"UTF8");
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvv1(String _p) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub EncodePath(P As String) As String";
 //BA.debugLineNum = 128;BA.debugLine="Return su.EncodeUrl(P, \"UTF8\")";
if (true) return _vvvvvvvvvvvvvvvvvvvvv0.EncodeUrl(_p,"UTF8");
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public static long  _vvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub GetFreeSpace As Long";
 //BA.debugLineNum = 71;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 72;BA.debugLine="jo.InitializeNewInstance(\"java.io.File\", Array(Fi";
_jo.InitializeNewInstance("java.io.File",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.File.getDirInternal())});
 //BA.debugLineNum = 73;BA.debugLine="Return jo.RunMethod(\"getFreeSpace\", Null)";
if (true) return BA.ObjectToLongNumber(_jo.RunMethod("getFreeSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return 0L;
}
public static String  _vvvvvvvvvvvvvvvvvvvvvv3(String _name) throws Exception{
String _temp = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub GetTemplate(Name As String) As String";
 //BA.debugLineNum = 136;BA.debugLine="If templates.ContainsKey(Name) Then Return templa";
if (_vvvvvvvvvvvvvvvvvvvvvv4.ContainsKey((Object)(_name))) { 
if (true) return BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvv4.Get((Object)(_name)));};
 //BA.debugLineNum = 137;BA.debugLine="Dim temp As String = File.ReadString(File.DirInte";
_temp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal()+"/ESH/",_name);
 //BA.debugLineNum = 138;BA.debugLine="templates.Put(Name, temp)";
_vvvvvvvvvvvvvvvvvvvvvv4.Put((Object)(_name),(Object)(_temp));
 //BA.debugLineNum = 139;BA.debugLine="Return temp";
if (true) return _temp;
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvv4(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper _request,anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper _response) throws Exception{
String _currentpath = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _listsb = null;
anywheresoftware.b4a.objects.collections.List _all = null;
anywheresoftware.b4a.objects.collections.List _files = null;
anywheresoftware.b4a.objects.collections.List _folders = null;
String _f = "";
String _listpage = "";
 //BA.debugLineNum = 85;BA.debugLine="Sub HandleList(Request As ServletRequest, Response";
 //BA.debugLineNum = 86;BA.debugLine="Dim CurrentPath As String = DecodePath(Request.Re";
_currentpath = _vvvvvvvvvvvvvvvvvvvvv7(_request.getRequestURI().substring((int) (6)));
 //BA.debugLineNum = 87;BA.debugLine="If CurrentPath = \"\" Then CurrentPath = File.DirIn";
if ((_currentpath).equals("")) { 
_currentpath = anywheresoftware.b4a.keywords.Common.File.getDirInternal().substring((int) (1));};
 //BA.debugLineNum = 88;BA.debugLine="Dim listSb As StringBuilder";
_listsb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 89;BA.debugLine="listSb.Initialize";
_listsb.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="listSb.Append(\"<ul>Files in \").Append(CurrentPath";
_listsb.Append("<ul>Files in ").Append(_currentpath).Append(":</b><br/>");
 //BA.debugLineNum = 91;BA.debugLine="Dim all, files, folders As List";
_all = new anywheresoftware.b4a.objects.collections.List();
_files = new anywheresoftware.b4a.objects.collections.List();
_folders = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 92;BA.debugLine="files.Initialize";
_files.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="folders.Initialize";
_folders.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="all = File.ListFiles(CurrentPath)";
_all = anywheresoftware.b4a.keywords.Common.File.ListFiles(_currentpath);
 //BA.debugLineNum = 95;BA.debugLine="If all.IsInitialized = False Then";
if (_all.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 96;BA.debugLine="Response.SendString(\"Cannot access folder.\")";
_response.SendString("Cannot access folder.");
 //BA.debugLineNum = 97;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 99;BA.debugLine="For Each f As String In all";
{
final anywheresoftware.b4a.BA.IterableList group14 = _all;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_f = BA.ObjectToString(group14.Get(index14));
 //BA.debugLineNum = 100;BA.debugLine="If File.IsDirectory(CurrentPath, f) Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_currentpath,_f)) { 
 //BA.debugLineNum = 101;BA.debugLine="folders.Add(f)";
_folders.Add((Object)(_f));
 }else {
 //BA.debugLineNum = 103;BA.debugLine="files.Add(f)";
_files.Add((Object)(_f));
 };
 }
};
 //BA.debugLineNum = 106;BA.debugLine="folders.Add(\"..\") 'up folder";
_folders.Add((Object)(".."));
 //BA.debugLineNum = 107;BA.debugLine="folders.SortCaseInsensitive(True)";
_folders.SortCaseInsensitive(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 108;BA.debugLine="files.SortCaseInsensitive(True)";
_files.SortCaseInsensitive(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 109;BA.debugLine="For Each f As String In folders";
{
final anywheresoftware.b4a.BA.IterableList group24 = _folders;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_f = BA.ObjectToString(group24.Get(index24));
 //BA.debugLineNum = 110;BA.debugLine="listSb.Append(\"<li>\")";
_listsb.Append("<li>");
 //BA.debugLineNum = 111;BA.debugLine="listSb.Append(\"<a href='/list/\").Append(EncodePa";
_listsb.Append("<a href='/list/").Append(_vvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.keywords.Common.File.Combine(_currentpath,_f))).Append("/'>").Append(_f).Append("</a>");
 //BA.debugLineNum = 112;BA.debugLine="listSb.Append(\"</li>\")";
_listsb.Append("</li>");
 }
};
 //BA.debugLineNum = 114;BA.debugLine="For Each f As String In files";
{
final anywheresoftware.b4a.BA.IterableList group29 = _files;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_f = BA.ObjectToString(group29.Get(index29));
 //BA.debugLineNum = 115;BA.debugLine="listSb.Append(\"<li>\")";
_listsb.Append("<li>");
 //BA.debugLineNum = 116;BA.debugLine="listSb.Append(f).Append(\" (\").Append(\"<a href='/";
_listsb.Append(_f).Append(" (").Append("<a href='/download/").Append(_vvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.keywords.Common.File.Combine(_currentpath,_f))).Append("'>View</a>)");
 //BA.debugLineNum = 117;BA.debugLine="listSb.Append(\"</li>\")";
_listsb.Append("</li>");
 }
};
 //BA.debugLineNum = 119;BA.debugLine="listSb.Append(\"</ul>\")";
_listsb.Append("</ul>");
 //BA.debugLineNum = 120;BA.debugLine="Dim listPage As String = GetTemplate(\"list_templa";
_listpage = _vvvvvvvvvvvvvvvvvvvvvv3("list_template.html");
 //BA.debugLineNum = 121;BA.debugLine="listPage = listPage.Replace(\"$UPLOADACTION$\", \"/u";
_listpage = _listpage.replace("$UPLOADACTION$","/upload/"+_vvvvvvvvvvvvvvvvvvvvvv1(_currentpath));
 //BA.debugLineNum = 122;BA.debugLine="listPage = listPage.Replace(\"$LIST$\", listSb)";
_listpage = _listpage.replace("$LIST$",BA.ObjectToString(_listsb));
 //BA.debugLineNum = 123;BA.debugLine="Response.SetContentType(\"text/html\")";
_response.SetContentType("text/html");
 //BA.debugLineNum = 124;BA.debugLine="Response.SendString(listPage)";
_response.SendString(_listpage);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper _response) throws Exception{
String _mainpage = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub HandleMainPage (Response As ServletResponse)";
 //BA.debugLineNum = 64;BA.debugLine="Dim MainPage As String = GetTemplate(\"index.html\"";
_mainpage = _vvvvvvvvvvvvvvvvvvvvvv3("index.html");
 //BA.debugLineNum = 65;BA.debugLine="MainPage = MainPage.Replace(\"<u><b>Thanks To The";
_mainpage = _mainpage.replace("<u><b>Thanks To The Testers</b></u>","<u><b>Thanks To The Testers</b></u><br><u><b>Thanks Nazky for the APK</b></u>");
 //BA.debugLineNum = 66;BA.debugLine="Response.SetContentType(\"text/html\")";
_response.SetContentType("text/html");
 //BA.debugLineNum = 67;BA.debugLine="Response.SendString(MainPage)";
_response.SendString(_mainpage);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper _request,anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper _response) throws Exception{
String _currentpath = "";
String _upload = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub HandleUpload (Request As ServletRequest, Respo";
 //BA.debugLineNum = 77;BA.debugLine="Dim CurrentPath As String = DecodePath(Request.Re";
_currentpath = _vvvvvvvvvvvvvvvvvvvvv7(_request.getRequestURI().substring("/upload/".length()));
 //BA.debugLineNum = 78;BA.debugLine="Dim upload As String = Request.GetUploadedFile(\"u";
_upload = _request.GetUploadedFile("upfile");
 //BA.debugLineNum = 80;BA.debugLine="File.Copy(server.TempFolder, upload, CurrentPath,";
anywheresoftware.b4a.keywords.Common.File.Copy(_vvvvvvvvvvvvvvvvvvvvvv7.TempFolder,_upload,_currentpath,_request.GetParameter("upfile"));
 //BA.debugLineNum = 81;BA.debugLine="File.Delete(server.TempFolder, upload) 'delete th";
anywheresoftware.b4a.keywords.Common.File.Delete(_vvvvvvvvvvvvvvvvvvvvvv7.TempFolder,_upload);
 //BA.debugLineNum = 82;BA.debugLine="Response.SendRedirect(\"/list/\" & EncodePath(Curre";
_response.SendRedirect("/list/"+_vvvvvvvvvvvvvvvvvvvvvv1(_currentpath));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private server As HttpServer";
_vvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.HttpServer();
 //BA.debugLineNum = 7;BA.debugLine="Private templates As Map";
_vvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private su As StringUtils";
_vvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 9;BA.debugLine="Public port As Int = 8080";
_v5 = (int) (8080);
 //BA.debugLineNum = 10;BA.debugLine="Public greeting As String";
_v6 = "";
 //BA.debugLineNum = 11;BA.debugLine="Dim ssocket As ServerSocket";
_v7 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public static String  _server_handlerequest(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper _request,anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper _response) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Server_HandleRequest (Request As ServletReques";
 //BA.debugLineNum = 32;BA.debugLine="Try";
try { //BA.debugLineNum = 33;BA.debugLine="Log(\"Client: \" & Request.RemoteAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("61114114","Client: "+_request.getRemoteAddress(),0);
 //BA.debugLineNum = 34;BA.debugLine="Log(Request.RequestURI) 'handle the request base";
anywheresoftware.b4a.keywords.Common.LogImpl("61114115",_request.getRequestURI(),0);
 //BA.debugLineNum = 35;BA.debugLine="CallSubDelayed2(Main,\"logs\",Request.RequestURI)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._vvv1.getObject()),"logs",(Object)(_request.getRequestURI()));
 //BA.debugLineNum = 36;BA.debugLine="Select True";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.True,(_request.getRequestURI()).equals("/"),_request.getRequestURI().startsWith("/list/"),_request.getRequestURI().startsWith("/pkg/"),_request.getRequestURI().startsWith("/upload/"),_request.getRequestURI().contains("/Jailbreak/9.00/index.html"))) {
case 0: {
 //BA.debugLineNum = 38;BA.debugLine="HandleMainPage (Response)";
_vvvvvvvvvvvvvvvvvvvvvv5(_response);
 break; }
case 1: {
 //BA.debugLineNum = 40;BA.debugLine="HandleList (Request, Response)";
_vvvvvvv4(_request,_response);
 break; }
case 2: {
 //BA.debugLineNum = 42;BA.debugLine="SetContentType(Request.RequestURI, Response)";
_vvvvvvvvvvvvvvvvvvvvvv0(_request.getRequestURI(),_response);
 //BA.debugLineNum = 43;BA.debugLine="Response.SendFile(File.DirInternal & \"/ESH/pkg";
_response.SendFile(anywheresoftware.b4a.keywords.Common.File.getDirInternal()+"/ESH/pkg",_vvvvvvvvvvvvvvvvvvvvv7(_request.getRequestURI().substring((int) (5))));
 break; }
case 3: {
 //BA.debugLineNum = 45;BA.debugLine="HandleUpload(Request, Response)";
_vvvvvvvvvvvvvvvvvvvvvv6(_request,_response);
 break; }
case 4: {
 //BA.debugLineNum = 47;BA.debugLine="SetContentType(Request.RequestURI, Response)";
_vvvvvvvvvvvvvvvvvvvvvv0(_request.getRequestURI(),_response);
 //BA.debugLineNum = 48;BA.debugLine="Response.SendFile(File.DirInternal & \"/ESH/\",";
_response.SendFile(anywheresoftware.b4a.keywords.Common.File.getDirInternal()+"/ESH/",_vvvvvvvvvvvvvvvvvvvvv7(_request.getRequestURI().substring((int) (1))));
 //BA.debugLineNum = 49;BA.debugLine="Main.csu.RemoveCallsToSub(\"JB900\")";
mostCurrent._vvv1._vv1 /*ESH.Hakkuraifu.callsubutils*/ ._vv7 /*String*/ ("JB900");
 //BA.debugLineNum = 50;BA.debugLine="Main.csu.CallSubDelayedPlus(Main,\"JB900\",25000";
mostCurrent._vvv1._vv1 /*ESH.Hakkuraifu.callsubutils*/ ._vv2 /*String*/ ((Object)(mostCurrent._vvv1.getObject()),"JB900",(int) (25000));
 break; }
default: {
 //BA.debugLineNum = 53;BA.debugLine="SetContentType(Request.RequestURI, Response)";
_vvvvvvvvvvvvvvvvvvvvvv0(_request.getRequestURI(),_response);
 //BA.debugLineNum = 54;BA.debugLine="Response.SendFile(File.DirInternal & \"/ESH/\",";
_response.SendFile(anywheresoftware.b4a.keywords.Common.File.getDirInternal()+"/ESH/",_vvvvvvvvvvvvvvvvvvvvv7(_request.getRequestURI().substring((int) (1))));
 break; }
}
;
 } 
       catch (Exception e25) {
			processBA.setLastException(e25); //BA.debugLineNum = 57;BA.debugLine="Response.Status = 500";
_response.setStatus((int) (500));
 //BA.debugLineNum = 58;BA.debugLine="Log(\"Error serving request: \" & LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61114139","Error serving request: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 //BA.debugLineNum = 59;BA.debugLine="Response.SendString(\"Error serving request: \" &";
_response.SendString("Error serving request: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
 };
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
anywheresoftware.b4a.objects.NotificationWrapper _n = null;
anywheresoftware.b4a.objects.NotificationWrapper _n2 = null;
 //BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 15;BA.debugLine="server.Initialize(\"Server\")";
_vvvvvvvvvvvvvvvvvvvvvv7.Initialize(processBA,"Server");
 //BA.debugLineNum = 16;BA.debugLine="server.Start(port)";
_vvvvvvvvvvvvvvvvvvvvvv7.Start(_v5);
 //BA.debugLineNum = 17;BA.debugLine="templates.Initialize";
_vvvvvvvvvvvvvvvvvvvvvv4.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="Dim n As Notification";
_n = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim n2 As Notification";
_n2 = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 20;BA.debugLine="n.Initialize2(n.IMPORTANCE_HIGH)";
_n.Initialize2(_n.IMPORTANCE_HIGH);
 //BA.debugLineNum = 21;BA.debugLine="n.Icon = \"icon\"";
_n.setIcon("icon");
 //BA.debugLineNum = 22;BA.debugLine="n.SetInfo(\"Http Server is running\", \"IP : \" & sso";
_n.SetInfoNew(processBA,BA.ObjectToCharSequence("Http Server is running"),BA.ObjectToCharSequence("IP : "+_v7.GetMyIP()+anywheresoftware.b4a.keywords.Common.CRLF+"Port : "+BA.NumberToString(_v5)),(Object)(mostCurrent._vvv1.getObject()));
 //BA.debugLineNum = 23;BA.debugLine="n.Notify(1)";
_n.Notify((int) (1));
 //BA.debugLineNum = 24;BA.debugLine="Service.StartForeground(1, n)";
mostCurrent._service.StartForeground((int) (1),(android.app.Notification)(_n.getObject()));
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 171;BA.debugLine="server.Stop";
_vvvvvvvvvvvvvvvvvvvvvv7.Stop();
 //BA.debugLineNum = 172;BA.debugLine="Service.StopForeground(1)";
mostCurrent._service.StopForeground((int) (1));
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvv0(String _filename,anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper _response) throws Exception{
String _extension = "";
String _contenttype = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 142;BA.debugLine="Sub SetContentType(FileName As String, Response As";
 //BA.debugLineNum = 143;BA.debugLine="Dim extension, ContentType As String";
_extension = "";
_contenttype = "";
 //BA.debugLineNum = 144;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\.([^\\.]*)$\", F";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("\\.([^\\.]*)$",_filename);
 //BA.debugLineNum = 145;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 146;BA.debugLine="extension = m.Group(1).ToLowerCase";
_extension = _m.Group((int) (1)).toLowerCase();
 //BA.debugLineNum = 147;BA.debugLine="Select extension";
switch (BA.switchObjectToInt(_extension,"html","htm","js","gif","png","jpeg","jpg","css","xml","ico","txt")) {
case 0: 
case 1: {
 //BA.debugLineNum = 149;BA.debugLine="ContentType = \"text/html\"";
_contenttype = "text/html";
 break; }
case 2: {
 //BA.debugLineNum = 151;BA.debugLine="ContentType = \"text/javascript\"";
_contenttype = "text/javascript";
 break; }
case 3: 
case 4: {
 //BA.debugLineNum = 153;BA.debugLine="ContentType = \"image/\" & extension";
_contenttype = "image/"+_extension;
 break; }
case 5: 
case 6: {
 //BA.debugLineNum = 155;BA.debugLine="ContentType = \"image/jpeg\"";
_contenttype = "image/jpeg";
 break; }
case 7: 
case 8: {
 //BA.debugLineNum = 157;BA.debugLine="ContentType = \"text/\" & extension";
_contenttype = "text/"+_extension;
 break; }
case 9: {
 //BA.debugLineNum = 159;BA.debugLine="ContentType = \"image/vnd.microsoft.icon\"";
_contenttype = "image/vnd.microsoft.icon";
 break; }
case 10: {
 //BA.debugLineNum = 161;BA.debugLine="ContentType = \"text/plain\"";
_contenttype = "text/plain";
 break; }
default: {
 //BA.debugLineNum = 163;BA.debugLine="ContentType = \"application/octet-stream\"";
_contenttype = "application/octet-stream";
 break; }
}
;
 //BA.debugLineNum = 165;BA.debugLine="Response.SetContentType(ContentType)";
_response.SetContentType(_contenttype);
 };
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
}
