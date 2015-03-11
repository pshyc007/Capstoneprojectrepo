// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.b;

// Referenced classes of package com.google.android.gms.internal:
//            ab, ad, al, r, 
//            bw

public abstract class ac extends Binder
    implements ab
{

    public static ab a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iinterface != null && (iinterface instanceof ab))
        {
            return (ab)iinterface;
        } else
        {
            return new ad(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        com.google.android.gms.a.a a1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            a1 = b.a(parcel.readStrongBinder());
            break;
        }
        al al1;
        IBinder ibinder;
        if (parcel.readInt() != 0)
        {
            al1 = al.CREATOR.a(parcel);
        } else
        {
            al1 = null;
        }
        ibinder = a(a1, al1, parcel.readString(), bw.a(parcel.readStrongBinder()), parcel.readInt());
        parcel1.writeNoException();
        parcel1.writeStrongBinder(ibinder);
        return true;
    }
}
