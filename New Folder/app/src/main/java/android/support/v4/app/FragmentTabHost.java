// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            u, l, v, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a;
    private Context b;
    private l c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private u f;
    private boolean g;

    private v a(String s, v v1)
    {
        u u1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            u u2 = (u)a.get(i);
            if (!u.b(u2).equals(s))
            {
                u2 = u1;
            }
            i++;
            u1 = u2;
        }
        if (u1 == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No tab known for tag ").append(s).toString());
        }
        if (f != u1)
        {
            if (v1 == null)
            {
                v1 = c.a();
            }
            if (f != null && u.a(f) != null)
            {
                v1.a(u.a(f));
            }
            if (u1 != null)
            {
                if (u.a(u1) == null)
                {
                    u.a(u1, Fragment.a(b, u.c(u1).getName(), u.d(u1)));
                    v1.a(d, u.a(u1), u.b(u1));
                } else
                {
                    v1.b(u.a(u1));
                }
            }
            f = u1;
        }
        return v1;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        v v1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            u u1 = (u)a.get(i);
            u.a(u1, c.a(u.b(u1)));
            if (u.a(u1) != null && !u.a(u1).d())
            {
                if (u.b(u1).equals(s))
                {
                    f = u1;
                } else
                {
                    if (v1 == null)
                    {
                        v1 = c.a();
                    }
                    v1.a(u.a(u1));
                }
            }
            i++;
        }
        g = true;
        v v2 = a(s, v1);
        if (v2 != null)
        {
            v2.a();
            c.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        setCurrentTabByTag(savedstate.a);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (g)
        {
            v v1 = a(s, null);
            if (v1 != null)
            {
                v1.a();
            }
        }
        if (e != null)
        {
            e.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        e = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new t();
        String a;

        public String toString()
        {
            return (new StringBuilder()).append("FragmentTabHost.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        SavedState(Parcel parcel, s s)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
