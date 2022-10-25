package ESH.Hakkuraifu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ftpasyncstreamstext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "ESH.Hakkuraifu.ftpasyncstreamstext");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ESH.Hakkuraifu.ftpasyncstreamstext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object _vvv0 = null;
public String _vvvv1 = "";
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _vvvv2 = null;
public String _vvvv3 = "";
public anywheresoftware.b4a.keywords.StringBuilderWrapper _vvvv4 = null;
public ESH.Hakkuraifu.main _vvv1 = null;
public ESH.Hakkuraifu.starter _vvv2 = null;
public ESH.Hakkuraifu.serverservice _vvv3 = null;
public ESH.Hakkuraifu.httputils2service _vvv4 = null;
public String  _astreams_error() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Private Sub astreams_Error";
 //BA.debugLineNum = 55;BA.debugLine="Log(\"error: \" & LastException)";
__c.LogImpl("92031617","error: "+BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 56;BA.debugLine="astreams.Close";
_vvvv2.Close();
 //BA.debugLineNum = 57;BA.debugLine="CallSubDelayed(mTarget, mEventName & \"_Terminated";
__c.CallSubDelayed(ba,_vvv0,_vvvv1+"_Terminated");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _astreams_newdata(byte[] _buffer) throws Exception{
int _newdatastart = 0;
String _s = "";
int _start = 0;
int _i = 0;
char _c = '\0';
 //BA.debugLineNum = 26;BA.debugLine="Private Sub astreams_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 27;BA.debugLine="Dim newDataStart As Int = sb.Length";
_newdatastart = _vvvv4.getLength();
 //BA.debugLineNum = 28;BA.debugLine="sb.Append(BytesToString(Buffer, 0, Buffer.Length,";
_vvvv4.Append(__c.BytesToString(_buffer,(int) (0),_buffer.length,_vvvv3));
 //BA.debugLineNum = 29;BA.debugLine="Dim s As String = sb.ToString";
_s = _vvvv4.ToString();
 //BA.debugLineNum = 30;BA.debugLine="Dim start As Int = 0";
_start = (int) (0);
 //BA.debugLineNum = 31;BA.debugLine="For i = newDataStart To s.Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_s.length()-1);
_i = _newdatastart ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 32;BA.debugLine="Dim c As Char = s.CharAt(i)";
_c = _s.charAt(_i);
 //BA.debugLineNum = 33;BA.debugLine="If i = 0 And c = Chr(10) Then '\\n...";
if (_i==0 && _c==__c.Chr((int) (10))) { 
 //BA.debugLineNum = 34;BA.debugLine="start = 1 'might be a broken end of line charac";
_start = (int) (1);
 //BA.debugLineNum = 35;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 37;BA.debugLine="If c = Chr(10) Then '\\n";
if (_c==__c.Chr((int) (10))) { 
 //BA.debugLineNum = 38;BA.debugLine="CallSubDelayed2(mTarget, mEventName & \"_NewText";
__c.CallSubDelayed2(ba,_vvv0,_vvvv1+"_NewText",(Object)(_s.substring(_start,_i)));
 //BA.debugLineNum = 39;BA.debugLine="start = i + 1";
_start = (int) (_i+1);
 }else if(_c==__c.Chr((int) (13))) { 
 //BA.debugLineNum = 41;BA.debugLine="CallSubDelayed2(mTarget, mEventName & \"_NewText";
__c.CallSubDelayed2(ba,_vvv0,_vvvv1+"_NewText",(Object)(_s.substring(_start,_i)));
 //BA.debugLineNum = 42;BA.debugLine="If i < s.Length - 1 And s.CharAt(i + 1) = Chr(1";
if (_i<_s.length()-1 && _s.charAt((int) (_i+1))==__c.Chr((int) (10))) { 
 //BA.debugLineNum = 43;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 };
 //BA.debugLineNum = 45;BA.debugLine="start = i + 1";
_start = (int) (_i+1);
 };
 }
};
 //BA.debugLineNum = 48;BA.debugLine="If start > 0 Then sb.Remove(0, start)";
if (_start>0) { 
_vvvv4.Remove((int) (0),_start);};
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _astreams_terminated() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Private Sub astreams_Terminated";
 //BA.debugLineNum = 51;BA.debugLine="CallSubDelayed(mTarget, mEventName & \"_Terminated";
__c.CallSubDelayed(ba,_vvv0,_vvvv1+"_Terminated");
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mTarget As Object";
_vvv0 = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String";
_vvvv1 = "";
 //BA.debugLineNum = 9;BA.debugLine="Private astreams As AsyncStreams";
_vvvv2 = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 10;BA.debugLine="Public charset As String = \"UTF8\"";
_vvvv3 = "UTF8";
 //BA.debugLineNum = 11;BA.debugLine="Private sb As StringBuilder";
_vvvv4 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _vvv5() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 68;BA.debugLine="If astreams.IsInitialized Then astreams.Close";
if (_vvvv2.IsInitialized()) { 
_vvvv2.Close();};
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _vvv6() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub CloseGracefully";
 //BA.debugLineNum = 61;BA.debugLine="If astreams.SendAllAndClose = False Then";
if (_vvvv2.SendAllAndClose()==__c.False) { 
 //BA.debugLineNum = 62;BA.debugLine="astreams.Close";
_vvvv2.Close();
 //BA.debugLineNum = 63;BA.debugLine="astreams_Terminated";
_astreams_terminated();
 };
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _targetmodule,String _eventname,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (TargetModule As Object, Eve";
 //BA.debugLineNum = 15;BA.debugLine="mTarget = TargetModule";
_vvv0 = _targetmodule;
 //BA.debugLineNum = 16;BA.debugLine="mEventName = EventName";
_vvvv1 = _eventname;
 //BA.debugLineNum = 17;BA.debugLine="astreams.Initialize(In, out, \"astreams\")";
_vvvv2.Initialize(ba,(java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()),"astreams");
 //BA.debugLineNum = 18;BA.debugLine="sb.Initialize";
_vvvv4.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _vvv7(String _text) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Write(Text As String)";
 //BA.debugLineNum = 23;BA.debugLine="astreams.Write(Text.GetBytes(charset))";
_vvvv2.Write(_text.getBytes(_vvvv3));
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
