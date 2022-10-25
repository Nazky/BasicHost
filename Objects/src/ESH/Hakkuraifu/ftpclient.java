package ESH.Hakkuraifu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ftpclient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "ESH.Hakkuraifu.ftpclient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ESH.Hakkuraifu.ftpclient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public ESH.Hakkuraifu.ftpserver _vvvvv0 = null;
public int _vvvvvv1 = 0;
public ESH.Hakkuraifu.ftpasyncstreamstext _vvvvvv2 = null;
public ESH.Hakkuraifu.ftpserver._ftpuser _vvvvvv3 = null;
public boolean _vvvvvv4 = false;
public String _vvvvvv5 = "";
public ESH.Hakkuraifu.ftpdataconnection _vvvvvv6 = null;
public boolean _vvvvvv7 = false;
public anywheresoftware.b4a.objects.Timer _vvvvvv0 = null;
public long _vvvvvvv1 = 0L;
public String _vvvvvvv2 = "";
public int _timeout_minutes = 0;
public ESH.Hakkuraifu.main _vvv1 = null;
public ESH.Hakkuraifu.starter _vvv2 = null;
public ESH.Hakkuraifu.serverservice _vvv3 = null;
public ESH.Hakkuraifu.httputils2service _vvv4 = null;
public static class _ftptask{
public boolean IsInitialized;
public String Path;
public String Command;
public void Initialize() {
IsInitialized = true;
Path = "";
Command = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _ast_newtext(String _text) throws Exception{
int _i = 0;
 //BA.debugLineNum = 44;BA.debugLine="Private Sub AST_NewText(text As String)";
 //BA.debugLineNum = 45;BA.debugLine="Log(\"client: \" & text)";
__c.LogImpl("92490369","client: "+_text,0);
 //BA.debugLineNum = 46;BA.debugLine="Dim i As Int = text.IndexOf(\" \")";
_i = _text.indexOf(" ");
 //BA.debugLineNum = 47;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
 //BA.debugLineNum = 48;BA.debugLine="HandleClientCommand (text, \"\")";
_vvvvv2(_text,"");
 }else {
 //BA.debugLineNum = 50;BA.debugLine="HandleClientCommand (text.SubString2(0, i), text";
_vvvvv2(_text.substring((int) (0),_i),_text.substring((int) (_i+1)));
 };
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _ast_terminated() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Private Sub AST_Terminated";
 //BA.debugLineNum = 258;BA.debugLine="Log(\"terminated\")";
__c.LogImpl("93211265","terminated",0);
 //BA.debugLineNum = 259;BA.debugLine="CloseConnection";
_vvvv6();
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public String  _vvvv5(String _reldir) throws Exception{
String _dir = "";
 //BA.debugLineNum = 150;BA.debugLine="Private Sub ChangeDir (RelDir As String)";
 //BA.debugLineNum = 151;BA.debugLine="Dim Dir As String = CombineWithCurrent(RelDir)";
_dir = _vvvv0(_reldir);
 //BA.debugLineNum = 152;BA.debugLine="If Dir <> \"\" And File.Exists(mServer.BaseDir, Dir";
if ((_dir).equals("") == false && __c.File.Exists(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_dir) && __c.File.IsDirectory(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_dir)) { 
 //BA.debugLineNum = 153;BA.debugLine="currentPath = Dir";
_vvvvvv5 = _dir;
 //BA.debugLineNum = 154;BA.debugLine="Log(\"CurrentPath: \" & currentPath)";
__c.LogImpl("92686980","CurrentPath: "+_vvvvvv5,0);
 //BA.debugLineNum = 155;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 }else if((_dir).equals("") == false) { 
 //BA.debugLineNum = 157;BA.debugLine="SendResponse (500, \"Invalid path\")";
_sendresponse((int) (500),"Invalid path");
 };
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type FTPTask (Path As String, Command As String)";
;
 //BA.debugLineNum = 4;BA.debugLine="Private mServer As FTPServer";
_vvvvv0 = new ESH.Hakkuraifu.ftpserver();
 //BA.debugLineNum = 5;BA.debugLine="Public mDataPort As Int";
_vvvvvv1 = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private AST As FTPAsyncStreamsText";
_vvvvvv2 = new ESH.Hakkuraifu.ftpasyncstreamstext();
 //BA.debugLineNum = 7;BA.debugLine="Private user As FTPUser";
_vvvvvv3 = new ESH.Hakkuraifu.ftpserver._ftpuser();
 //BA.debugLineNum = 8;BA.debugLine="Private loggedIn As Boolean";
_vvvvvv4 = false;
 //BA.debugLineNum = 9;BA.debugLine="Private currentPath As String";
_vvvvvv5 = "";
 //BA.debugLineNum = 10;BA.debugLine="Private currentDataConnection As FTPDataConnectio";
_vvvvvv6 = new ESH.Hakkuraifu.ftpdataconnection();
 //BA.debugLineNum = 11;BA.debugLine="Private closed As Boolean";
_vvvvvv7 = false;
 //BA.debugLineNum = 12;BA.debugLine="Private timeout As Timer";
_vvvvvv0 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 13;BA.debugLine="Private lastCommand As Long";
_vvvvvvv1 = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Private RenameFrom As String";
_vvvvvvv2 = "";
 //BA.debugLineNum = 15;BA.debugLine="Private Const TIMEOUT_MINUTES As Int = 5";
_timeout_minutes = (int) (5);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _vvvv6() throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Public Sub CloseConnection";
 //BA.debugLineNum = 249;BA.debugLine="If closed Then Return";
if (_vvvvvv7) { 
if (true) return "";};
 //BA.debugLineNum = 250;BA.debugLine="AST.Close";
_vvvvvv2._vvv5 /*String*/ ();
 //BA.debugLineNum = 251;BA.debugLine="CloseDataConnection";
_vvvv7();
 //BA.debugLineNum = 252;BA.debugLine="mServer.ClientClosed(Me)";
_vvvvv0._vvvvvvvvv1 /*String*/ ((ESH.Hakkuraifu.ftpclient)(this));
 //BA.debugLineNum = 253;BA.debugLine="timeout.Enabled = False";
_vvvvvv0.setEnabled(__c.False);
 //BA.debugLineNum = 254;BA.debugLine="closed = True";
_vvvvvv7 = __c.True;
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _vvvv7() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Private Sub CloseDataConnection";
 //BA.debugLineNum = 243;BA.debugLine="If currentDataConnection <> Null And currentDataC";
if (_vvvvvv6!= null && _vvvvvv6.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 244;BA.debugLine="currentDataConnection.Close";
_vvvvvv6._vvv5 /*String*/ ();
 };
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _vvvv0(String _rel) throws Exception{
String _dir = "";
String _res = "";
 //BA.debugLineNum = 139;BA.debugLine="Private Sub CombineWithCurrent (Rel As String) As";
 //BA.debugLineNum = 140;BA.debugLine="Rel = Rel.Replace(\"\\\", \"/\")";
_rel = _rel.replace("\\","/");
 //BA.debugLineNum = 141;BA.debugLine="Dim Dir As String";
_dir = "";
 //BA.debugLineNum = 142;BA.debugLine="If Rel.StartsWith(\"/\") Then Dir = Rel Else Dir =";
if (_rel.startsWith("/")) { 
_dir = _rel;}
else {
_dir = __c.File.Combine(_vvvvvv5,_rel);};
 //BA.debugLineNum = 143;BA.debugLine="Dim res As String = NormalizePath(Dir)";
_res = _vvvvv4(_dir);
 //BA.debugLineNum = 144;BA.debugLine="If res = \"\" Then";
if ((_res).equals("")) { 
 //BA.debugLineNum = 145;BA.debugLine="SendResponse(500, \"Invalid path\")";
_sendresponse((int) (500),"Invalid path");
 };
 //BA.debugLineNum = 147;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv1(int _code,String _msg) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Private Sub Error (code As Int, msg As String)";
 //BA.debugLineNum = 237;BA.debugLine="SendResponse(code, msg)";
_sendresponse(_code,_msg);
 //BA.debugLineNum = 238;BA.debugLine="Log(\"Error: \" & msg)";
__c.LogImpl("93014658","Error: "+_msg,0);
 //BA.debugLineNum = 239;BA.debugLine="AST.CloseGracefully";
_vvvvvv2._vvv6 /*String*/ ();
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv2(String _command,String _parameters) throws Exception{
String _p = "";
String _ip = "";
String _filetodownload = "";
String _filetoupload = "";
String _folder = "";
String _renameto = "";
String _deletefile = "";
 //BA.debugLineNum = 55;BA.debugLine="Private Sub HandleClientCommand(command As String,";
 //BA.debugLineNum = 56;BA.debugLine="lastCommand = DateTime.Now";
_vvvvvvv1 = __c.DateTime.getNow();
 //BA.debugLineNum = 57;BA.debugLine="Try";
try { //BA.debugLineNum = 58;BA.debugLine="If loggedIn = False Then";
if (_vvvvvv4==__c.False) { 
 //BA.debugLineNum = 59;BA.debugLine="Select command.ToUpperCase";
switch (BA.switchObjectToInt(_command.toUpperCase(),"USER","PASS")) {
case 0: {
 //BA.debugLineNum = 61;BA.debugLine="user.Name = parameters";
_vvvvvv3.Name /*String*/  = _parameters;
 //BA.debugLineNum = 62;BA.debugLine="SendResponse(331, \"\")";
_sendresponse((int) (331),"");
 break; }
case 1: {
 //BA.debugLineNum = 64;BA.debugLine="user.Password = parameters";
_vvvvvv3.Password /*String*/  = _parameters;
 //BA.debugLineNum = 65;BA.debugLine="HandleCredentials";
_vvvvv3();
 break; }
default: {
 //BA.debugLineNum = 67;BA.debugLine="SendResponse(451, \"Not logged in\")";
_sendresponse((int) (451),"Not logged in");
 break; }
}
;
 }else {
 //BA.debugLineNum = 70;BA.debugLine="Select command.ToUpperCase";
switch (BA.switchObjectToInt(_command.toUpperCase(),"SYST","PWD","PASV","EPSV","CWD","LIST","RETR","CDUP","STOR","TYPE","QUIT","MKD","RNFR","RNTO","DELE","RMD","NOOP","FEAT")) {
case 0: {
 //BA.debugLineNum = 72;BA.debugLine="SendResponse(215, \"UNIX\")";
_sendresponse((int) (215),"UNIX");
 break; }
case 1: {
 //BA.debugLineNum = 74;BA.debugLine="Dim p As String = currentPath";
_p = _vvvvvv5;
 //BA.debugLineNum = 75;BA.debugLine="SendResponse (257, $\"\"${p}\"\"$)";
_sendresponse((int) (257),("\""+__c.SmartStringFormatter("",(Object)(_p))+"\""));
 break; }
case 2: {
 //BA.debugLineNum = 77;BA.debugLine="PrepareDataConnection";
_vvvvv5();
 //BA.debugLineNum = 78;BA.debugLine="Dim ip As String";
_ip = "";
 //BA.debugLineNum = 79;BA.debugLine="If mServer.ForcedServerIp <> \"\" Then ip = mSe";
if ((_vvvvv0._vvvvvvvvvvv1 /*String*/ ).equals("") == false) { 
_ip = _vvvvv0._vvvvvvvvvvv1 /*String*/ ;}
else {
_ip = _vvvvv0._v7 /*anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper*/ .GetMyIP();};
 //BA.debugLineNum = 80;BA.debugLine="SendResponse (227, ip.Replace(\".\", \",\") & \",\"";
_sendresponse((int) (227),_ip.replace(".",",")+","+BA.NumberToString(__c.Floor(_vvvvvv1/(double)256))+","+BA.NumberToString((_vvvvvv1%256)));
 break; }
case 3: {
 //BA.debugLineNum = 82;BA.debugLine="PrepareDataConnection";
_vvvvv5();
 //BA.debugLineNum = 83;BA.debugLine="SendResponse (229, $\"Entering Extended Passiv";
_sendresponse((int) (229),("Entering Extended Passive Mode (|||"+__c.SmartStringFormatter("",(Object)(_vvvvvv1))+"|)"));
 break; }
case 4: {
 //BA.debugLineNum = 85;BA.debugLine="ChangeDir(parameters)";
_vvvv5(_parameters);
 break; }
case 5: {
 //BA.debugLineNum = 87;BA.debugLine="SetCurrentTask(currentPath, \"LIST\")";
_vvvvv7(_vvvvvv5,"LIST");
 break; }
case 6: {
 //BA.debugLineNum = 89;BA.debugLine="Dim FileToDownload As String = CombineWithCur";
_filetodownload = _vvvv0(_parameters);
 //BA.debugLineNum = 90;BA.debugLine="If FileToDownload <> \"\" Then SetCurrentTask(F";
if ((_filetodownload).equals("") == false) { 
_vvvvv7(_filetodownload,"RETR");};
 break; }
case 7: {
 //BA.debugLineNum = 92;BA.debugLine="ChangeDir(\"..\")";
_vvvv5("..");
 break; }
case 8: {
 //BA.debugLineNum = 94;BA.debugLine="Dim FileToUpload As String = CombineWithCurre";
_filetoupload = _vvvv0(_parameters);
 //BA.debugLineNum = 95;BA.debugLine="If FileToUpload <> \"\" Then SetCurrentTask(Fil";
if ((_filetoupload).equals("") == false) { 
_vvvvv7(_filetoupload,"STOR");};
 break; }
case 9: {
 //BA.debugLineNum = 98;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 break; }
case 10: {
 //BA.debugLineNum = 100;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 //BA.debugLineNum = 101;BA.debugLine="CloseConnection";
_vvvv6();
 break; }
case 11: {
 //BA.debugLineNum = 103;BA.debugLine="Dim folder As String = CombineWithCurrent(par";
_folder = _vvvv0(_parameters);
 //BA.debugLineNum = 104;BA.debugLine="If folder <> \"\" Then";
if ((_folder).equals("") == false) { 
 //BA.debugLineNum = 105;BA.debugLine="File.MakeDir(mServer.BaseDir, folder)";
__c.File.MakeDir(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_folder);
 //BA.debugLineNum = 106;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 };
 break; }
case 12: {
 //BA.debugLineNum = 110;BA.debugLine="RenameFrom = CombineWithCurrent(parameters)";
_vvvvvvv2 = _vvvv0(_parameters);
 //BA.debugLineNum = 111;BA.debugLine="If RenameFrom <> \"\" Then SendResponse(300, \"\"";
if ((_vvvvvvv2).equals("") == false) { 
_sendresponse((int) (300),"");};
 break; }
case 13: {
 //BA.debugLineNum = 113;BA.debugLine="Dim RenameTo As String = CombineWithCurrent(p";
_renameto = _vvvv0(_parameters);
 //BA.debugLineNum = 114;BA.debugLine="If RenameFrom <> \"\" And RenameTo <> \"\" Then";
if ((_vvvvvvv2).equals("") == false && (_renameto).equals("") == false) { 
 //BA.debugLineNum = 115;BA.debugLine="RenameFile(File.Combine(mServer.BaseDir, Ren";
_vvvvv6(__c.File.Combine(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_vvvvvvv2),__c.File.Combine(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_renameto));
 //BA.debugLineNum = 116;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 };
 break; }
case 14: 
case 15: {
 //BA.debugLineNum = 119;BA.debugLine="Dim DeleteFile As String = CombineWithCurrent";
_deletefile = _vvvv0(_parameters);
 //BA.debugLineNum = 120;BA.debugLine="If DeleteFile <> \"\" Then";
if ((_deletefile).equals("") == false) { 
 //BA.debugLineNum = 121;BA.debugLine="If File.Delete(mServer.BaseDir, DeleteFile)";
if (__c.File.Delete(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_deletefile)) { 
_sendresponse((int) (200),"");}
else {
_sendresponse((int) (500),"");};
 };
 break; }
case 16: {
 //BA.debugLineNum = 124;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 break; }
case 17: {
 //BA.debugLineNum = 126;BA.debugLine="AST.Write(\"211-Features:\" & mServer.EOL)";
_vvvvvv2._vvv7 /*String*/ ("211-Features:"+_vvvvv0._vvvvvvvvvv3 /*String*/ );
 //BA.debugLineNum = 127;BA.debugLine="AST.Write(\"UTF8\" & mServer.EOL)";
_vvvvvv2._vvv7 /*String*/ ("UTF8"+_vvvvv0._vvvvvvvvvv3 /*String*/ );
 //BA.debugLineNum = 128;BA.debugLine="SendResponse(211, \"End\")";
_sendresponse((int) (211),"End");
 break; }
default: {
 //BA.debugLineNum = 130;BA.debugLine="SendResponse(500, \"Unknown command: \" & comma";
_sendresponse((int) (500),"Unknown command: "+_command);
 break; }
}
;
 };
 } 
       catch (Exception e77) {
			ba.setLastException(e77); //BA.debugLineNum = 134;BA.debugLine="Log(LastException)";
__c.LogImpl("92555983",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 135;BA.debugLine="SendResponse(500, \"Error: \" & LastException.Mess";
_sendresponse((int) (500),"Error: "+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv3() throws Exception{
ESH.Hakkuraifu.ftpserver._ftpuser _u = null;
 //BA.debugLineNum = 178;BA.debugLine="Private Sub HandleCredentials";
 //BA.debugLineNum = 179;BA.debugLine="If mServer.Users.ContainsKey(user.Name) Then";
if (_vvvvv0._vvvvvvvvvv5 /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vvvvvv3.Name /*String*/ ))) { 
 //BA.debugLineNum = 180;BA.debugLine="Dim u As FTPUser = mServer.Users.Get(user.Name)";
_u = (ESH.Hakkuraifu.ftpserver._ftpuser)(_vvvvv0._vvvvvvvvvv5 /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vvvvvv3.Name /*String*/ )));
 //BA.debugLineNum = 181;BA.debugLine="If u.Password = user.Password Or u.Name = \"anony";
if ((_u.Password /*String*/ ).equals(_vvvvvv3.Password /*String*/ ) || (_u.Name /*String*/ ).equals("anonymous")) { 
 //BA.debugLineNum = 182;BA.debugLine="user = u";
_vvvvvv3 = _u;
 //BA.debugLineNum = 183;BA.debugLine="loggedIn = True";
_vvvvvv4 = __c.True;
 //BA.debugLineNum = 184;BA.debugLine="SendResponse(230, \"\")";
_sendresponse((int) (230),"");
 //BA.debugLineNum = 185;BA.debugLine="Log(\"User logged in: \" & user.Name)";
__c.LogImpl("92883591","User logged in: "+_vvvvvv3.Name /*String*/ ,0);
 //BA.debugLineNum = 186;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 189;BA.debugLine="Error(530, \"Invalid username or password.\")";
_vvvvv1((int) (530),"Invalid username or password.");
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,ESH.Hakkuraifu.ftpserver _server,anywheresoftware.b4a.objects.SocketWrapper _socket,int _dataport) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (server As FTPServer, socket";
 //BA.debugLineNum = 20;BA.debugLine="mServer = server";
_vvvvv0 = _server;
 //BA.debugLineNum = 21;BA.debugLine="mDataPort = DataPort";
_vvvvvv1 = _dataport;
 //BA.debugLineNum = 22;BA.debugLine="AST.Initialize(Me, \"ast\", socket.InputStream, soc";
_vvvvvv2._initialize /*String*/ (ba,this,"ast",(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(_socket.getInputStream())),(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper(), (java.io.OutputStream)(_socket.getOutputStream())));
 //BA.debugLineNum = 23;BA.debugLine="SendResponse(220, \"B4X FTP Server\")";
_sendresponse((int) (220),"B4X FTP Server");
 //BA.debugLineNum = 24;BA.debugLine="currentPath = \"/\"";
_vvvvvv5 = "/";
 //BA.debugLineNum = 25;BA.debugLine="timeout.Initialize(\"timeout\", 10000)";
_vvvvvv0.Initialize(ba,"timeout",(long) (10000));
 //BA.debugLineNum = 26;BA.debugLine="timeout.Enabled = True";
_vvvvvv0.setEnabled(__c.True);
 //BA.debugLineNum = 27;BA.debugLine="If DataPort <= 0 Then";
if (_dataport<=0) { 
 //BA.debugLineNum = 28;BA.debugLine="Error(500, \"Data ports not available.\")";
_vvvvv1((int) (500),"Data ports not available.");
 //BA.debugLineNum = 29;BA.debugLine="CloseConnection";
_vvvv6();
 };
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv4(String _p) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
String _canonicalpath = "";
String _r = "";
 //BA.debugLineNum = 192;BA.debugLine="Private Sub NormalizePath(p As String) As String";
 //BA.debugLineNum = 193;BA.debugLine="If p.StartsWith(\"/\") Or p.StartsWith(\"\\\") Then p";
if (_p.startsWith("/") || _p.startsWith("\\")) { 
_p = _p.substring((int) (1));};
 //BA.debugLineNum = 196;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 197;BA.debugLine="jo.InitializeNewInstance(\"java.io.File\", Array(Fi";
_jo.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_p))});
 //BA.debugLineNum = 198;BA.debugLine="Dim CanonicalPath As String = jo.RunMethod(\"getCa";
_canonicalpath = BA.ObjectToString(_jo.RunMethod("getCanonicalPath",(Object[])(__c.Null)));
 //BA.debugLineNum = 199;BA.debugLine="If CanonicalPath.ToLowerCase.StartsWith(mServer.B";
if (_canonicalpath.toLowerCase().startsWith(_vvvvv0._vvvvvvvvvv6 /*String*/ .toLowerCase())) { 
 //BA.debugLineNum = 200;BA.debugLine="Dim r As String = CanonicalPath.SubString(mServe";
_r = _canonicalpath.substring(_vvvvv0._vvvvvvvvvv6 /*String*/ .length()).replace("\\","/");
 //BA.debugLineNum = 201;BA.debugLine="If r.Length = 0 Then Return \"/\" Else Return r";
if (_r.length()==0) { 
if (true) return "/";}
else {
if (true) return _r;};
 }else {
 //BA.debugLineNum = 203;BA.debugLine="SendResponse(450, \"Invalid path: \" & p)";
_sendresponse((int) (450),"Invalid path: "+_p);
 //BA.debugLineNum = 204;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv5() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Private Sub PrepareDataConnection";
 //BA.debugLineNum = 163;BA.debugLine="CloseDataConnection";
_vvvv7();
 //BA.debugLineNum = 164;BA.debugLine="Dim currentDataConnection As FTPDataConnection";
_vvvvvv6 = new ESH.Hakkuraifu.ftpdataconnection();
 //BA.debugLineNum = 165;BA.debugLine="currentDataConnection.Initialize(Me, mServer, mDa";
_vvvvvv6._initialize /*String*/ (ba,(ESH.Hakkuraifu.ftpclient)(this),_vvvvv0,_vvvvvv1);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv6(String _source,String _target) throws Exception{
anywheresoftware.b4j.object.JavaObject _jofilesource = null;
anywheresoftware.b4j.object.JavaObject _jofiletarget = null;
 //BA.debugLineNum = 263;BA.debugLine="Private Sub RenameFile(source As String, target As";
 //BA.debugLineNum = 265;BA.debugLine="Dim joFileSource As JavaObject";
_jofilesource = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 266;BA.debugLine="Dim joFileTarget As JavaObject";
_jofiletarget = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 267;BA.debugLine="joFileSource.InitializeNewInstance(\"java.io.File\"";
_jofilesource.InitializeNewInstance("java.io.File",new Object[]{(Object)(_source)});
 //BA.debugLineNum = 268;BA.debugLine="joFileTarget.InitializeNewInstance(\"java.io.File\"";
_jofiletarget.InitializeNewInstance("java.io.File",new Object[]{(Object)(_target)});
 //BA.debugLineNum = 269;BA.debugLine="joFileSource.RunMethod(\"renameTo\", Array(joFileTa";
_jofilesource.RunMethod("renameTo",new Object[]{(Object)(_jofiletarget.getObject())});
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public String  _sendresponse(int _code,String _message) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub SendResponse(code As Int, message As St";
 //BA.debugLineNum = 41;BA.debugLine="AST.Write(code & \" \" & message & mServer.EOL)";
_vvvvvv2._vvv7 /*String*/ (BA.NumberToString(_code)+" "+_message+_vvvvv0._vvvvvvvvvv3 /*String*/ );
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv7(String _path,String _command) throws Exception{
ESH.Hakkuraifu.ftpclient._ftptask _currenttask = null;
 //BA.debugLineNum = 168;BA.debugLine="Private Sub SetCurrentTask (Path As String, Comman";
 //BA.debugLineNum = 169;BA.debugLine="Dim currentTask As FTPTask";
_currenttask = new ESH.Hakkuraifu.ftpclient._ftptask();
 //BA.debugLineNum = 170;BA.debugLine="currentTask.Initialize";
_currenttask.Initialize();
 //BA.debugLineNum = 171;BA.debugLine="currentTask.Command = Command";
_currenttask.Command /*String*/  = _command;
 //BA.debugLineNum = 172;BA.debugLine="currentTask.Path = Path";
_currenttask.Path /*String*/  = _path;
 //BA.debugLineNum = 173;BA.debugLine="SendResponse(150, \"\")";
_sendresponse((int) (150),"");
 //BA.debugLineNum = 174;BA.debugLine="currentDataConnection.SetTask(currentTask)";
_vvvvvv6._vvvvvvv6 /*String*/ (_currenttask);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub Timeout_Tick";
 //BA.debugLineNum = 34;BA.debugLine="If DateTime.Now - lastCommand > TIMEOUT_MINUTES *";
if (__c.DateTime.getNow()-_vvvvvvv1>_timeout_minutes*__c.DateTime.TicksPerMinute) { 
 //BA.debugLineNum = 35;BA.debugLine="Log(\"Timeout!!!\")";
__c.LogImpl("92359298","Timeout!!!",0);
 //BA.debugLineNum = 36;BA.debugLine="CloseConnection";
_vvvv6();
 };
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SENDRESPONSE"))
	return _sendresponse(((Number)args[0]).intValue(), (String) args[1]);
return BA.SubDelegator.SubNotFound;
}
}
