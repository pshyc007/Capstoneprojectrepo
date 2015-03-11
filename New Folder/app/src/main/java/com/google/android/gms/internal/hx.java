// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            hw

class hx
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final hw b;

    hx(hw hw1, String s)
    {
        b = hw1;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        hw.a(b).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", a), "Share via"));
    }
}
