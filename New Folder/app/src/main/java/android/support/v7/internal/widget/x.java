// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            t, u

class x
    implements Runnable
{

    final t a;

    private x(t t1)
    {
        a = t1;
        super();
    }

    x(t t1, u u)
    {
        this(t1);
    }

    public void run()
    {
        a.e();
    }
}
