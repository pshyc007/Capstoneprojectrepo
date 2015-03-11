// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            gl, gn, ds, gi, 
//            du

public abstract class gm extends Binder
    implements gl
{

    public gm()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public static gl a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (iinterface != null && (iinterface instanceof gl))
        {
            return (gl)iinterface;
        } else
        {
            return new gn(ibinder);
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
            parcel1.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            break;
        }
        ds ds1;
        du du1;
        if (parcel.readInt() != 0)
        {
            ds1 = ds.CREATOR.a(parcel);
        } else
        {
            ds1 = null;
        }
        du1 = a(ds1);
        parcel1.writeNoException();
        if (du1 != null)
        {
            parcel1.writeInt(1);
            du1.writeToParcel(parcel1, 1);
        } else
        {
            parcel1.writeInt(0);
        }
        return true;
    }
}
