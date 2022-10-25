package ESH.Hakkuraifu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ftpdataconnection extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "ESH.Hakkuraifu.ftpdataconnection");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ESH.Hakkuraifu.ftpdataconnection.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public ESH.Hakkuraifu.ftpclient _vvvvvvv7 = null;
public ESH.Hakkuraifu.ftpserver _vvvvv0 = null;
public anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _v7 = null;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _vvvvvvv0 = null;
public ESH.Hakkuraifu.ftpclient._ftptask _vvvvvvvv1 = null;
public String[] _vvvvvvvv2 = null;
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvv3 = null;
public anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _vvvvvvvv4 = null;
public byte[] _vvvvvvvv5 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvvvv6 = null;
public boolean _vvvvvvvv7 = false;
public ESH.Hakkuraifu.main _vvv1 = null;
public ESH.Hakkuraifu.starter _vvv2 = null;
public ESH.Hakkuraifu.serverservice _vvv3 = null;
public ESH.Hakkuraifu.httputils2service _vvv4 = null;
public String  _vvvvvvv3() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Private Sub AfterConnectionAndTask";
 //BA.debugLineNum = 31;BA.debugLine="If mTask.IsInitialized And Connected Then";
if (_vvvvvvvv1.IsInitialized /*boolean*/  && _vvvvvvvv7) { 
 //BA.debugLineNum = 32;BA.debugLine="Try";
try { //BA.debugLineNum = 33;BA.debugLine="Select mTask.Command";
switch (BA.switchObjectToInt(_vvvvvvvv1.Command /*String*/ ,"LIST","RETR","STOR")) {
case 0: {
 //BA.debugLineNum = 35;BA.debugLine="HandleLIST";
_vvvvvvv4();
 break; }
case 1: {
 //BA.debugLineNum = 37;BA.debugLine="FileIn = File.OpenInput(mServer.BaseDir, mTas";
_vvvvvvvv3 = __c.File.OpenInput(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_vvvvvvvv1.Path /*String*/ );
 //BA.debugLineNum = 38;BA.debugLine="RETRTimer.Enabled = True";
_vvvvvvvv6.setEnabled(__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 40;BA.debugLine="FileOut = File.OpenOutput(mServer.BaseDir, mT";
_vvvvvvvv4 = __c.File.OpenOutput(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_vvvvvvvv1.Path /*String*/ ,__c.False);
 break; }
}
;
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 43;BA.debugLine="mClient.SendResponse(451, \"\")";
_vvvvvvv7._sendresponse /*String*/ ((int) (451),"");
 //BA.debugLineNum = 44;BA.debugLine="Close";
_vvv5();
 //BA.debugLineNum = 45;BA.debugLine="Log(LastException)";
__c.LogImpl("93538959",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
 };
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _astream_error() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Private Sub AStream_Error";
 //BA.debugLineNum = 141;BA.debugLine="AStream_Terminated";
_astream_terminated();
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _astream_newdata(byte[] _buffer) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub AStream_NewData (buffer() As Byte)";
 //BA.debugLineNum = 116;BA.debugLine="Try";
try { //BA.debugLineNum = 117;BA.debugLine="FileOut.WriteBytes(buffer, 0, buffer.Length)";
_vvvvvvvv4.WriteBytes(_buffer,(int) (0),_buffer.length);
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 119;BA.debugLine="Log(LastException)";
__c.LogImpl("93866628",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 120;BA.debugLine="Close";
_vvv5();
 };
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _astream_terminated() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Private Sub AStream_Terminated";
 //BA.debugLineNum = 135;BA.debugLine="Log(\"Data connection terminated: \" & mTask.Path)";
__c.LogImpl("93997697","Data connection terminated: "+_vvvvvvvv1.Path /*String*/ ,0);
 //BA.debugLineNum = 136;BA.debugLine="CallSubDelayed3(mClient, \"SendResponse\", 226, \"\")";
__c.CallSubDelayed3(ba,(Object)(_vvvvvvv7),"SendResponse",(Object)(226),(Object)(""));
 //BA.debugLineNum = 137;BA.debugLine="Close";
_vvv5();
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mClient As FTPClient";
_vvvvvvv7 = new ESH.Hakkuraifu.ftpclient();
 //BA.debugLineNum = 4;BA.debugLine="Private mServer As FTPServer";
_vvvvv0 = new ESH.Hakkuraifu.ftpserver();
 //BA.debugLineNum = 5;BA.debugLine="Private ssocket As ServerSocket";
_v7 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private AStream As AsyncStreams";
_vvvvvvv0 = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 7;BA.debugLine="Private mTask As FTPTask";
_vvvvvvvv1 = new ESH.Hakkuraifu.ftpclient._ftptask();
 //BA.debugLineNum = 8;BA.debugLine="Private months() As String = Array As String(\"Jan";
_vvvvvvvv2 = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
 //BA.debugLineNum = 10;BA.debugLine="Private FileIn As InputStream";
_vvvvvvvv3 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private FileOut As OutputStream";
_vvvvvvvv4 = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private FileBuffer(81920) As Byte";
_vvvvvvvv5 = new byte[(int) (81920)];
;
 //BA.debugLineNum = 13;BA.debugLine="Private RETRTimer As Timer";
_vvvvvvvv6 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 14;BA.debugLine="Private Connected As Boolean";
_vvvvvvvv7 = false;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _vvv5() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 125;BA.debugLine="Log(\"DataConnection_Close\")";
__c.LogImpl("93932161","DataConnection_Close",0);
 //BA.debugLineNum = 126;BA.debugLine="Connected = False";
_vvvvvvvv7 = __c.False;
 //BA.debugLineNum = 127;BA.debugLine="If AStream.IsInitialized Then AStream.Close";
if (_vvvvvvv0.IsInitialized()) { 
_vvvvvvv0.Close();};
 //BA.debugLineNum = 128;BA.debugLine="ssocket.Close";
_v7.Close();
 //BA.debugLineNum = 129;BA.debugLine="If FileIn.IsInitialized Then FileIn.Close";
if (_vvvvvvvv3.IsInitialized()) { 
_vvvvvvvv3.Close();};
 //BA.debugLineNum = 130;BA.debugLine="If FileOut.IsInitialized Then FileOut.Close";
if (_vvvvvvvv4.IsInitialized()) { 
_vvvvvvvv4.Close();};
 //BA.debugLineNum = 131;BA.debugLine="RETRTimer.Enabled = False";
_vvvvvvvv6.setEnabled(__c.False);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvv4() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _dir = "";
String _f = "";
String _size = "";
long _date = 0L;
String _day = "";
 //BA.debugLineNum = 78;BA.debugLine="Private Sub HandleLIST";
 //BA.debugLineNum = 79;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 80;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 81;BA.debugLine="Dim dir As String = File.Combine(mServer.BaseDir,";
_dir = __c.File.Combine(_vvvvv0._vvvvvvvvvv6 /*String*/ ,_vvvvvvvv1.Path /*String*/ );
 //BA.debugLineNum = 83;BA.debugLine="For Each f As String In File.ListFiles(dir)";
{
final anywheresoftware.b4a.BA.IterableList group4 = __c.File.ListFiles(_dir);
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_f = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 84;BA.debugLine="If File.IsDirectory(dir, f) Then";
if (__c.File.IsDirectory(_dir,_f)) { 
 //BA.debugLineNum = 85;BA.debugLine="sb.Append(\"drwxr-xr-x 1 owner group \")";
_sb.Append("drwxr-xr-x 1 owner group ");
 }else {
 //BA.debugLineNum = 87;BA.debugLine="sb.Append(\"-rw-r--r-- 1 owner group \")";
_sb.Append("-rw-r--r-- 1 owner group ");
 };
 //BA.debugLineNum = 89;BA.debugLine="Dim size As String = File.Size(dir, f)";
_size = BA.NumberToString(__c.File.Size(_dir,_f));
 //BA.debugLineNum = 90;BA.debugLine="Pad(sb, 13, size).Append(\" \")";
_vvvvvvv5(_sb,(int) (13),_size).Append(" ");
 //BA.debugLineNum = 92;BA.debugLine="Dim date As Long = File.LastModified(dir, f)";
_date = __c.File.LastModified(_dir,_f);
 //BA.debugLineNum = 93;BA.debugLine="sb.Append(months(DateTime.GetMonth(date) - 1)).A";
_sb.Append(_vvvvvvvv2[(int) (__c.DateTime.GetMonth(_date)-1)]).Append(" ");
 //BA.debugLineNum = 94;BA.debugLine="Dim day As String = DateTime.GetDayOfMonth(date)";
_day = BA.NumberToString(__c.DateTime.GetDayOfMonth(_date));
 //BA.debugLineNum = 95;BA.debugLine="Pad(sb, 3, day).Append(\" \")";
_vvvvvvv5(_sb,(int) (3),_day).Append(" ");
 //BA.debugLineNum = 96;BA.debugLine="If DateTime.Now - date > 180 * DateTime.TicksPer";
if (__c.DateTime.getNow()-_date>180*__c.DateTime.TicksPerDay) { 
 //BA.debugLineNum = 97;BA.debugLine="Pad(sb, 5, DateTime.GetYear(date))";
_vvvvvvv5(_sb,(int) (5),BA.NumberToString(__c.DateTime.GetYear(_date)));
 }else {
 //BA.debugLineNum = 99;BA.debugLine="sb.Append($\"$2.0{DateTime.GetHour(date)}:$2.0{D";
_sb.Append((""+__c.SmartStringFormatter("2.0",(Object)(__c.DateTime.GetHour(_date)))+":"+__c.SmartStringFormatter("2.0",(Object)(__c.DateTime.GetHour(_date)))+""));
 };
 //BA.debugLineNum = 101;BA.debugLine="sb.Append(\" \").Append(f).Append(mServer.EOL)";
_sb.Append(" ").Append(_f).Append(_vvvvv0._vvvvvvvvvv3 /*String*/ );
 }
};
 //BA.debugLineNum = 103;BA.debugLine="AStream.Write(sb.ToString.GetBytes(\"UTF8\"))";
_vvvvvvv0.Write(_sb.ToString().getBytes("UTF8"));
 //BA.debugLineNum = 104;BA.debugLine="AStream.SendAllAndClose";
_vvvvvvv0.SendAllAndClose();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,ESH.Hakkuraifu.ftpclient _client,ESH.Hakkuraifu.ftpserver _server,int _port) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (Client As FTPClient, Server";
 //BA.debugLineNum = 18;BA.debugLine="ssocket.Initialize(port, \"ssocket\")";
_v7.Initialize(ba,_port,"ssocket");
 //BA.debugLineNum = 19;BA.debugLine="ssocket.Listen";
_v7.Listen();
 //BA.debugLineNum = 20;BA.debugLine="mClient = Client";
_vvvvvvv7 = _client;
 //BA.debugLineNum = 21;BA.debugLine="mServer = Server";
_vvvvv0 = _server;
 //BA.debugLineNum = 22;BA.debugLine="RETRTimer.Initialize(\"RETRTimer\", 30)";
_vvvvvvvv6.Initialize(ba,"RETRTimer",(long) (30));
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.StringBuilderWrapper  _vvvvvvv5(anywheresoftware.b4a.keywords.StringBuilderWrapper _sb,int _n,String _value) throws Exception{
int _i = 0;
 //BA.debugLineNum = 107;BA.debugLine="Private Sub Pad(sb As StringBuilder, n As Int, val";
 //BA.debugLineNum = 108;BA.debugLine="For i = 1 To n - value.Length";
{
final int step1 = 1;
final int limit1 = (int) (_n-_value.length());
_i = (int) (1) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 109;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 }
};
 //BA.debugLineNum = 111;BA.debugLine="sb.Append(value)";
_sb.Append(_value);
 //BA.debugLineNum = 112;BA.debugLine="Return sb";
if (true) return _sb;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _retrtimer_tick() throws Exception{
int _c = 0;
 //BA.debugLineNum = 60;BA.debugLine="Private Sub RETRTimer_Tick";
 //BA.debugLineNum = 61;BA.debugLine="Try";
try { //BA.debugLineNum = 62;BA.debugLine="If AStream.OutputQueueSize > 50 Then Return";
if (_vvvvvvv0.getOutputQueueSize()>50) { 
if (true) return "";};
 //BA.debugLineNum = 63;BA.debugLine="Dim c As Int = FileIn.ReadBytes(FileBuffer, 0, F";
_c = _vvvvvvvv3.ReadBytes(_vvvvvvvv5,(int) (0),_vvvvvvvv5.length);
 //BA.debugLineNum = 64;BA.debugLine="If c <= 0 Then";
if (_c<=0) { 
 //BA.debugLineNum = 65;BA.debugLine="AStream.SendAllAndClose";
_vvvvvvv0.SendAllAndClose();
 //BA.debugLineNum = 66;BA.debugLine="RETRTimer.Enabled = False";
_vvvvvvvv6.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 69;BA.debugLine="AStream.Write2(FileBuffer, 0, c)";
_vvvvvvv0.Write2(_vvvvvvvv5,(int) (0),_c);
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 72;BA.debugLine="Log(LastException)";
__c.LogImpl("93670028",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 73;BA.debugLine="Close";
_vvv5();
 };
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvv6(ESH.Hakkuraifu.ftpclient._ftptask _task) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub SetTask (task As FTPTask)";
 //BA.debugLineNum = 26;BA.debugLine="mTask = task";
_vvvvvvvv1 = _task;
 //BA.debugLineNum = 27;BA.debugLine="AfterConnectionAndTask";
_vvvvvvv3();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _ssocket_newconnection(boolean _successful,anywheresoftware.b4a.objects.SocketWrapper _newsocket) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub ssocket_NewConnection (Successful As B";
 //BA.debugLineNum = 52;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 53;BA.debugLine="Dim AStream As AsyncStreams";
_vvvvvvv0 = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 54;BA.debugLine="AStream.Initialize(NewSocket.InputStream, NewSoc";
_vvvvvvv0.Initialize(ba,_newsocket.getInputStream(),_newsocket.getOutputStream(),"astream");
 //BA.debugLineNum = 55;BA.debugLine="Connected = True";
_vvvvvvvv7 = __c.True;
 //BA.debugLineNum = 56;BA.debugLine="AfterConnectionAndTask";
_vvvvvvv3();
 };
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
