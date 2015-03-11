// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            op

public class oq extends Exception
{

    final op a;

    public oq(op op)
    {
        a = op;
        super();
    }

    public oq(op op, Throwable throwable)
    {
        a = op;
        super(throwable);
    }
}
