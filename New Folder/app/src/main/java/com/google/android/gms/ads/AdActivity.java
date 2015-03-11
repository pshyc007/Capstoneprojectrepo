// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.ig;

public final class AdActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private dp a;

    public AdActivity()
    {
    }

    private void a()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.j();
        return;
        RemoteException remoteexception;
        remoteexception;
        ig.c("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = dn.a(this);
        if (a == null)
        {
            ig.e("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            a.a(bundle);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onCreate to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (a != null)
            {
                a.i();
            }
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (a != null)
            {
                a.g();
            }
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (a != null)
            {
                a.d();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (a != null)
            {
                a.f();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (a != null)
            {
                a.b(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (a != null)
            {
                a.e();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (a != null)
            {
                a.h();
            }
        }
        catch (RemoteException remoteexception)
        {
            ig.c("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        a();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        a();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        a();
    }
}
