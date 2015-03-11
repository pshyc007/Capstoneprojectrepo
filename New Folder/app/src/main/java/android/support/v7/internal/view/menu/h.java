// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.os.Parcel;

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public ActionMenuPresenter.SavedState a(Parcel parcel)
    {
        return new ActionMenuPresenter.SavedState(parcel);
    }

    public ActionMenuPresenter.SavedState[] a(int i)
    {
        return new ActionMenuPresenter.SavedState[i];
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
