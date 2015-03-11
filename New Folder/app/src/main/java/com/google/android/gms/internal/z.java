// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

// Referenced classes of package com.google.android.gms.internal:
//            y, aa, ai, p, 
//            w, af, al, r, 
//            eo, fb

public abstract class z extends Binder
    implements y
{

    public z()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static y a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (iinterface != null && (iinterface instanceof y))
        {
            return (y)iinterface;
        } else
        {
            return new aa(ibinder);
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
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManager");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            a a1 = a();
            parcel1.writeNoException();
            IBinder ibinder = null;
            if (a1 != null)
            {
                ibinder = a1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            boolean flag1 = c();
            parcel1.writeNoException();
            int j1;
            if (flag1)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel1.writeInt(j1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            int l = parcel.readInt();
            ai ai1 = null;
            if (l != 0)
            {
                ai1 = ai.CREATOR.a(parcel);
            }
            boolean flag = a(ai1);
            parcel1.writeNoException();
            int i1 = 0;
            if (flag)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            e();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            a(com.google.android.gms.internal.w.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            a(com.google.android.gms.internal.af.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            f();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g();
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            h();
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            al al2 = i();
            parcel1.writeNoException();
            if (al2 != null)
            {
                parcel1.writeInt(1);
                al2.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            int k = parcel.readInt();
            al al1 = null;
            if (k != 0)
            {
                al1 = al.CREATOR.a(parcel);
            }
            a(al1);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            a(com.google.android.gms.internal.eo.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            a(com.google.android.gms.internal.fb.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
