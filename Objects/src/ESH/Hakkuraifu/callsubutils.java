package ESH.Hakkuraifu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class callsubutils extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "ESH.Hakkuraifu.callsubutils");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ESH.Hakkuraifu.callsubutils.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _vv0 = null;
public ESH.Hakkuraifu.main _vvv1 = null;
public ESH.Hakkuraifu.starter _vvv2 = null;
public ESH.Hakkuraifu.serverservice _vvv3 = null;
public ESH.Hakkuraifu.httputils2service _vvv4 = null;
public static class _rundelayeddata{
public boolean IsInitialized;
public Object Module;
public String SubName;
public Object[] Arg;
public boolean Delayed;
public void Initialize() {
IsInitialized = true;
Module = new Object();
SubName = "";
Arg = new Object[0];
{
int d0 = Arg.length;
for (int i0 = 0;i0 < d0;i0++) {
Arg[i0] = new Object();
}
}
;
Delayed = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _vv2(Object _module,String _subname,int _delay) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub CallSubDelayedPlus(Module As Object, Su";
 //BA.debugLineNum = 14;BA.debugLine="CallSubDelayedPlus2(Module, SubName, Delay, Null)";
_vv3(_module,_subname,_delay,(Object[])(__c.Null));
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _vv3(Object _module,String _subname,int _delay,Object[] _arg) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub CallSubDelayedPlus2(Module As Object, S";
 //BA.debugLineNum = 21;BA.debugLine="PlusImpl(Module, SubName, Delay, Arg, True)";
_vv6(_module,_subname,_delay,_arg,__c.True);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _vv4(Object _module,String _subname,int _delay) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub CallSubPlus(Module As Object, SubName A";
 //BA.debugLineNum = 27;BA.debugLine="CallSubPlus2(Module, SubName, Delay, Null)";
_vv5(_module,_subname,_delay,(Object[])(__c.Null));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _vv5(Object _module,String _subname,int _delay,Object[] _arg) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub CallSubPlus2(Module As Object, SubName";
 //BA.debugLineNum = 34;BA.debugLine="PlusImpl(Module, SubName, Delay, Arg, False)";
_vv6(_module,_subname,_delay,_arg,__c.False);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private RunDelayed As Map";
_vv0 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Type RunDelayedData (Module As Object, SubName As";
;
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _vv6(Object _module,String _subname,int _delay,Object[] _arg,boolean _delayed) throws Exception{
anywheresoftware.b4a.objects.Timer _tmr = null;
ESH.Hakkuraifu.callsubutils._rundelayeddata _rdd = null;
 //BA.debugLineNum = 37;BA.debugLine="Private Sub PlusImpl(Module As Object, SubName As";
 //BA.debugLineNum = 38;BA.debugLine="If RunDelayed.IsInitialized = False Then RunDelay";
if (_vv0.IsInitialized()==__c.False) { 
_vv0.Initialize();};
 //BA.debugLineNum = 39;BA.debugLine="Dim tmr As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 40;BA.debugLine="tmr.Initialize(\"tmr\", Delay)";
_tmr.Initialize(ba,"tmr",(long) (_delay));
 //BA.debugLineNum = 41;BA.debugLine="Dim rdd As RunDelayedData";
_rdd = new ESH.Hakkuraifu.callsubutils._rundelayeddata();
 //BA.debugLineNum = 42;BA.debugLine="rdd.Module = Module";
_rdd.Module /*Object*/  = _module;
 //BA.debugLineNum = 43;BA.debugLine="rdd.SubName = SubName";
_rdd.SubName /*String*/  = _subname;
 //BA.debugLineNum = 44;BA.debugLine="rdd.Arg = Arg";
_rdd.Arg /*Object[]*/  = _arg;
 //BA.debugLineNum = 45;BA.debugLine="rdd.delayed = delayed";
_rdd.Delayed /*boolean*/  = _delayed;
 //BA.debugLineNum = 46;BA.debugLine="RunDelayed.Put(tmr, rdd)";
_vv0.Put((Object)(_tmr),(Object)(_rdd));
 //BA.debugLineNum = 47;BA.debugLine="tmr.Enabled = True";
_tmr.setEnabled(__c.True);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _vv7(String _subname) throws Exception{
anywheresoftware.b4a.objects.collections.List _timerstoremove = null;
anywheresoftware.b4a.objects.Timer _tmr = null;
ESH.Hakkuraifu.callsubutils._rundelayeddata _rdd = null;
 //BA.debugLineNum = 70;BA.debugLine="Public Sub RemoveCallsToSub(SubName As String)";
 //BA.debugLineNum = 71;BA.debugLine="If RunDelayed.IsInitialized = False Then Return";
if (_vv0.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 72;BA.debugLine="Dim timersToRemove As List";
_timerstoremove = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 73;BA.debugLine="timersToRemove.Initialize";
_timerstoremove.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="For Each tmr As Timer In RunDelayed.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _vv0.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_tmr = (anywheresoftware.b4a.objects.Timer)(group4.Get(index4));
 //BA.debugLineNum = 75;BA.debugLine="Dim rdd As RunDelayedData = RunDelayed.Get(tmr)";
_rdd = (ESH.Hakkuraifu.callsubutils._rundelayeddata)(_vv0.Get((Object)(_tmr)));
 //BA.debugLineNum = 76;BA.debugLine="If rdd.SubName = SubName Then timersToRemove.Add";
if ((_rdd.SubName /*String*/ ).equals(_subname)) { 
_timerstoremove.Add((Object)(_tmr));};
 }
};
 //BA.debugLineNum = 78;BA.debugLine="For Each tmr As Timer In timersToRemove";
{
final anywheresoftware.b4a.BA.IterableList group8 = _timerstoremove;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_tmr = (anywheresoftware.b4a.objects.Timer)(group8.Get(index8));
 //BA.debugLineNum = 79;BA.debugLine="tmr.Enabled = False";
_tmr.setEnabled(__c.False);
 //BA.debugLineNum = 80;BA.debugLine="RunDelayed.Remove(tmr)";
_vv0.Remove((Object)(_tmr));
 }
};
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _tmr_tick() throws Exception{
anywheresoftware.b4a.objects.Timer _t = null;
ESH.Hakkuraifu.callsubutils._rundelayeddata _rdd = null;
 //BA.debugLineNum = 50;BA.debugLine="Private Sub tmr_Tick";
 //BA.debugLineNum = 51;BA.debugLine="Dim t As Timer = Sender";
_t = (anywheresoftware.b4a.objects.Timer)(__c.Sender(getActivityBA()));
 //BA.debugLineNum = 52;BA.debugLine="t.Enabled = False";
_t.setEnabled(__c.False);
 //BA.debugLineNum = 53;BA.debugLine="Dim rdd As RunDelayedData = RunDelayed.Get(t)";
_rdd = (ESH.Hakkuraifu.callsubutils._rundelayeddata)(_vv0.Get((Object)(_t)));
 //BA.debugLineNum = 54;BA.debugLine="RunDelayed.Remove(t)";
_vv0.Remove((Object)(_t));
 //BA.debugLineNum = 55;BA.debugLine="If rdd.Delayed Then";
if (_rdd.Delayed /*boolean*/ ) { 
 //BA.debugLineNum = 56;BA.debugLine="If rdd.Arg = Null Then";
if (_rdd.Arg /*Object[]*/ == null) { 
 //BA.debugLineNum = 57;BA.debugLine="CallSubDelayed(rdd.Module, rdd.SubName)";
__c.CallSubDelayed(ba,_rdd.Module /*Object*/ ,_rdd.SubName /*String*/ );
 }else {
 //BA.debugLineNum = 59;BA.debugLine="CallSubDelayed2(rdd.Module, rdd.SubName, rdd.Ar";
__c.CallSubDelayed2(ba,_rdd.Module /*Object*/ ,_rdd.SubName /*String*/ ,(Object)(_rdd.Arg /*Object[]*/ ));
 };
 }else {
 //BA.debugLineNum = 62;BA.debugLine="If rdd.Arg = Null Then";
if (_rdd.Arg /*Object[]*/ == null) { 
 //BA.debugLineNum = 63;BA.debugLine="CallSub(rdd.Module, rdd.SubName)";
__c.CallSubNew(ba,_rdd.Module /*Object*/ ,_rdd.SubName /*String*/ );
 }else {
 //BA.debugLineNum = 65;BA.debugLine="CallSub2(rdd.Module, rdd.SubName, rdd.Arg)";
__c.CallSubNew2(ba,_rdd.Module /*Object*/ ,_rdd.SubName /*String*/ ,(Object)(_rdd.Arg /*Object[]*/ ));
 };
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
