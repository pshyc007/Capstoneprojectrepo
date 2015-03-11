// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            hq, ig, du, ds, 
//            ev, go, al, gz, 
//            ai, hk, aw

public final class gr
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");

    public static du a(Context context, ds ds1, String s)
    {
        JSONObject jsonobject;
        String s1;
        String s3;
        String s4;
        long l;
        String s5;
        long l1;
        int i;
        du du3;
        Object obj;
        int i1;
        String s2;
        String s6;
        du du1;
        du du2;
        JSONArray jsonarray;
        try
        {
            jsonobject = new JSONObject(s);
            s1 = jsonobject.optString("ad_base_url", null);
            s2 = jsonobject.optString("ad_url", null);
            s3 = jsonobject.optString("ad_size", null);
            s4 = jsonobject.optString("ad_html", null);
        }
        catch (JSONException jsonexception)
        {
            ig.e((new StringBuilder()).append("Could not parse the mediation config: ").append(jsonexception.getMessage()).toString());
            return new du(0);
        }
        l = -1L;
        s5 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L2; else goto _L1
_L1:
        l1 = (long)(1000D * jsonobject.getDouble("interstitial_timeout"));
_L42:
        s6 = jsonobject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(s6)) goto _L4; else goto _L3
_L3:
        i = hq.c();
_L7:
        if (TextUtils.isEmpty(s4))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            ig.e("Could not parse the mediation config: Missing required ad_base_url field");
            return new du(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(s6))
        {
            i = hq.b();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(s2)) goto _L9; else goto _L8
_L8:
        du2 = go.a(context, ds1.k.b, s2, null, null);
        s1 = du2.b;
        s4 = du2.c;
        l = du2.n;
        du3 = du2;
_L41:
        jsonarray = jsonobject.optJSONArray("click_urls");
        if (du3 != null) goto _L11; else goto _L10
_L10:
        obj = null;
_L19:
        if (jsonarray == null) goto _L13; else goto _L12
_L12:
        if (obj != null) goto _L15; else goto _L14
_L14:
        obj = new LinkedList();
          goto _L15
_L18:
        if (i1 >= jsonarray.length()) goto _L17; else goto _L16
_L16:
        ((List) (obj)).add(jsonarray.getString(i1));
        i1++;
          goto _L18
_L9:
        ig.e("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        du1 = new du(0);
        return du1;
_L11:
        obj = du3.d;
          goto _L19
_L40:
        JSONArray jsonarray1 = jsonobject.optJSONArray("impression_urls");
        if (du3 != null) goto _L21; else goto _L20
_L20:
        Object obj2 = null;
_L29:
        if (jsonarray1 == null) goto _L23; else goto _L22
_L22:
        if (obj2 != null) goto _L25; else goto _L24
_L24:
        obj2 = new LinkedList();
          goto _L25
_L28:
        int k;
        if (k >= jsonarray1.length()) goto _L27; else goto _L26
_L26:
        ((List) (obj2)).add(jsonarray1.getString(k));
        k++;
          goto _L28
_L21:
        obj2 = du3.f;
          goto _L29
_L39:
        JSONArray jsonarray2 = jsonobject.optJSONArray("manual_impression_urls");
        if (du3 != null) goto _L31; else goto _L30
_L30:
        Object obj4 = null;
_L37:
        if (jsonarray2 == null) goto _L33; else goto _L32
_L32:
        if (obj4 != null) goto _L35; else goto _L34
_L34:
        obj4 = new LinkedList();
          goto _L35
_L36:
        int j;
        if (j >= jsonarray2.length())
        {
            break MISSING_BLOCK_LABEL_682;
        }
        ((List) (obj4)).add(jsonarray2.getString(j));
        j++;
          goto _L36
_L31:
        obj4 = du3.j;
          goto _L37
_L38:
        if (du3 == null)
        {
            break MISSING_BLOCK_LABEL_536;
        }
        if (du3.l != -1)
        {
            i = du3.l;
        }
        if (du3.g > 0L)
        {
            l1 = du3.g;
        }
        String s7;
        boolean flag;
        s7 = jsonobject.optString("active_view");
        flag = jsonobject.optBoolean("ad_is_javascript", false);
        String s8;
        s8 = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_570;
        }
        s8 = jsonobject.optString("ad_passback_url", null);
        Object obj1;
        Object obj3;
        Object obj5;
        du du4 = new du(s1, s4, ((List) (obj1)), ((List) (obj3)), l1, false, -1L, ((List) (obj5)), -1L, i, s3, l, s5, flag, s8, s7);
        return du4;
_L33:
        obj5 = obj4;
          goto _L38
_L23:
        obj3 = obj2;
          goto _L39
_L13:
        obj1 = obj;
          goto _L40
_L5:
        du3 = null;
          goto _L41
_L2:
        l1 = -1L;
          goto _L42
_L15:
        i1 = 0;
          goto _L18
_L17:
        obj1 = obj;
          goto _L40
_L25:
        k = 0;
          goto _L28
_L27:
        obj3 = obj2;
          goto _L39
_L35:
        j = 0;
          goto _L36
        obj5 = obj4;
          goto _L38
    }

    private static Integer a(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    private static String a(int i)
    {
        Locale locale = Locale.US;
        Object aobj[] = new Object[1];
        aobj[0] = Integer.valueOf(0xffffff & i);
        return String.format(locale, "#%06x", aobj);
    }

    public static String a(ds ds1, gz gz1, Location location, String s)
    {
        HashMap hashmap = new HashMap();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (s.trim() != "")
        {
            hashmap.put("eid", s);
        }
        if (ds1.b != null)
        {
            hashmap.put("ad_pos", ds1.b);
        }
        a(hashmap, ds1.c);
        hashmap.put("format", ds1.d.b);
        if (ds1.d.f == -1)
        {
            hashmap.put("smart_w", "full");
        }
        if (ds1.d.c == -2)
        {
            hashmap.put("smart_h", "auto");
        }
        if (ds1.d.h == null) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        al aal[];
        int i;
        stringbuilder = new StringBuilder();
        aal = ds1.d.h;
        i = aal.length;
        int j = 0;
_L8:
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        al al1;
        al1 = aal[j];
        if (stringbuilder.length() != 0)
        {
            stringbuilder.append("|");
        }
        if (al1.f != -1) goto _L4; else goto _L3
_L3:
        int k = (int)((float)al1.g / gz1.q);
_L5:
        int l;
        stringbuilder.append(k);
        stringbuilder.append("x");
        if (al1.c != -2)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        l = (int)((float)al1.d / gz1.q);
_L6:
        stringbuilder.append(l);
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        k = al1.f;
          goto _L5
        l = al1.c;
          goto _L6
        hashmap.put("sz", stringbuilder);
_L2:
        String s1;
        hashmap.put("slotname", ds1.e);
        hashmap.put("pn", ds1.f.packageName);
        if (ds1.g != null)
        {
            hashmap.put("vc", Integer.valueOf(ds1.g.versionCode));
        }
        hashmap.put("ms", ds1.h);
        hashmap.put("ms2", ds1.m);
        hashmap.put("seq_num", ds1.i);
        hashmap.put("session_id", ds1.j);
        hashmap.put("js", ds1.k.b);
        a(hashmap, gz1);
        if (ds1.c.a >= 2 && ds1.c.k != null)
        {
            a(hashmap, ds1.c.k);
        }
        if (ds1.a >= 2)
        {
            hashmap.put("quality_signals", ds1.l);
        }
        if (ig.a(2))
        {
            String s2 = hq.a(hashmap).toString(2);
            ig.d((new StringBuilder()).append("Ad Request JSON: ").append(s2).toString());
        }
        s1 = hq.a(hashmap).toString();
        return s1;
        JSONException jsonexception;
        jsonexception;
        ig.e((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(jsonexception.getMessage()).toString());
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(HashMap hashmap, Location location)
    {
        HashMap hashmap1 = new HashMap();
        Float float1 = Float.valueOf(1000F * location.getAccuracy());
        Long long1 = Long.valueOf(1000L * location.getTime());
        Long long2 = Long.valueOf((long)(10000000D * location.getLatitude()));
        Long long3 = Long.valueOf((long)(10000000D * location.getLongitude()));
        hashmap1.put("radius", float1);
        hashmap1.put("lat", long2);
        hashmap1.put("long", long3);
        hashmap1.put("time", long1);
        hashmap.put("uule", hashmap1);
    }

    private static void a(HashMap hashmap, ai ai1)
    {
        String s = hk.a();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (ai1.b != -1L)
        {
            hashmap.put("cust_age", a.format(new Date(ai1.b)));
        }
        if (ai1.c != null)
        {
            hashmap.put("extras", ai1.c);
        }
        if (ai1.d != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(ai1.d));
        }
        if (ai1.e != null)
        {
            hashmap.put("kw", ai1.e);
        }
        if (ai1.g != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(ai1.g));
        }
        if (ai1.f)
        {
            hashmap.put("adtest", "on");
        }
        if (ai1.a >= 2)
        {
            if (ai1.h)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(ai1.i))
            {
                hashmap.put("ppid", ai1.i);
            }
            if (ai1.j != null)
            {
                a(hashmap, ai1.j);
            }
        }
        if (ai1.a >= 3 && ai1.l != null)
        {
            hashmap.put("url", ai1.l);
        }
    }

    private static void a(HashMap hashmap, aw aw1)
    {
        if (Color.alpha(aw1.b) != 0)
        {
            hashmap.put("acolor", a(aw1.b));
        }
        if (Color.alpha(aw1.c) != 0)
        {
            hashmap.put("bgcolor", a(aw1.c));
        }
        if (Color.alpha(aw1.d) != 0 && Color.alpha(aw1.e) != 0)
        {
            hashmap.put("gradientto", a(aw1.d));
            hashmap.put("gradientfrom", a(aw1.e));
        }
        if (Color.alpha(aw1.f) != 0)
        {
            hashmap.put("bcolor", a(aw1.f));
        }
        hashmap.put("bthick", Integer.toString(aw1.g));
        aw1.h;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 366
    //                   1 373
    //                   2 380
    //                   3 387;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = null;
_L10:
        int i;
        String s1;
        if (s != null)
        {
            hashmap.put("btype", s);
        }
        i = aw1.i;
        s1 = null;
        i;
        JVM INSTR tableswitch 0 2: default 228
    //                   0 402
    //                   1 410
    //                   2 394;
           goto _L6 _L7 _L8 _L9
_L6:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_410;
_L11:
        if (s1 != null)
        {
            hashmap.put("callbuttoncolor", s1);
        }
        if (aw1.j != null)
        {
            hashmap.put("channel", aw1.j);
        }
        if (Color.alpha(aw1.k) != 0)
        {
            hashmap.put("dcolor", a(aw1.k));
        }
        if (aw1.l != null)
        {
            hashmap.put("font", aw1.l);
        }
        if (Color.alpha(aw1.m) != 0)
        {
            hashmap.put("hcolor", a(aw1.m));
        }
        hashmap.put("headersize", Integer.toString(aw1.n));
        if (aw1.o != null)
        {
            hashmap.put("q", aw1.o);
        }
        return;
_L2:
        s = "none";
          goto _L10
_L3:
        s = "dashed";
          goto _L10
_L4:
        s = "dotted";
          goto _L10
_L5:
        s = "solid";
          goto _L10
_L9:
        s1 = "dark";
          goto _L11
_L7:
        s1 = "light";
          goto _L11
        s1 = "medium";
          goto _L11
    }

    private static void a(HashMap hashmap, gz gz1)
    {
        hashmap.put("am", Integer.valueOf(gz1.a));
        hashmap.put("cog", a(gz1.b));
        hashmap.put("coh", a(gz1.c));
        if (!TextUtils.isEmpty(gz1.d))
        {
            hashmap.put("carrier", gz1.d);
        }
        hashmap.put("gl", gz1.e);
        if (gz1.f)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", a(gz1.g));
        hashmap.put("sp", a(gz1.h));
        hashmap.put("hl", gz1.i);
        if (!TextUtils.isEmpty(gz1.j))
        {
            hashmap.put("mv", gz1.j);
        }
        hashmap.put("muv", Integer.valueOf(gz1.k));
        if (gz1.l != -2)
        {
            hashmap.put("cnt", Integer.valueOf(gz1.l));
        }
        hashmap.put("gnt", Integer.valueOf(gz1.m));
        hashmap.put("pt", Integer.valueOf(gz1.n));
        hashmap.put("rm", Integer.valueOf(gz1.o));
        hashmap.put("riv", Integer.valueOf(gz1.p));
        hashmap.put("u_sd", Float.valueOf(gz1.q));
        hashmap.put("sh", Integer.valueOf(gz1.s));
        hashmap.put("sw", Integer.valueOf(gz1.r));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", gz1.w);
        bundle.putBoolean("active_network_metered", gz1.v);
        hashmap.put("connectivity", bundle);
        Bundle bundle1 = new Bundle();
        bundle1.putBoolean("is_charging", gz1.u);
        bundle1.putDouble("battery_level", gz1.t);
        hashmap.put("battery", bundle1);
    }

}
