// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;

// Referenced classes of package com.google.android.gms.internal:
//            by, ca, al, r, 
//            ai, p, cc

public abstract class bz extends Binder
    implements by
{

    public bz()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static by a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iinterface != null && (iinterface instanceof by))
        {
            return (by)iinterface;
        } else
        {
            return new ca(ibinder);
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
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a a5 = b.a(parcel.readStrongBinder());
            al al2;
            ai ai4;
            if (parcel.readInt() != 0)
            {
                al2 = al.CREATOR.a(parcel);
            } else
            {
                al2 = null;
            }
            if (parcel.readInt() != 0)
            {
                ai4 = ai.CREATOR.a(parcel);
            } else
            {
                ai4 = null;
            }
            a(a5, al2, ai4, parcel.readString(), com.google.android.gms.internal.cc.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a a4 = a();
            parcel1.writeNoException();
            IBinder ibinder = null;
            if (a4 != null)
            {
                ibinder = a4.asBinder();
            }
            parcel1.writeStrongBinder(ibinder);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a a3 = b.a(parcel.readStrongBinder());
            int k = parcel.readInt();
            ai ai3 = null;
            if (k != 0)
            {
                ai3 = ai.CREATOR.a(parcel);
            }
            a(a3, ai3, parcel.readString(), com.google.android.gms.internal.cc.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            b();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a a2 = b.a(parcel.readStrongBinder());
            al al1;
            ai ai2;
            if (parcel.readInt() != 0)
            {
                al1 = al.CREATOR.a(parcel);
            } else
            {
                al1 = null;
            }
            if (parcel.readInt() != 0)
            {
                ai2 = ai.CREATOR.a(parcel);
            } else
            {
                ai2 = null;
            }
            a(a2, al1, ai2, parcel.readString(), parcel.readString(), com.google.android.gms.internal.cc.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a a1 = b.a(parcel.readStrongBinder());
            ai ai1;
            if (parcel.readInt() != 0)
            {
                ai1 = ai.CREATOR.a(parcel);
            } else
            {
                ai1 = null;
            }
            a(a1, ai1, parcel.readString(), parcel.readString(), com.google.android.gms.internal.cc.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            d();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            e();
            parcel1.writeNoException();
            return true;
        }
    }
}
