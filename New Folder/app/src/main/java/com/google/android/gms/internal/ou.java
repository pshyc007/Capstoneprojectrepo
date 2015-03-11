// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ot, ov

public abstract class ou extends Binder
    implements ot
{

    public static ot a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (iinterface != null && (iinterface instanceof ot))
        {
            return (ot)iinterface;
        } else
        {
            return new ov(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s;
        int k;
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            String s2 = a();
            parcel1.writeNoException();
            parcel1.writeString(s2);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean flag1;
            boolean flag2;
            int l;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = a(flag1);
            parcel1.writeNoException();
            l = 0;
            if (flag2)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            String s1 = a(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(s1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            s = parcel.readString();
            k = parcel.readInt();
            flag = false;
            break;
        }
        if (k != 0)
        {
            flag = true;
        }
        a(s, flag);
        parcel1.writeNoException();
        return true;
    }
}
