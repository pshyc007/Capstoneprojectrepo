// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public AbsSpinnerICS.SavedState a(Parcel parcel)
    {
        return new AbsSpinnerICS.SavedState(parcel, null);
    }

    public AbsSpinnerICS.SavedState[] a(int i)
    {
        return new AbsSpinnerICS.SavedState[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
