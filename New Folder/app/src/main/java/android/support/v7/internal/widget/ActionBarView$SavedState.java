// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.internal.widget:
//            j, f

class <init> extends android.view.ionBarView.SavedState
{

    public static final android.os.ctionBarView.SavedState.b CREATOR = new j();
    int a;
    boolean b;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.ToParcel(parcel, i);
        parcel.writeInt(a);
        int k;
        if (b)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
    }


    private A(Parcel parcel)
    {
        super(parcel);
        a = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    b(Parcel parcel, f f)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
