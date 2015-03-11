// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            ig, ce, dm

public final class cz
{

    public static boolean a(Context context, ce ce1, dm dm1)
    {
        if (ce1 == null)
        {
            ig.e("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(ce1.c))
        {
            ig.e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(ce1.d))
        {
            intent.setDataAndType(Uri.parse(ce1.c), ce1.d);
        } else
        {
            intent.setData(Uri.parse(ce1.c));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(ce1.e))
        {
            intent.setPackage(ce1.e);
        }
        if (!TextUtils.isEmpty(ce1.f))
        {
            String as[] = ce1.f.split("/", 2);
            if (as.length < 2)
            {
                ig.e((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(ce1.f).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            ig.d((new StringBuilder()).append("Launching an intent: ").append(intent).toString());
            context.startActivity(intent);
            dm1.q();
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            ig.e(activitynotfoundexception.getMessage());
            return false;
        }
        return true;
    }
}
