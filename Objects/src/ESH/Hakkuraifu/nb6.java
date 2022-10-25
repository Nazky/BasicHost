package ESH.Hakkuraifu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class nb6 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "ESH.Hakkuraifu.nb6");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ESH.Hakkuraifu.nb6.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvv7 = 0;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvv0 = null;
public int _s_old = 0;
public int _s_builder = 0;
public int _s_channel = 0;
public int _vvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.NotificationWrapper _vvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvvv5 = null;
public ESH.Hakkuraifu.main _vvv1 = null;
public ESH.Hakkuraifu.starter _vvv2 = null;
public ESH.Hakkuraifu.serverservice _vvv3 = null;
public ESH.Hakkuraifu.httputils2service _vvv4 = null;
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvv2(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _service,String _action) throws Exception{
Object _ac = null;
 //BA.debugLineNum = 83;BA.debugLine="Public Sub AddButtonAction (Bmp As Bitmap, Title A";
 //BA.debugLineNum = 84;BA.debugLine="If IsBuilder = False Then Return Me";
if (_vvvvvvvvvvvvv3()==__c.False) { 
if (true) return (ESH.Hakkuraifu.nb6)(this);};
 //BA.debugLineNum = 85;BA.debugLine="Dim ac As Object = CreateAction(Bmp, Title, Creat";
_ac = _vvvvvvvvvvvv4(_bmp,_title,_vvvvvvvvvvvv7(_service,_action));
 //BA.debugLineNum = 86;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
_vvvvvvvvvvvvvvv6.RunMethod("addAction",new Object[]{_ac});
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvv3(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _activity,String _action) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _in = null;
Object _pendingintent = null;
Object _ac = null;
 //BA.debugLineNum = 91;BA.debugLine="Public Sub AddButtonAction2 (Bmp As Bitmap, Title";
 //BA.debugLineNum = 92;BA.debugLine="If IsBuilder = False Then Return Me";
if (_vvvvvvvvvvvvv3()==__c.False) { 
if (true) return (ESH.Hakkuraifu.nb6)(this);};
 //BA.debugLineNum = 93;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = _vvvvvvvvvvvv6(_activity,__c.False);
 //BA.debugLineNum = 94;BA.debugLine="in.Action = Action";
_in.setAction(_action);
 //BA.debugLineNum = 95;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIVI";
_in.setFlags(__c.Bit.Or((int) (268435456),(int) (131072)));
 //BA.debugLineNum = 96;BA.debugLine="Dim PendingIntent As Object = PendingIntentStatic";
_pendingintent = _vvvvvvvvvvvvvvvv3.RunMethod("getActivity",new Object[]{(Object)(_vvvvvvvvvvvvvvv0.getObject()),(Object)(__c.Rnd((int) (0),((int)0x7fffffff))),(Object)(_in.getObject()),(Object)(0)});
 //BA.debugLineNum = 97;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\",";
_vvvvvvvvvvvvvvv6.RunMethod("setContentIntent",new Object[]{_pendingintent});
 //BA.debugLineNum = 98;BA.debugLine="Dim Ac As Object = CreateAction(Bmp, Title, Pendi";
_ac = _vvvvvvvvvvvv4(_bmp,_title,_pendingintent);
 //BA.debugLineNum = 99;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
_vvvvvvvvvvvvvvv6.RunMethod("addAction",new Object[]{_ac});
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvv4(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,String _resultkey,Object _service) throws Exception{
anywheresoftware.b4j.object.JavaObject _remoteinputbuilder = null;
anywheresoftware.b4j.object.JavaObject _builder = null;
anywheresoftware.b4j.object.JavaObject _ac = null;
 //BA.debugLineNum = 103;BA.debugLine="Public Sub AddRemoteInput (Bmp As Bitmap, Title As";
 //BA.debugLineNum = 104;BA.debugLine="If IsBuilder = False Then Return Me";
if (_vvvvvvvvvvvvv3()==__c.False) { 
if (true) return (ESH.Hakkuraifu.nb6)(this);};
 //BA.debugLineNum = 105;BA.debugLine="Dim RemoteInputBuilder As JavaObject";
_remoteinputbuilder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 106;BA.debugLine="RemoteInputBuilder.InitializeNewInstance(\"android";
_remoteinputbuilder.InitializeNewInstance("android.app.RemoteInput$Builder",new Object[]{(Object)(_resultkey)});
 //BA.debugLineNum = 107;BA.debugLine="RemoteInputBuilder.RunMethod(\"setLabel\", Array(Ti";
_remoteinputbuilder.RunMethod("setLabel",new Object[]{_title});
 //BA.debugLineNum = 108;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 109;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
_builder.InitializeNewInstance("android.app.Notification$Action$Builder",new Object[]{_vvvvvvvvvvvv5(_bmp),_title,_vvvvvvvvvvvv7(_service,_resultkey)});
 //BA.debugLineNum = 110;BA.debugLine="builder.RunMethod(\"addRemoteInput\", Array(RemoteI";
_builder.RunMethod("addRemoteInput",new Object[]{_remoteinputbuilder.RunMethod("build",(Object[])(__c.Null))});
 //BA.debugLineNum = 111;BA.debugLine="Dim ac As JavaObject = builder.RunMethod(\"build\",";
_ac = new anywheresoftware.b4j.object.JavaObject();
_ac = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_builder.RunMethod("build",(Object[])(__c.Null))));
 //BA.debugLineNum = 112;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
_vvvvvvvvvvvvvvv6.RunMethod("addAction",new Object[]{(Object)(_ac.getObject())});
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvv5(boolean _cancel) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub AutoCancel (Cancel As Boolean) As NB6";
 //BA.debugLineNum = 162;BA.debugLine="If IsOld Then";
if (_vvvvvvvvvvvvv6()) { 
 //BA.debugLineNum = 163;BA.debugLine="OldNotification.AutoCancel = Cancel";
_vvvvvvvvvvvvvvvv2.setAutoCancel(_cancel);
 }else {
 //BA.debugLineNum = 165;BA.debugLine="NotificationBuilder.RunMethod(\"setAutoCancel\", A";
_vvvvvvvvvvvvvvv6.RunMethod("setAutoCancel",new Object[]{(Object)(_cancel)});
 };
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvv6(String _icontype) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 181;BA.debugLine="Public Sub BadgeIconType (IconType As String) As N";
 //BA.debugLineNum = 182;BA.debugLine="If SdkLevel >= 26 Then";
if (_vvvvvvvvvvvvvvv7>=26) { 
 //BA.debugLineNum = 183;BA.debugLine="Dim m As Map = CreateMap(\"LARGE\": 2, \"NONE\": 0,";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("LARGE"),(Object)(2),(Object)("NONE"),(Object)(0),(Object)("SMALL"),(Object)(1)});
 //BA.debugLineNum = 184;BA.debugLine="NotificationBuilder.RunMethod(\"setBadgeIconType\"";
_vvvvvvvvvvvvvvv6.RunMethod("setBadgeIconType",new Object[]{_m.Get((Object)(_icontype))});
 };
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvv7(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _largeiconbmp,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture,Object _contenttitle,Object _summarytext) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Public Sub BigPictureStyle(LargeIconBmp As Bitmap,";
 //BA.debugLineNum = 298;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 299;BA.debugLine="SetStyle(\"android.app.Notification$BigPictureSty";
_vvvvvvvvvvvvvv0("android.app.Notification$BigPictureStyle",__c.createMap(new Object[] {(Object)("bigLargeIcon"),(Object)(_largeiconbmp.getObject()),(Object)("bigPicture"),(Object)(_picture.getObject()),(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvv0(Object _contenttitle,Object _summarytext,Object _text) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Public Sub BigTextStyle (ContentTitle As Object, S";
 //BA.debugLineNum = 318;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 319;BA.debugLine="SetStyle(\"android.app.Notification$BigTextStyle\"";
_vvvvvvvvvvvvvv0("android.app.Notification$BigTextStyle",__c.createMap(new Object[] {(Object)("bigText"),_text,(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.NotificationWrapper  _vvvvvvvvvvvv1(Object _contenttitle,Object _contenttext,String _tag,Object _activity) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _in = null;
Object _pendingintent = null;
anywheresoftware.b4j.object.JavaObject _manager = null;
 //BA.debugLineNum = 349;BA.debugLine="Public Sub Build (ContentTitle As Object, ContentT";
 //BA.debugLineNum = 350;BA.debugLine="If IsOld Then";
if (_vvvvvvvvvvvvv6()) { 
 //BA.debugLineNum = 351;BA.debugLine="OldNotification.SetInfo2(ContentTitle, ContentTe";
_vvvvvvvvvvvvvvvv2.SetInfo2New(ba,BA.ObjectToCharSequence(_contenttitle),BA.ObjectToCharSequence(_contenttext),BA.ObjectToCharSequence(_tag),_activity);
 //BA.debugLineNum = 352;BA.debugLine="Return OldNotification";
if (true) return _vvvvvvvvvvvvvvvv2;
 }else {
 //BA.debugLineNum = 354;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = _vvvvvvvvvvvv6(_activity,__c.False);
 //BA.debugLineNum = 355;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIV";
_in.setFlags(__c.Bit.Or((int) (268435456),(int) (131072)));
 //BA.debugLineNum = 356;BA.debugLine="in.PutExtra(\"Notification_Tag\", Tag)";
_in.PutExtra("Notification_Tag",(Object)(_tag));
 //BA.debugLineNum = 358;BA.debugLine="Dim PendingIntent As Object = PendingIntentStati";
_pendingintent = _vvvvvvvvvvvvvvvv3.RunMethod("getActivity",new Object[]{(Object)(_vvvvvvvvvvvvvvv0.getObject()),(Object)(__c.Rnd((int) (0),((int)0x7fffffff))),(Object)(_in.getObject()),(Object)(_vvvvvvvvvvvvv2())});
 //BA.debugLineNum = 359;BA.debugLine="NotificationBuilder.RunMethodJO(\"setContentTitle";
_vvvvvvvvvvvvvvv6.RunMethodJO("setContentTitle",new Object[]{_contenttitle}).RunMethodJO("setContentText",new Object[]{_contenttext});
 //BA.debugLineNum = 360;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\"";
_vvvvvvvvvvvvvvv6.RunMethod("setContentIntent",new Object[]{_pendingintent});
 //BA.debugLineNum = 362;BA.debugLine="If IsChannel Then";
if (_vvvvvvvvvvvvv4()) { 
 //BA.debugLineNum = 363;BA.debugLine="Dim manager As JavaObject = ctxt.RunMethod(\"get";
_manager = new anywheresoftware.b4j.object.JavaObject();
_manager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_vvvvvvvvvvvvvvv0.RunMethod("getSystemService",new Object[]{(Object)("notification")})));
 //BA.debugLineNum = 364;BA.debugLine="manager.RunMethod(\"createNotificationChannel\",";
_manager.RunMethod("createNotificationChannel",new Object[]{(Object)(_vvvvvvvvvvvvvvv5.getObject())});
 };
 //BA.debugLineNum = 367;BA.debugLine="Return NotificationBuilder.RunMethod(\"build\", Nu";
if (true) return (anywheresoftware.b4a.objects.NotificationWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.NotificationWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvv6.RunMethod("build",(Object[])(__c.Null))));
 };
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Channel As JavaObject";
_vvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 4;BA.debugLine="Private NotificationBuilder As JavaObject";
_vvvvvvvvvvvvvvv6 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 5;BA.debugLine="Private SdkLevel As Int";
_vvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private ctxt As JavaObject";
_vvvvvvvvvvvvvvv0 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 7;BA.debugLine="Private const S_OLD = 0, S_BUILDER = 1, S_CHANNEL";
_s_old = (int) (0);
_s_builder = (int) (1);
_s_channel = (int) (2);
 //BA.debugLineNum = 8;BA.debugLine="Private SupportLevel As Int";
_vvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private OldNotification As Notification";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private PendingIntentStatic As JavaObject";
_vvvvvvvvvvvvvvvv3 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 11;BA.debugLine="Private NotificationStatic As JavaObject";
_vvvvvvvvvvvvvvvv4 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 12;BA.debugLine="Private common As JavaObject";
_vvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvv2(int _clr) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Public Sub Color (Clr As Int) As NB6";
 //BA.debugLineNum = 191;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 192;BA.debugLine="NotificationBuilder.RunMethod(\"setColor\", Array(";
_vvvvvvvvvvvvvvv6.RunMethod("setColor",new Object[]{(Object)(_clr)});
 };
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvv3(boolean _enabled) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub Colorized (Enabled As Boolean) As NB6";
 //BA.debugLineNum = 200;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 201;BA.debugLine="If SdkLevel >= 26 Then";
if (_vvvvvvvvvvvvvvv7>=26) { 
 //BA.debugLineNum = 202;BA.debugLine="NotificationBuilder.RunMethod(\"setColorized\", A";
_vvvvvvvvvvvvvvv6.RunMethod("setColorized",new Object[]{(Object)(__c.True)});
 };
 };
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvvvvvvvvv4(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _pendingintent) throws Exception{
anywheresoftware.b4j.object.JavaObject _builder = null;
 //BA.debugLineNum = 390;BA.debugLine="Private Sub CreateAction (Bmp As Bitmap, Title As";
 //BA.debugLineNum = 391;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 392;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
_builder.InitializeNewInstance("android.app.Notification$Action$Builder",new Object[]{_vvvvvvvvvvvv5(_bmp),_title,_pendingintent});
 //BA.debugLineNum = 393;BA.debugLine="Return builder.RunMethod(\"build\", Null)";
if (true) return _builder.RunMethod("build",(Object[])(__c.Null));
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvvvvvvvvv5(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
anywheresoftware.b4j.object.JavaObject _icon = null;
 //BA.debugLineNum = 396;BA.debugLine="Private Sub CreateIconFromBitmap(bmp As Bitmap) As";
 //BA.debugLineNum = 397;BA.debugLine="If bmp = Null Or bmp.IsInitialized = False Then R";
if (_bmp== null || _bmp.IsInitialized()==__c.False) { 
if (true) return (Object)(0);};
 //BA.debugLineNum = 398;BA.debugLine="Dim icon As JavaObject";
_icon = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 399;BA.debugLine="Return icon.InitializeStatic(\"android.graphics.dr";
if (true) return _icon.InitializeStatic("android.graphics.drawable.Icon").RunMethod("createWithBitmap",new Object[]{(Object)(_bmp.getObject())});
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.IntentWrapper  _vvvvvvvvvvvv6(Object _target,boolean _receiver) throws Exception{
anywheresoftware.b4j.object.JavaObject _in = null;
 //BA.debugLineNum = 383;BA.debugLine="Private Sub CreateIntent (Target As Object, Receiv";
 //BA.debugLineNum = 384;BA.debugLine="Target = common.RunMethod(\"getComponentClass\", Ar";
_target = _vvvvvvvvvvvvvvvv5.RunMethod("getComponentClass",new Object[]{__c.Null,_target,(Object)(_receiver)});
 //BA.debugLineNum = 385;BA.debugLine="Dim in As JavaObject";
_in = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 386;BA.debugLine="in.InitializeNewInstance(\"android.content.Intent\"";
_in.InitializeNewInstance("android.content.Intent",new Object[]{(Object)(_vvvvvvvvvvvvvvv0.getObject()),_target});
 //BA.debugLineNum = 387;BA.debugLine="Return in";
if (true) return (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_in.getObject()));
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvvvvvvvvv7(Object _service,String _action) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _in = null;
 //BA.debugLineNum = 371;BA.debugLine="Private Sub CreateReceiverPendingIntent (Service A";
 //BA.debugLineNum = 372;BA.debugLine="Dim in As Intent = CreateIntent(Service, True)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = _vvvvvvvvvvvv6(_service,__c.True);
 //BA.debugLineNum = 373;BA.debugLine="in.Action = Action";
_in.setAction(_action);
 //BA.debugLineNum = 374;BA.debugLine="Return PendingIntentStatic.RunMethod(\"getBroadcas";
if (true) return _vvvvvvvvvvvvvvvv3.RunMethod("getBroadcast",new Object[]{(Object)(_vvvvvvvvvvvvvvv0.getObject()),(Object)(1),(Object)(_in.getObject()),(Object)(_vvvvvvvvvvvvv2())});
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvv0(Object _fileprovideruri) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Public Sub CustomSound (FileProviderUri As Object)";
 //BA.debugLineNum = 271;BA.debugLine="If IsOld Then Return Me";
if (_vvvvvvvvvvvvv6()) { 
if (true) return (ESH.Hakkuraifu.nb6)(this);};
 //BA.debugLineNum = 272;BA.debugLine="ctxt.RunMethod(\"grantUriPermission\", Array(\"com.a";
_vvvvvvvvvvvvvvv0.RunMethod("grantUriPermission",new Object[]{(Object)("com.android.systemui"),_fileprovideruri,(Object)(1)});
 //BA.debugLineNum = 273;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 274;BA.debugLine="NotificationBuilder.RunMethod(\"setSound\", Array(";
_vvvvvvvvvvvvvvv6.RunMethod("setSound",new Object[]{_fileprovideruri,_vvvvvvvvvvvvvvvv4.GetField("AUDIO_ATTRIBUTES_DEFAULT")});
 //BA.debugLineNum = 275;BA.debugLine="If IsChannel Then";
if (_vvvvvvvvvvvvv4()) { 
 //BA.debugLineNum = 276;BA.debugLine="Channel.RunMethod(\"setSound\", Array(FileProvide";
_vvvvvvvvvvvvvvv5.RunMethod("setSound",new Object[]{_fileprovideruri,_vvvvvvvvvvvvvvvv4.GetField("AUDIO_ATTRIBUTES_DEFAULT")});
 };
 };
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvv1(Object _service,String _action) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Public Sub DeleteAction (Service As Object, Action";
 //BA.debugLineNum = 122;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 123;BA.debugLine="NotificationBuilder.RunMethod(\"setDeleteIntent\",";
_vvvvvvvvvvvvvvv6.RunMethod("setDeleteIntent",new Object[]{_vvvvvvvvvvvv7(_service,_action)});
 };
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public int  _vvvvvvvvvvvvv2() throws Exception{
int _flags = 0;
 //BA.debugLineNum = 377;BA.debugLine="Private Sub GetPendingIntentFlag As Int";
 //BA.debugLineNum = 378;BA.debugLine="Dim flags As Int = 0";
_flags = (int) (0);
 //BA.debugLineNum = 379;BA.debugLine="If SdkLevel >= 31 Then flags = Bit.Or(flags, 3355";
if (_vvvvvvvvvvvvvvv7>=31) { 
_flags = __c.Bit.Or(_flags,(int) (33554432));};
 //BA.debugLineNum = 380;BA.debugLine="Return flags";
if (true) return _flags;
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return 0;
}
public ESH.Hakkuraifu.nb6  _initialize(anywheresoftware.b4a.BA _ba,String _channelid,Object _channelname,String _importancelevel) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.Map _im = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _pm = null;
int _p = 0;
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (ChannelId As String, Channe";
 //BA.debugLineNum = 28;BA.debugLine="ctxt.InitializeContext";
_vvvvvvvvvvvvvvv0.InitializeContext(ba);
 //BA.debugLineNum = 29;BA.debugLine="PendingIntentStatic.InitializeStatic(\"android.app";
_vvvvvvvvvvvvvvvv3.InitializeStatic("android.app.PendingIntent");
 //BA.debugLineNum = 30;BA.debugLine="NotificationStatic.InitializeStatic(\"android.app.";
_vvvvvvvvvvvvvvvv4.InitializeStatic("android.app.Notification");
 //BA.debugLineNum = 31;BA.debugLine="common.InitializeStatic(\"anywheresoftware.b4a.key";
_vvvvvvvvvvvvvvvv5.InitializeStatic("anywheresoftware.b4a.keywords.Common");
 //BA.debugLineNum = 32;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 33;BA.debugLine="SdkLevel = jo.InitializeStatic(\"android.os.Build$";
_vvvvvvvvvvvvvvv7 = (int)(BA.ObjectToNumber(_jo.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
 //BA.debugLineNum = 34;BA.debugLine="If SdkLevel < 23 Or (SdkLevel = 23 And IsIncompat";
if (_vvvvvvvvvvvvvvv7<23 || (_vvvvvvvvvvvvvvv7==23 && _vvvvvvvvvvvvv5())) { 
 //BA.debugLineNum = 35;BA.debugLine="SupportLevel = S_OLD";
_vvvvvvvvvvvvvvvv1 = _s_old;
 }else if(_vvvvvvvvvvvvvvv7>=26) { 
 //BA.debugLineNum = 37;BA.debugLine="SupportLevel = S_CHANNEL";
_vvvvvvvvvvvvvvvv1 = _s_channel;
 }else {
 //BA.debugLineNum = 39;BA.debugLine="SupportLevel = S_BUILDER";
_vvvvvvvvvvvvvvvv1 = _s_builder;
 };
 //BA.debugLineNum = 41;BA.debugLine="If IsOld Then";
if (_vvvvvvvvvvvvv6()) { 
 //BA.debugLineNum = 42;BA.debugLine="OldNotification.Initialize";
_vvvvvvvvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="OldNotification.Icon = \"icon\"";
_vvvvvvvvvvvvvvvv2.setIcon("icon");
 }else if(_vvvvvvvvvvvvv4()) { 
 //BA.debugLineNum = 45;BA.debugLine="ChannelId = ChannelId & \"_\" & ImportanceLevel";
_channelid = _channelid+"_"+_importancelevel;
 //BA.debugLineNum = 46;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
_vvvvvvvvvvvvvvv6.InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(_vvvvvvvvvvvvvvv0.getObject()),(Object)(_channelid)});
 //BA.debugLineNum = 47;BA.debugLine="Dim im As Map = CreateMap(\"MIN\": 1, \"LOW\": 2, \"D";
_im = new anywheresoftware.b4a.objects.collections.Map();
_im = __c.createMap(new Object[] {(Object)("MIN"),(Object)(1),(Object)("LOW"),(Object)(2),(Object)("DEFAULT"),(Object)(3),(Object)("HIGH"),(Object)(4)});
 //BA.debugLineNum = 48;BA.debugLine="Dim i As Int = im.Get(ImportanceLevel)";
_i = (int)(BA.ObjectToNumber(_im.Get((Object)(_importancelevel))));
 //BA.debugLineNum = 49;BA.debugLine="Channel.InitializeNewInstance(\"android.app.Notif";
_vvvvvvvvvvvvvvv5.InitializeNewInstance("android.app.NotificationChannel",new Object[]{(Object)(_channelid),_channelname,(Object)(_i)});
 }else {
 //BA.debugLineNum = 51;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
_vvvvvvvvvvvvvvv6.InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(_vvvvvvvvvvvvvvv0.getObject())});
 //BA.debugLineNum = 52;BA.debugLine="Dim pm As Map = CreateMap(\"MIN\": -2, \"LOW\": -1,";
_pm = new anywheresoftware.b4a.objects.collections.Map();
_pm = __c.createMap(new Object[] {(Object)("MIN"),(Object)(-2),(Object)("LOW"),(Object)(-1),(Object)("DEFAULT"),(Object)(0),(Object)("HIGH"),(Object)(1)});
 //BA.debugLineNum = 53;BA.debugLine="Dim p As Int = pm.Get(ImportanceLevel)";
_p = (int)(BA.ObjectToNumber(_pm.Get((Object)(_importancelevel))));
 //BA.debugLineNum = 54;BA.debugLine="NotificationBuilder.RunMethod(\"setPriority\", Arr";
_vvvvvvvvvvvvvvv6.RunMethod("setPriority",new Object[]{(Object)(_p)});
 };
 //BA.debugLineNum = 56;BA.debugLine="If ImportanceLevel = \"DEFAULT\" Or ImportanceLevel";
if ((_importancelevel).equals("DEFAULT") || (_importancelevel).equals("HIGH")) { 
 //BA.debugLineNum = 57;BA.debugLine="SetDefaults(True, True, True)";
_vvvvvvvvvvvvvv6(__c.True,__c.True,__c.True);
 }else {
 //BA.debugLineNum = 59;BA.debugLine="SetDefaults(False, True, True)";
_vvvvvvvvvvvvvv6(__c.False,__c.True,__c.True);
 };
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public boolean  _vvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Private Sub IsBuilder As Boolean";
 //BA.debugLineNum = 403;BA.debugLine="Return SupportLevel >= S_BUILDER";
if (true) return _vvvvvvvvvvvvvvvv1>=_s_builder;
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return false;
}
public boolean  _vvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Private Sub IsChannel As Boolean";
 //BA.debugLineNum = 411;BA.debugLine="Return SupportLevel = S_CHANNEL";
if (true) return _vvvvvvvvvvvvvvvv1==_s_channel;
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return false;
}
public boolean  _vvvvvvvvvvvvv5() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
String _model = "";
String _manufacturer = "";
String _key = "";
anywheresoftware.b4a.objects.collections.Map _problematicdevices = null;
 //BA.debugLineNum = 64;BA.debugLine="Private Sub IsIncompatibleDevice As Boolean";
 //BA.debugLineNum = 65;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 66;BA.debugLine="Dim model As String = jo.InitializeStatic(\"androi";
_model = BA.ObjectToString(_jo.InitializeStatic("android.os.Build").GetField("MODEL"));
 //BA.debugLineNum = 67;BA.debugLine="Dim manufacturer As String = jo.InitializeStatic(";
_manufacturer = BA.ObjectToString(_jo.InitializeStatic("android.os.Build").GetField("MANUFACTURER"));
 //BA.debugLineNum = 68;BA.debugLine="Dim key As String = manufacturer & \" \" & model";
_key = _manufacturer+" "+_model;
 //BA.debugLineNum = 69;BA.debugLine="Log(\"key: \" & key)";
__c.LogImpl("94980741","key: "+_key,0);
 //BA.debugLineNum = 70;BA.debugLine="Dim ProblematicDevices As Map = CreateMap(\"Samsun";
_problematicdevices = new anywheresoftware.b4a.objects.collections.Map();
_problematicdevices = __c.createMap(new Object[] {(Object)("Samsung Galaxy S5"),(Object)(""),(Object)("Sony XPreria M5"),(Object)("")});
 //BA.debugLineNum = 71;BA.debugLine="If ProblematicDevices.ContainsKey(key) Then";
if (_problematicdevices.ContainsKey((Object)(_key))) { 
 //BA.debugLineNum = 72;BA.debugLine="Log(\"Problematic device. Switching to 'old' mode";
__c.LogImpl("94980744","Problematic device. Switching to 'old' mode.",0);
 //BA.debugLineNum = 73;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 75;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return false;
}
public boolean  _vvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Private Sub IsOld As Boolean";
 //BA.debugLineNum = 407;BA.debugLine="Return SupportLevel = S_OLD";
if (true) return _vvvvvvvvvvvvvvvv1==_s_old;
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return false;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvv7(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Public Sub LargeIcon (Icon As Bitmap) As NB6";
 //BA.debugLineNum = 146;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 147;BA.debugLine="NotificationBuilder.RunMethod(\"setLargeIcon\", Ar";
_vvvvvvvvvvvvvvv6.RunMethod("setLargeIcon",new Object[]{_vvvvvvvvvvvv5(_icon)});
 };
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Public Sub MediaStyle As NB6";
 //BA.debugLineNum = 310;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 311;BA.debugLine="SetStyle(\"android.app.Notification$MediaStyle\",";
_vvvvvvvvvvvvvv0("android.app.Notification$MediaStyle",__c.createMap(new Object[] {(Object)("setShowActionsInCompactView"),(Object)(new int[]{(int) (0),(int) (1),(int) (2)})}));
 };
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvv1(int _num) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Public Sub Number (Num As Int) As NB6";
 //BA.debugLineNum = 210;BA.debugLine="If IsOld Then";
if (_vvvvvvvvvvvvv6()) { 
 //BA.debugLineNum = 211;BA.debugLine="OldNotification.Number = Num";
_vvvvvvvvvvvvvvvv2.setNumber(_num);
 }else {
 //BA.debugLineNum = 213;BA.debugLine="NotificationBuilder.RunMethod(\"setNumber\", Array";
_vvvvvvvvvvvvvvv6.RunMethod("setNumber",new Object[]{(Object)(_num)});
 };
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvv2(String _resourcename) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub OldNotificationIcon (ResourceName As St";
 //BA.debugLineNum = 130;BA.debugLine="If IsOld Then";
if (_vvvvvvvvvvvvv6()) { 
 //BA.debugLineNum = 131;BA.debugLine="OldNotification.Icon = ResourceName";
_vvvvvvvvvvvvvvvv2.setIcon(_resourcename);
 };
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvv3(boolean _ongoingevent) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub OnGoing (OnGoingEvent As Boolean) As NB";
 //BA.debugLineNum = 171;BA.debugLine="If IsOld Then";
if (_vvvvvvvvvvvvv6()) { 
 //BA.debugLineNum = 172;BA.debugLine="OldNotification.OnGoingEvent = OnGoingEvent";
_vvvvvvvvvvvvvvvv2.setOnGoingEvent(_ongoingevent);
 }else {
 //BA.debugLineNum = 174;BA.debugLine="NotificationBuilder.RunMethod(\"setOngoing\", Arra";
_vvvvvvvvvvvvvvv6.RunMethod("setOngoing",new Object[]{(Object)(_ongoingevent)});
 };
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvv4(boolean _once) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub OnlyAlertOnce (Once As Boolean) As NB6";
 //BA.debugLineNum = 154;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 155;BA.debugLine="NotificationBuilder.RunMethod(\"setOnlyAlertOnce\"";
_vvvvvvvvvvvvvvv6.RunMethod("setOnlyAlertOnce",new Object[]{(Object)(_once)});
 };
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvv5(int _value,int _maxvalue,boolean _indeterminate) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Public Sub Progress (Value As Int, MaxValue As Int";
 //BA.debugLineNum = 232;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 233;BA.debugLine="NotificationBuilder.RunMethod(\"setProgress\", Arr";
_vvvvvvvvvvvvvvv6.RunMethod("setProgress",new Object[]{(Object)(_maxvalue),(Object)(_value),(Object)(_indeterminate)});
 };
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvv6(boolean _sound,boolean _light,boolean _vibrate) throws Exception{
int _currentdefaults = 0;
 //BA.debugLineNum = 248;BA.debugLine="Public Sub SetDefaults (Sound As Boolean, Light As";
 //BA.debugLineNum = 249;BA.debugLine="If IsOld Then";
if (_vvvvvvvvvvvvv6()) { 
 //BA.debugLineNum = 250;BA.debugLine="OldNotification.Sound = Sound";
_vvvvvvvvvvvvvvvv2.setSound(_sound);
 //BA.debugLineNum = 251;BA.debugLine="OldNotification.Light = Light";
_vvvvvvvvvvvvvvvv2.setLight(_light);
 //BA.debugLineNum = 252;BA.debugLine="OldNotification.Vibrate = Vibrate";
_vvvvvvvvvvvvvvvv2.setVibrate(_vibrate);
 }else {
 //BA.debugLineNum = 254;BA.debugLine="If IsChannel Then";
if (_vvvvvvvvvvvvv4()) { 
 //BA.debugLineNum = 255;BA.debugLine="Channel.RunMethod(\"enableLights\", Array(Light))";
_vvvvvvvvvvvvvvv5.RunMethod("enableLights",new Object[]{(Object)(_light)});
 //BA.debugLineNum = 256;BA.debugLine="Channel.RunMethod(\"enableVibration\", Array(Vibr";
_vvvvvvvvvvvvvvv5.RunMethod("enableVibration",new Object[]{(Object)(_vibrate)});
 }else {
 //BA.debugLineNum = 258;BA.debugLine="Dim CurrentDefaults As Int";
_currentdefaults = 0;
 //BA.debugLineNum = 259;BA.debugLine="If Sound Then CurrentDefaults = 1";
if (_sound) { 
_currentdefaults = (int) (1);};
 //BA.debugLineNum = 260;BA.debugLine="If Vibrate Then CurrentDefaults = Bit.Or(Curren";
if (_vibrate) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (2));};
 //BA.debugLineNum = 261;BA.debugLine="If Light Then CurrentDefaults = Bit.Or(CurrentD";
if (_light) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (4));};
 //BA.debugLineNum = 262;BA.debugLine="NotificationBuilder.RunMethod(\"setDefaults\", Ar";
_vvvvvvvvvvvvvvv6.RunMethod("setDefaults",new Object[]{(Object)(_currentdefaults)});
 };
 };
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvv7(int _clr,int _onms,int _offms) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Public Sub SetLights (Clr As Int, OnMs As Int, Off";
 //BA.debugLineNum = 326;BA.debugLine="NotificationBuilder.RunMethod(\"setLights\", Array(";
_vvvvvvvvvvvvvvv6.RunMethod("setLights",new Object[]{(Object)(_clr),(Object)(_onms),(Object)(_offms)});
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvv0(String _stylename,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4j.object.JavaObject _style = null;
String _method = "";
Object _value = null;
 //BA.debugLineNum = 332;BA.debugLine="Private Sub SetStyle(StyleName As String, Props As";
 //BA.debugLineNum = 333;BA.debugLine="Dim style As JavaObject";
_style = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 334;BA.debugLine="style.InitializeNewInstance(StyleName, Null)";
_style.InitializeNewInstance(_stylename,(Object[])(__c.Null));
 //BA.debugLineNum = 335;BA.debugLine="For Each method As String In Props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _props.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 336;BA.debugLine="Dim value As Object = Props.Get(method)";
_value = _props.Get((Object)(_method));
 //BA.debugLineNum = 337;BA.debugLine="If value <> Null Then";
if (_value!= null) { 
 //BA.debugLineNum = 338;BA.debugLine="style.RunMethod(method, Array(value))";
_style.RunMethod(_method,new Object[]{_value});
 };
 }
};
 //BA.debugLineNum = 341;BA.debugLine="NotificationBuilder.RunMethod(\"setStyle\", Array(s";
_vvvvvvvvvvvvvvv6.RunMethod("setStyle",new Object[]{(Object)(_style.getObject())});
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return "";
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvvv1(long _time) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Public Sub ShowWhen (Time As Long) As NB6";
 //BA.debugLineNum = 220;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 221;BA.debugLine="NotificationBuilder.RunMethod(\"setShowWhen\", Arr";
_vvvvvvvvvvvvvvv6.RunMethod("setShowWhen",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 222;BA.debugLine="NotificationBuilder.RunMethod(\"setWhen\", Array(T";
_vvvvvvvvvvvvvvv6.RunMethod("setWhen",new Object[]{(Object)(_time)});
 };
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvvv2(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub SmallIcon (Icon As Bitmap) As NB6";
 //BA.debugLineNum = 138;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 139;BA.debugLine="NotificationBuilder.RunMethod(\"setSmallIcon\", Ar";
_vvvvvvvvvvvvvvv6.RunMethod("setSmallIcon",new Object[]{_vvvvvvvvvvvv5(_icon)});
 };
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvvv3(Object _text) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Public Sub SubText (Text As Object) As NB6";
 //BA.debugLineNum = 240;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 241;BA.debugLine="NotificationBuilder.RunMethod(\"setSubText\", Arra";
_vvvvvvvvvvvvvvv6.RunMethod("setSubText",new Object[]{_text});
 };
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public ESH.Hakkuraifu.nb6  _vvvvvvvvvvvvvvv4(String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
 //BA.debugLineNum = 287;BA.debugLine="Public Sub Visibility (Value As String) As NB6";
 //BA.debugLineNum = 288;BA.debugLine="If IsBuilder Then";
if (_vvvvvvvvvvvvv3()) { 
 //BA.debugLineNum = 289;BA.debugLine="Dim m As Map = CreateMap(\"PUBLIC\": 1, \"SECRET\":";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("PUBLIC"),(Object)(1),(Object)("SECRET"),(Object)(-1),(Object)("PRIVATE"),(Object)(0)});
 //BA.debugLineNum = 290;BA.debugLine="Dim i As Int = m.Get(Value)";
_i = (int)(BA.ObjectToNumber(_m.Get((Object)(_value))));
 //BA.debugLineNum = 291;BA.debugLine="NotificationBuilder.RunMethod(\"setVisibility\", A";
_vvvvvvvvvvvvvvv6.RunMethod("setVisibility",new Object[]{(Object)(_i)});
 };
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (ESH.Hakkuraifu.nb6)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
