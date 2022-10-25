package ESH.Hakkuraifu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ftpserver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "ESH.Hakkuraifu.ftpserver");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ESH.Hakkuraifu.ftpserver.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvv2 = null;
public String _vvvvvvvvvv3 = "";
public anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _v7 = null;
public int _v5 = 0;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvv5 = null;
public String _vvvvvvvvvv6 = "";
public Object _vvvvvvvvvv7 = null;
public String _vvvv1 = "";
public boolean _vvvvvvvvvv0 = false;
public String _vvvvvvvvvvv1 = "";
public ESH.Hakkuraifu.main _vvv1 = null;
public ESH.Hakkuraifu.starter _vvv2 = null;
public ESH.Hakkuraifu.serverservice _vvv3 = null;
public ESH.Hakkuraifu.httputils2service _vvv4 = null;
public static class _ftpuser{
public boolean IsInitialized;
public String Name;
public String Password;
public void Initialize() {
IsInitialized = true;
Name = "";
Password = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _vvvvvvvv0(String _name,String _password) throws Exception{
ESH.Hakkuraifu.ftpserver._ftpuser _u = null;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub AddUser (Name As String, Password As St";
 //BA.debugLineNum = 44;BA.debugLine="Dim u As FTPUser";
_u = new ESH.Hakkuraifu.ftpserver._ftpuser();
 //BA.debugLineNum = 45;BA.debugLine="u.Initialize";
_u.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="u.Name = Name";
_u.Name /*String*/  = _name;
 //BA.debugLineNum = 47;BA.debugLine="u.Password = Password";
_u.Password /*String*/  = _password;
 //BA.debugLineNum = 48;BA.debugLine="Users.Put(u.Name, u)";
_vvvvvvvvvv5.Put((Object)(_u.Name /*String*/ ),(Object)(_u));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type FTPUser (Name As String, Password As String)";
;
 //BA.debugLineNum = 4;BA.debugLine="Private clients As List";
_vvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Public const EOL As String = Chr(13) & Chr(10)";
_vvvvvvvvvv3 = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
 //BA.debugLineNum = 6;BA.debugLine="Public ssocket As ServerSocket";
_v7 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Public port As Int";
_v5 = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private dataPorts As Map";
_vvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public Users As Map";
_vvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Public BaseDir As String";
_vvvvvvvvvv6 = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallback As Object";
_vvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String";
_vvvv1 = "";
 //BA.debugLineNum = 13;BA.debugLine="Private stopped As Boolean = True";
_vvvvvvvvvv0 = __c.True;
 //BA.debugLineNum = 14;BA.debugLine="Public ForcedServerIp As String";
_vvvvvvvvvvv1 = "";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv1(ESH.Hakkuraifu.ftpclient _client) throws Exception{
int _i = 0;
 //BA.debugLineNum = 60;BA.debugLine="Public Sub ClientClosed (client As FTPClient)";
 //BA.debugLineNum = 61;BA.debugLine="If stopped Then Return";
if (_vvvvvvvvvv0) { 
if (true) return "";};
 //BA.debugLineNum = 62;BA.debugLine="If client.mDataPort > 0 Then dataPorts.Put(client";
if (_client._vvvvvv1 /*int*/ >0) { 
_vvvvvvvvvv4.Put((Object)(_client._vvvvvv1 /*int*/ ),(Object)(__c.False));};
 //BA.debugLineNum = 63;BA.debugLine="Dim i As Int = clients.IndexOf(client)";
_i = _vvvvvvvvvv2.IndexOf((Object)(_client));
 //BA.debugLineNum = 64;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
 //BA.debugLineNum = 65;BA.debugLine="clients.RemoveAt(i)";
_vvvvvvvvvv2.RemoveAt(_i);
 //BA.debugLineNum = 66;BA.debugLine="CallSub(mCallback, mEventName & \"_StateChanged\")";
__c.CallSubNew(ba,_vvvvvvvvvv7,_vvvv1+"_StateChanged");
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public int  _vvvvvvvvv2() throws Exception{
int _i = 0;
 //BA.debugLineNum = 87;BA.debugLine="Private Sub GetDataPort As Int";
 //BA.debugLineNum = 88;BA.debugLine="For Each i As Int In dataPorts.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvv4.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (int)(BA.ObjectToNumber(group1.Get(index1)));
 //BA.debugLineNum = 89;BA.debugLine="If dataPorts.Get(i) = False Then";
if ((_vvvvvvvvvv4.Get((Object)(_i))).equals((Object)(__c.False))) { 
 //BA.debugLineNum = 90;BA.debugLine="Return i";
if (true) return _i;
 };
 }
};
 //BA.debugLineNum = 93;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return 0;
}
public int  _getvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub getNumberOfClients As Int";
 //BA.debugLineNum = 71;BA.debugLine="Return clients.Size";
if (true) return _vvvvvvvvvv2.getSize();
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub getRunning As Boolean";
 //BA.debugLineNum = 34;BA.debugLine="Return stopped = False";
if (true) return _vvvvvvvvvv0==__c.False;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 18;BA.debugLine="clients.Initialize";
_vvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="Users.Initialize";
_vvvvvvvvvv5.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="mCallback = Callback";
_vvvvvvvvvv7 = _callback;
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_vvvv1 = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv5(int _controlport,int _dataportbegin,int _dataportend) throws Exception{
int _i = 0;
 //BA.debugLineNum = 25;BA.debugLine="Public Sub SetPorts(ControlPort As Int, DataPortBe";
 //BA.debugLineNum = 26;BA.debugLine="dataPorts.Initialize";
_vvvvvvvvvv4.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="For i = DataPortBegin To DataPortEnd";
{
final int step2 = 1;
final int limit2 = _dataportend;
_i = _dataportbegin ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 28;BA.debugLine="dataPorts.Put(i, False)";
_vvvvvvvvvv4.Put((Object)(_i),(Object)(__c.False));
 }
};
 //BA.debugLineNum = 30;BA.debugLine="port = ControlPort";
_v5 = _controlport;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _ssocket_newconnection(boolean _successful,anywheresoftware.b4a.objects.SocketWrapper _newsocket) throws Exception{
ESH.Hakkuraifu.ftpclient _client = null;
int _dp = 0;
 //BA.debugLineNum = 74;BA.debugLine="Private Sub ssocket_NewConnection (Successful As B";
 //BA.debugLineNum = 75;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 76;BA.debugLine="Dim Client As FTPClient";
_client = new ESH.Hakkuraifu.ftpclient();
 //BA.debugLineNum = 77;BA.debugLine="Dim dp As Int = GetDataPort";
_dp = _vvvvvvvvv2();
 //BA.debugLineNum = 78;BA.debugLine="Client.Initialize(Me, NewSocket, dp)";
_client._initialize /*String*/ (ba,(ESH.Hakkuraifu.ftpserver)(this),_newsocket,_dp);
 //BA.debugLineNum = 79;BA.debugLine="clients.Add(Client)";
_vvvvvvvvvv2.Add((Object)(_client));
 //BA.debugLineNum = 80;BA.debugLine="If dp > 0 Then dataPorts.Put(dp, True)";
if (_dp>0) { 
_vvvvvvvvvv4.Put((Object)(_dp),(Object)(__c.True));};
 //BA.debugLineNum = 81;BA.debugLine="CallSub(mCallback, mEventName & \"_StateChanged\")";
__c.CallSubNew(ba,_vvvvvvvvvv7,_vvvv1+"_StateChanged");
 };
 //BA.debugLineNum = 83;BA.debugLine="If stopped = False Then ssocket.Listen";
if (_vvvvvvvvvv0==__c.False) { 
_v7.Listen();};
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Start";
 //BA.debugLineNum = 38;BA.debugLine="ssocket.Initialize(port, \"ssocket\")";
_v7.Initialize(ba,_v5,"ssocket");
 //BA.debugLineNum = 39;BA.debugLine="ssocket.Listen";
_v7.Listen();
 //BA.debugLineNum = 40;BA.debugLine="stopped = False";
_vvvvvvvvvv0 = __c.False;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv7() throws Exception{
ESH.Hakkuraifu.ftpclient _client = null;
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Stop";
 //BA.debugLineNum = 52;BA.debugLine="If stopped Then Return";
if (_vvvvvvvvvv0) { 
if (true) return "";};
 //BA.debugLineNum = 53;BA.debugLine="stopped = True";
_vvvvvvvvvv0 = __c.True;
 //BA.debugLineNum = 54;BA.debugLine="ssocket.Close";
_v7.Close();
 //BA.debugLineNum = 55;BA.debugLine="For Each Client As FTPClient In clients";
{
final anywheresoftware.b4a.BA.IterableList group4 = _vvvvvvvvvv2;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_client = (ESH.Hakkuraifu.ftpclient)(group4.Get(index4));
 //BA.debugLineNum = 56;BA.debugLine="Client.CloseConnection";
_client._vvvv6 /*String*/ ();
 }
};
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
