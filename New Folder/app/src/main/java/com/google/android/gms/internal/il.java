// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            db, ik

class il
    implements Runnable
{

    final db a;
    final ik b;

    il(ik ik, db db1)
    {
        b = ik;
        a = db1;
        super();
    }

    public void run()
    {
        a.k();
    }
}
