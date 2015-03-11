// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            k, l

class q
    implements Runnable
{

    final k a;

    private q(k k1)
    {
        a = k1;
        super();
    }

    q(k k1, l l)
    {
        this(k1);
    }

    public void run()
    {
        if (a.u)
        {
            if (a.e() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            k.b(a);
            return;
        }
    }
}
