// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.common.g;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            z, aq, bc, be, 
//            bn, dh, dm, fq, 
//            hi, ow, oy, pb, 
//            pe, b, hq, hd, 
//            ii, ig, u, oz, 
//            he, ev, bm, bt, 
//            bl, by, al, hg, 
//            gh, if, lr, ei, 
//            dz, ai, hw, bo, 
//            hj, ik, pd, c, 
//            ae, eb, fa, cq, 
//            ec, en, fo, v, 
//            ch, db, hl, bv

public class ox extends z
    implements aq, bc, be, bn, dh, dm, fq, hi, ow
{

    private final bv a;
    private final pb b;
    private final pe c = new pe(this);
    private final b d = new b();
    private boolean e;
    private final ComponentCallbacks f = new oy(this);

    public ox(Context context, al al1, String s1, bv bv, ev ev1)
    {
        b = new pb(context, al1, s1, ev1);
        a = bv;
        hq.b(context);
        s();
    }

    private void A()
    {
        if (b.i != null)
        {
            b.i.b.destroy();
            b.i = null;
        }
    }

    static pb a(ox ox1)
    {
        return ox1.b;
    }

    private void a(int i1)
    {
        ig.e((new StringBuilder()).append("Failed to load ad: ").append(i1).toString());
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        b.f.a(i1);
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        b.a.addView(view, layoutparams);
    }

    private void b(boolean flag)
    {
        if (b.i == null)
        {
            ig.e("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.internal.ig.a("Pinging Impression URLs.");
            b.j.a();
            if (b.i.e != null)
            {
                com.google.android.gms.internal.hq.a(b.c, b.e.b, b.i.e);
            }
            if (b.i.o != null && b.i.o.d != null)
            {
                com.google.android.gms.internal.bt.a(b.c, b.e.b, b.i, b.b, flag, b.i.o.d);
            }
            if (b.i.l != null && b.i.l.f != null)
            {
                com.google.android.gms.internal.bt.a(b.c, b.e.b, b.i, b.b, flag, b.i.l.f);
                return;
            }
        }
    }

    private boolean b(hd hd1)
    {
        if (hd1.k)
        {
            View view1;
            View view2;
            try
            {
                view1 = (View)com.google.android.gms.a.d.a(hd1.m.a());
            }
            catch (RemoteException remoteexception1)
            {
                ig.c("Could not get View from mediation adapter.", remoteexception1);
                return false;
            }
            view2 = b.a.getNextView();
            if (view2 != null)
            {
                b.a.removeView(view2);
            }
            try
            {
                a(view1);
            }
            catch (Throwable throwable)
            {
                ig.c("Could not add mediation view to view hierarchy.", throwable);
                return false;
            }
        } else
        if (hd1.r != null)
        {
            hd1.b.a(hd1.r);
            b.a.removeAllViews();
            b.a.setMinimumWidth(hd1.r.g);
            b.a.setMinimumHeight(hd1.r.d);
            a(hd1.b);
        }
        if (b.a.getChildCount() > 1)
        {
            b.a.showNext();
        }
        if (b.i != null)
        {
            View view = b.a.getNextView();
            if (view instanceof ii)
            {
                ((ii)view).a(b.c, b.h);
            } else
            if (view != null)
            {
                b.a.removeView(view);
            }
            if (b.i.m != null)
            {
                try
                {
                    b.i.m.c();
                }
                catch (RemoteException remoteexception)
                {
                    ig.e("Could not destroy previous mediation adapter.");
                }
            }
        }
        b.a.setVisibility(0);
        return true;
    }

    private gh c(ai ai1)
    {
        ApplicationInfo applicationinfo = b.c.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo1 = b.c.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        android.content.pm.PackageInfo packageinfo = packageinfo1;
_L1:
        Bundle bundle;
        if (!b.h.e && b.a.getParent() != null)
        {
            int ai2[] = new int[2];
            b.a.getLocationOnScreen(ai2);
            int i1 = ai2[0];
            int j1 = ai2[1];
            DisplayMetrics displaymetrics = b.c.getResources().getDisplayMetrics();
            int k1 = b.a.getWidth();
            int l1 = b.a.getHeight();
            android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
            String s1;
            Bundle bundle1;
            int i2;
            if (b.a.isShown() && i1 + k1 > 0 && j1 + l1 > 0 && i1 <= displaymetrics.widthPixels && j1 <= displaymetrics.heightPixels)
            {
                i2 = 1;
            } else
            {
                i2 = 0;
            }
            bundle = new Bundle(5);
            bundle.putInt("x", i1);
            bundle.putInt("y", j1);
            bundle.putInt("width", k1);
            bundle.putInt("height", l1);
            bundle.putInt("visible", i2);
        } else
        {
            bundle = null;
        }
        s1 = hg.b();
        b.j = new he(s1, b.b);
        b.j.a(ai1);
        bundle1 = com.google.android.gms.internal.hg.a(b.c, this, s1);
        return new gh(bundle, ai1, b.h, b.b, applicationinfo, packageinfo, s1, com.google.android.gms.internal.hg.a, b.e, bundle1);
        namenotfoundexception;
        packageinfo = null;
          goto _L1
    }

    private void s()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && b != null && b.c != null)
        {
            b.c.registerComponentCallbacks(f);
        }
    }

    private void t()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && b != null && b.c != null)
        {
            b.c.unregisterComponentCallbacks(f);
        }
    }

    private void u()
    {
        ig.c("Ad closing.");
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b.f.a();
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void v()
    {
        ig.c("Ad leaving application.");
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b.f.b();
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void w()
    {
        ig.c("Ad opening.");
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b.f.d();
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void x()
    {
        ig.c("Ad finished loading.");
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b.f.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private boolean y()
    {
        boolean flag = true;
        if (!com.google.android.gms.internal.hq.a(b.c.getPackageManager(), b.c.getPackageName(), "android.permission.INTERNET"))
        {
            if (!b.h.e)
            {
                com.google.android.gms.internal.if.a(b.a, b.h, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!com.google.android.gms.internal.hq.a(b.c))
        {
            if (!b.h.e)
            {
                com.google.android.gms.internal.if.a(b.a, b.h, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && !b.h.e)
        {
            b.a.setVisibility(0);
        }
        return flag;
    }

    private void z()
    {
        if (b.i == null)
        {
            ig.e("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.internal.ig.a("Pinging click URLs.");
            b.j.b();
            if (b.i.c != null)
            {
                com.google.android.gms.internal.hq.a(b.c, b.e.b, b.i.c);
            }
            if (b.i.o != null && b.i.o.c != null)
            {
                com.google.android.gms.internal.bt.a(b.c, b.e.b, b.i, b.b, false, b.i.o.c);
                return;
            }
        }
    }

    public a a()
    {
        lr.b("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.a.d.a(b.a);
    }

    public void a(ae ae1)
    {
        lr.b("setAppEventListener must be called on the main UI thread.");
        b.k = ae1;
    }

    public void a(al al1)
    {
        lr.b("setAdSize must be called on the main UI thread.");
        b.h = al1;
        if (b.i != null)
        {
            b.i.b.a(al1);
        }
        if (b.a.getChildCount() > 1)
        {
            b.a.removeView(b.a.getNextView());
        }
        b.a.setMinimumWidth(al1.g);
        b.a.setMinimumHeight(al1.d);
        b.a.requestLayout();
    }

    public void a(en en1)
    {
        lr.b("setInAppPurchaseListener must be called on the main UI thread.");
        b.m = en1;
    }

    public void a(fa fa1, String s1)
    {
        lr.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        b.n = new ei(s1);
        b.l = fa1;
        if (!hg.f() && fa1 != null)
        {
            (new dz(b.c, b.l, b.n)).e();
        }
    }

    public void a(hd hd1)
    {
        boolean flag;
        b.g = null;
        if (hd1.d != -2 && hd1.d != 3)
        {
            com.google.android.gms.internal.hg.a(b.a());
        }
        if (hd1.d == -1)
        {
            return;
        }
        if (hd1.a.c != null)
        {
            flag = hd1.a.c.getBoolean("_noRefresh", false);
        } else
        {
            flag = false;
        }
        if (!b.h.e) goto _L2; else goto _L1
_L1:
        com.google.android.gms.internal.hq.a(hd1.b);
_L4:
        if (hd1.d == 3 && hd1.o != null && hd1.o.e != null)
        {
            com.google.android.gms.internal.ig.a("Pinging no fill URLs.");
            com.google.android.gms.internal.bt.a(b.c, b.e.b, hd1, b.b, false, hd1.o.e);
        }
        if (hd1.d != -2)
        {
            a(hd1.d);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            if (hd1.h > 0L)
            {
                c.a(hd1.a, hd1.h);
            } else
            if (hd1.o != null && hd1.o.g > 0L)
            {
                c.a(hd1.a, hd1.o.g);
            } else
            if (!hd1.k && hd1.d == 2)
            {
                c.a(hd1.a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!b.h.e)
        {
            if (!b(hd1))
            {
                a(0);
                return;
            }
            if (b.a != null)
            {
                com.google.android.gms.internal.oz.a(b.a).a(hd1.v);
            }
        }
        if (b.i != null && b.i.p != null)
        {
            b.i.p.a(null);
        }
        if (hd1.p != null)
        {
            hd1.p.a(this);
        }
        d.b(b.i);
        b.i = hd1;
        if (hd1.r != null)
        {
            b.h = hd1.r;
        }
        b.j.a(hd1.t);
        b.j.b(hd1.u);
        b.j.a(b.h.e);
        b.j.b(hd1.k);
        if (!b.h.e)
        {
            b(false);
        }
        if (b.o == null)
        {
            b.o = new hj(b.b);
        }
        int i1;
        int j1;
        if (hd1.o != null)
        {
            i1 = hd1.o.h;
            j1 = hd1.o.i;
        } else
        {
            i1 = 0;
            j1 = 0;
        }
        b.o.a(i1, j1);
        if (!b.h.e && hd1.b != null && (hd1.b.f().a() || hd1.j != null))
        {
            c c1 = d.a(b.h, b.i);
            if (hd1.b.f().a() && c1 != null)
            {
                c1.a(new pd(hd1.b));
            }
        }
        b.i.b.a();
        x();
        return;
    }

    public void a(u u1)
    {
        lr.b("setAdListener must be called on the main UI thread.");
        b.f = u1;
    }

    public void a(String s1, String s2)
    {
        if (b.k == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        b.k.a(s1, s2);
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not call the AppEventListener.", remoteexception);
        return;
    }

    public void a(String s1, ArrayList arraylist)
    {
        eb eb1 = new eb(s1, arraylist, b.c, b.e.b);
        if (b.m != null) goto _L2; else goto _L1
_L1:
        ig.e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
        if (com.google.android.gms.common.g.a(b.c) == 0) goto _L4; else goto _L3
_L3:
        ig.e("Google Play Service unavailable, cannot launch default purchase flow.");
_L6:
        return;
_L4:
        if (b.l == null)
        {
            ig.e("PlayStorePurchaseListener is not set.");
            return;
        }
        if (b.n == null)
        {
            ig.e("PlayStorePurchaseVerifier is not initialized.");
            return;
        }
        boolean flag = b.l.a(s1);
        if (!flag) goto _L6; else goto _L5
_L5:
        com.google.android.gms.internal.ec.a(b.c, b.e.e, new cq(eb1, b.l, b.n, b.c));
        return;
        RemoteException remoteexception1;
        remoteexception1;
        ig.e("Could not start In-App purchase.");
        if (true) goto _L5; else goto _L2
_L2:
        try
        {
            b.m.a(eb1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.e("Could not start In-App purchase.");
        }
        return;
    }

    public void a(HashSet hashset)
    {
        b.a(hashset);
    }

    public void a(boolean flag)
    {
        b.p = flag;
    }

    public boolean a(ai ai1)
    {
        lr.b("loadAd must be called on the main UI thread.");
        if (b.g == null) goto _L2; else goto _L1
_L1:
        ig.e("An ad request is already in progress. Aborting.");
_L4:
        return false;
_L2:
        if (b.h.e && b.i != null)
        {
            ig.e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (!y()) goto _L4; else goto _L3
_L3:
        gh gh1;
        ig.c("Starting ad request.");
        if (!ai1.f)
        {
            ig.c((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(com.google.android.gms.internal.if.a(b.c)).append("\") to get test ads on this device.").toString());
        }
        c.a();
        b.p = false;
        gh1 = c(ai1);
        if (!b.h.e) goto _L6; else goto _L5
_L5:
        ii ii2;
        ii ii3 = com.google.android.gms.internal.ii.a(b.c, b.h, false, false, b.d, b.e);
        ii3.f().a(this, null, this, this, true, this, this);
        ii2 = ii3;
_L8:
        b.g = com.google.android.gms.internal.fo.a(b.c, gh1, b.d, ii2, a, this);
        return true;
_L6:
        View view;
        ii ii1;
        view = b.a.getNextView();
        if (!(view instanceof ii))
        {
            break; /* Loop/switch isn't completed */
        }
        ii1 = (ii)view;
        ii1.a(b.c, b.h);
_L9:
        ii1.f().a(this, this, this, this, false, this);
        ii2 = ii1;
        if (true) goto _L8; else goto _L7
_L7:
        if (view != null)
        {
            b.a.removeView(view);
        }
        ii1 = com.google.android.gms.internal.ii.a(b.c, b.h, false, false, b.d, b.e);
        if (b.h.h == null)
        {
            a(((View) (ii1)));
        }
          goto _L9
        if (true) goto _L8; else goto _L10
_L10:
    }

    public void b()
    {
        lr.b("destroy must be called on the main UI thread.");
        t();
        b.f = null;
        b.k = null;
        c.a();
        d.a();
        g();
        if (b.a != null)
        {
            b.a.removeAllViews();
        }
        if (b.i != null && b.i.b != null)
        {
            b.i.b.destroy();
        }
        if (b.i == null || b.i.m == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        b.i.m.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.e("Could not destroy mediation adapter.");
        return;
    }

    public void b(ai ai1)
    {
        android.view.ViewParent viewparent = b.a.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && com.google.android.gms.internal.hq.a() && !e)
        {
            a(ai1);
            return;
        } else
        {
            ig.c("Ad is not visible. Not refreshing ad.");
            c.a(ai1);
            return;
        }
    }

    public boolean c()
    {
        lr.b("isLoaded must be called on the main UI thread.");
        return b.g == null && b.i != null;
    }

    public void d()
    {
        lr.b("pause must be called on the main UI thread.");
        if (b.i != null)
        {
            com.google.android.gms.internal.hq.a(b.i.b);
        }
        if (b.i != null && b.i.m != null)
        {
            try
            {
                b.i.m.d();
            }
            catch (RemoteException remoteexception)
            {
                ig.e("Could not pause mediation adapter.");
            }
        }
        d.b();
        c.b();
    }

    public void e()
    {
        lr.b("resume must be called on the main UI thread.");
        if (b.i != null)
        {
            hq.b(b.i.b);
        }
        if (b.i != null && b.i.m != null)
        {
            try
            {
                b.i.m.e();
            }
            catch (RemoteException remoteexception)
            {
                ig.e("Could not resume mediation adapter.");
            }
        }
        c.c();
        d.c();
    }

    public void f()
    {
        lr.b("showInterstitial must be called on the main UI thread.");
        if (!b.h.e)
        {
            ig.e("Cannot call showInterstitial on a banner ad.");
            return;
        }
        if (b.i == null)
        {
            ig.e("The interstitial has not loaded.");
            return;
        }
        if (b.i.b.i())
        {
            ig.e("The interstitial is already showing.");
            return;
        }
        b.i.b.a(true);
        if (b.i.b.f().a() || b.i.j != null)
        {
            c c1 = d.a(b.h, b.i);
            if (b.i.b.f().a() && c1 != null)
            {
                c1.a(new pd(b.i.b));
            }
        }
        if (b.i.k)
        {
            try
            {
                b.i.m.b();
                return;
            }
            catch (RemoteException remoteexception)
            {
                ig.c("Could not show interstitial.", remoteexception);
            }
            A();
            return;
        }
        v v1 = new v(b.p, false);
        if (b.c instanceof Activity)
        {
            Window window = ((Activity)b.c).getWindow();
            Rect rect = new Rect();
            Rect rect1 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect);
            window.getDecorView().getWindowVisibleDisplayFrame(rect1);
            if (rect.bottom != 0 && rect1.bottom != 0)
            {
                boolean flag = b.p;
                ch ch1;
                boolean flag1;
                if (rect.top == rect1.top)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                v1 = new v(flag, flag1);
            }
        }
        ch1 = new ch(this, this, this, b.i.b, b.i.g, b.e, b.i.v, v1);
        com.google.android.gms.internal.db.a(b.c, ch1);
    }

    public void g()
    {
        lr.b("stopLoading must be called on the main UI thread.");
        if (b.i != null)
        {
            b.i.b.stopLoading();
            b.i = null;
        }
        if (b.g != null)
        {
            b.g.f();
        }
    }

    public void h()
    {
        lr.b("recordManualImpression must be called on the main UI thread.");
        if (b.i == null)
        {
            ig.e("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.internal.ig.a("Pinging manual tracking URLs.");
            if (b.i.f != null)
            {
                com.google.android.gms.internal.hq.a(b.c, b.e.b, b.i.f);
                return;
            }
        }
    }

    public al i()
    {
        lr.b("getAdSize must be called on the main UI thread.");
        return b.h;
    }

    public void j()
    {
        r();
    }

    public void k()
    {
        o();
    }

    public void l()
    {
        q();
    }

    public void m()
    {
        p();
    }

    public void n()
    {
        if (b.i != null)
        {
            ig.e((new StringBuilder()).append("Mediation adapter ").append(b.i.n).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        b(true);
        x();
    }

    public void o()
    {
        d.b(b.i);
        if (b.h.e)
        {
            A();
        }
        e = false;
        u();
        b.j.c();
    }

    public void p()
    {
        if (b.h.e)
        {
            b(false);
        }
        e = true;
        w();
    }

    public void q()
    {
        v();
    }

    public void r()
    {
        z();
    }
}
