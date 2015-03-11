// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class mj
{

    private static final Pattern a = Pattern.compile("\\\\.");
    private static final Pattern b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Matcher matcher;
        StringBuffer stringbuffer;
        matcher = b.matcher(s);
        stringbuffer = null;
_L5:
        if (matcher.find())
        {
            if (stringbuffer == null)
            {
                stringbuffer = new StringBuffer();
            }
            switch (matcher.group().charAt(0))
            {
            case 8: // '\b'
                matcher.appendReplacement(stringbuffer, "\\\\b");
                break;

            case 34: // '"'
                matcher.appendReplacement(stringbuffer, "\\\\\\\"");
                break;

            case 92: // '\\'
                matcher.appendReplacement(stringbuffer, "\\\\\\\\");
                break;

            case 47: // '/'
                matcher.appendReplacement(stringbuffer, "\\\\/");
                break;

            case 12: // '\f'
                matcher.appendReplacement(stringbuffer, "\\\\f");
                break;

            case 10: // '\n'
                matcher.appendReplacement(stringbuffer, "\\\\n");
                break;

            case 13: // '\r'
                matcher.appendReplacement(stringbuffer, "\\\\r");
                break;

            case 9: // '\t'
                matcher.appendReplacement(stringbuffer, "\\\\t");
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (stringbuffer != null) goto _L3; else goto _L2
_L2:
        return s;
_L3:
        matcher.appendTail(stringbuffer);
        return stringbuffer.toString();
        if (true) goto _L5; else goto _L4
_L4:
    }

}
