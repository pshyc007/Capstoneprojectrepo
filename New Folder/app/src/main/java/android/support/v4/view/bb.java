// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            be

final class bb
    implements Comparator
{

    bb()
    {
    }

    public int a(be be1, be be2)
    {
        return be1.b - be2.b;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((be)obj, (be)obj1);
    }
}
