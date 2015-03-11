// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ev, hq, ic, jn, 
//            jp, ia, ik, in, 
//            ij, al, ig, no, 
//            db

public class ii extends WebView
    implements DownloadListener
{

    private final ik a;
    private final ij b;
    private final Object c = new Object();
    private final no d;
    private final ev e;
    private db f;
    private al g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final WindowManager k = (WindowManager)getContext().getSystemService("window");

    private ii(ij ij1, al al1, boolean flag, boolean flag1, no no1, ev ev1)
    {
        super(ij1);
        b = ij1;
        g = al1;
        h = flag;
        d = no1;
        e = ev1;
        setBackgroundColor(0);
        WebSettings websettings = getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setSavePassword(false);
        websettings.setSupportMultipleWindows(true);
        websettings.setJavaScriptCanOpenWindowsAutomatically(true);
        hq.a(ij1, ev1.b, websettings);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ic.a(getContext(), websettings);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ia.a(getContext(), websettings);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new jn(this, flag1);
        } else
        {
            a = new ik(this, flag1);
        }
        setWebViewClient(a);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new jp(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new in(this));
        }
        l();
    }

    public static ii a(Context context, al al1, boolean flag, boolean flag1, no no1, ev ev1)
    {
        return new ii(new ij(context), al1, flag, flag1, no1, ev1);
    }

    private void l()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!h && !g.e) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        ig.a("Disabling hardware acceleration on an overlay.");
        m();
_L5:
        return;
_L4:
        ig.a("Enabling hardware acceleration on an overlay.");
        n();
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                break label0;
            }
            ig.a("Disabling hardware acceleration on an AdView.");
            m();
        }
          goto _L5
        ig.a("Enabling hardware acceleration on an AdView.");
        n();
          goto _L5
    }

    private void m()
    {
        synchronized (c)
        {
            if (!i && android.os.Build.VERSION.SDK_INT >= 11)
            {
                ia.a(this);
            }
            i = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void n()
    {
        synchronized (c)
        {
            if (i && android.os.Build.VERSION.SDK_INT >= 11)
            {
                ia.b(this);
            }
            i = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        if (!f().a())
        {
            return;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        Display display = k.getDefaultDisplay();
        display.getMetrics(displaymetrics);
        int i1 = hq.c(getContext());
        float f1 = 160F / (float)displaymetrics.densityDpi;
        int j1 = (int)(f1 * (float)displaymetrics.widthPixels);
        int k1 = (int)(f1 * (float)(displaymetrics.heightPixels - i1));
        try
        {
            b("onScreenInfoChanged", (new JSONObject()).put("width", j1).put("height", k1).put("density", displaymetrics.density).put("rotation", display.getRotation()));
            return;
        }
        catch (JSONException jsonexception)
        {
            ig.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void a(Context context, al al1)
    {
        synchronized (c)
        {
            b.setBaseContext(context);
            f = null;
            g = al1;
            h = false;
            hq.b(this);
            loadUrl("about:blank");
            a.b();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(al al1)
    {
        synchronized (c)
        {
            g = al1;
            requestLayout();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(db db)
    {
        synchronized (c)
        {
            f = db;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(String s)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (k())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        ig.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(String s, Map map)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = hq.a(map);
        }
        catch (JSONException jsonexception)
        {
            ig.e("Could not convert parameters to JSON.");
            return;
        }
        b(s, jsonobject);
    }

    public void a(String s, JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            jsonobject = new JSONObject();
        }
        String s1 = jsonobject.toString();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("javascript:").append(s).append("(").toString());
        stringbuilder.append(s1);
        stringbuilder.append(");");
        a(stringbuilder.toString());
    }

    public void a(boolean flag)
    {
        synchronized (c)
        {
            h = flag;
            l();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.b);
        a("onhide", hashmap);
    }

    public void b(String s, JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            jsonobject = new JSONObject();
        }
        String s1 = jsonobject.toString();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("javascript:AFMA_ReceiveMessage('");
        stringbuilder.append(s);
        stringbuilder.append("'");
        stringbuilder.append(",");
        stringbuilder.append(s1);
        stringbuilder.append(");");
        ig.d((new StringBuilder()).append("Dispatching AFMA event: ").append(stringbuilder).toString());
        a(stringbuilder.toString());
    }

    public void c()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.b);
        a("onshow", hashmap);
    }

    public db d()
    {
        db db;
        synchronized (c)
        {
            db = f;
        }
        return db;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void destroy()
    {
        synchronized (c)
        {
            super.destroy();
            j = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public al e()
    {
        al al1;
        synchronized (c)
        {
            al1 = g;
        }
        return al1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ik f()
    {
        return a;
    }

    public no g()
    {
        return d;
    }

    public ev h()
    {
        return e;
    }

    public boolean i()
    {
        boolean flag;
        synchronized (c)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Context j()
    {
        return b.a();
    }

    public boolean k()
    {
        boolean flag;
        synchronized (c)
        {
            flag = j;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l1)
    {
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(s), s3);
            getContext().startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            ig.a((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
label0:
        {
            k1 = 0x7fffffff;
            synchronized (c)
            {
                if (!isInEditMode() && !h)
                {
                    break label0;
                }
                super.onMeasure(i1, j1);
            }
            return;
        }
        int l1;
        int i2;
        int j2;
        int k2;
        l1 = android.view.View.MeasureSpec.getMode(i1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getMode(j1);
        k2 = android.view.View.MeasureSpec.getSize(j1);
        break MISSING_BLOCK_LABEL_61;
_L3:
        if (g.g <= l2 && g.d <= k1)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        float f1 = b.getResources().getDisplayMetrics().density;
        ig.e((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)g.g / f1)).append("x").append((int)((float)g.d / f1)).append(" dp, but only has ").append((int)((float)i2 / f1)).append("x").append((int)((float)k2 / f1)).append(" dp.").toString());
        if (getVisibility() != 8)
        {
            setVisibility(4);
        }
        setMeasuredDimension(0, 0);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (getVisibility() != 8)
        {
            setVisibility(0);
        }
        setMeasuredDimension(g.g, g.d);
          goto _L1
        int l2;
        if (l1 != 0x80000000 && l1 != 0x40000000)
        {
            l2 = k1;
        } else
        {
            l2 = i2;
        }
        if (j2 == 0x80000000 || j2 == 0x40000000)
        {
            k1 = k2;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d != null)
        {
            d.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void setContext(Context context)
    {
        b.setBaseContext(context);
    }
}
