// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ae, ag

public abstract class af extends Binder
    implements ae
{

    public af()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static ae a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (iinterface != null && (iinterface instanceof ae))
        {
            return (ae)iinterface;
        } else
        {
            return new ag(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
