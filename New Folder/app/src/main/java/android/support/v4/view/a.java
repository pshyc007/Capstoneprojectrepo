// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            d, c, b, e

public class a
{

    private static final c b;
    private static final Object c;
    final Object a;

    Object a()
    {
        return a;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new b();
        } else
        {
            b = new e();
        }
        c = b.a();
    }
}
