// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.d.d;
import android.support.v4.d.m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            w, z, h

class y extends w
{

    static boolean a = false;
    final m b = new m();
    final m c = new m();
    final String d;
    h e;
    boolean f;
    boolean g;

    y(String s, h h1, boolean flag)
    {
        d = s;
        e = h1;
        f = flag;
    }

    void a(h h1)
    {
        e = h1;
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i = 0;
        if (b.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = 0; j < b.b(); j++)
            {
                z z2 = (z)b.b(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.a(j));
                printwriter.print(": ");
                printwriter.println(z2.toString());
                z2.a(s2, filedescriptor, printwriter, as);
            }

        }
        if (c.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (; i < c.b(); i++)
            {
                z z1 = (z)c.b(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.a(i));
                printwriter.print(": ");
                printwriter.println(z1.toString());
                z1.a(s1, filedescriptor, printwriter, as);
            }

        }
    }

    public boolean a()
    {
        int i = b.b();
        int j = 0;
        boolean flag = false;
        while (j < i) 
        {
            z z1 = (z)b.b(j);
            boolean flag1;
            if (z1.h && !z1.f)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            j++;
        }
        return flag;
    }

    void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Starting in ").append(this).toString());
        }
        if (f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStart when already started: ").append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            int i = -1 + b.b();
            while (i >= 0) 
            {
                ((z)b.b(i)).a();
                i--;
            }
        }
    }

    void c()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Stopping in ").append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStop when not started: ").append(this).toString(), runtimeexception);
            return;
        }
        for (int i = -1 + b.b(); i >= 0; i--)
        {
            ((z)b.b(i)).e();
        }

        f = false;
    }

    void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Retaining in ").append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doRetain when not started: ").append(this).toString(), runtimeexception);
        } else
        {
            g = true;
            f = false;
            int i = -1 + b.b();
            while (i >= 0) 
            {
                ((z)b.b(i)).b();
                i--;
            }
        }
    }

    void e()
    {
        if (g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Finished Retaining in ").append(this).toString());
            }
            g = false;
            for (int i = -1 + b.b(); i >= 0; i--)
            {
                ((z)b.b(i)).c();
            }

        }
    }

    void f()
    {
        for (int i = -1 + b.b(); i >= 0; i--)
        {
            ((z)b.b(i)).k = true;
        }

    }

    void g()
    {
        for (int i = -1 + b.b(); i >= 0; i--)
        {
            ((z)b.b(i)).d();
        }

    }

    void h()
    {
        if (!g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Destroying Active in ").append(this).toString());
            }
            for (int j = -1 + b.b(); j >= 0; j--)
            {
                ((z)b.b(j)).f();
            }

            b.c();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
        }
        for (int i = -1 + c.b(); i >= 0; i--)
        {
            ((z)c.b(i)).f();
        }

        c.c();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.d.d.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
