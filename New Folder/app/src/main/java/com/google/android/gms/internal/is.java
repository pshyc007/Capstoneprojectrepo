// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class is
    implements android.content.DialogInterface.OnClickListener
{

    final JsPromptResult a;

    is(JsPromptResult jspromptresult)
    {
        a = jspromptresult;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.cancel();
    }
}
