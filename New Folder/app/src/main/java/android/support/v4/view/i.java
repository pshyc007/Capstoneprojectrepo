// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            l, k, j

public class i
{

    static final j a;

    public static int a(int i1, int j1)
    {
        return a.a(i1, j1);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new l();
        } else
        {
            a = new k();
        }
    }
}
