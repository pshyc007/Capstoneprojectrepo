// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            lk, lm, lh

public abstract class ll extends Binder
    implements lk
{

    public static lk a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iinterface != null && (iinterface instanceof lk))
        {
            return (lk)iinterface;
        } else
        {
            return new lm(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf20 = lh.a(parcel.readStrongBinder());
            int k9 = parcel.readInt();
            String s25 = parcel.readString();
            String s26 = parcel.readString();
            String as3[] = parcel.createStringArray();
            String s27 = parcel.readString();
            Bundle bundle20;
            if (parcel.readInt() != 0)
            {
                bundle20 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle20 = null;
            }
            a(lf20, k9, s25, s26, as3, s27, bundle20);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf19 = lh.a(parcel.readStrongBinder());
            int i9 = parcel.readInt();
            String s24 = parcel.readString();
            int j9 = parcel.readInt();
            Bundle bundle19 = null;
            if (j9 != 0)
            {
                bundle19 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(lf19, i9, s24, bundle19);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(lh.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf18 = lh.a(parcel.readStrongBinder());
            int k8 = parcel.readInt();
            String s23 = parcel.readString();
            int l8 = parcel.readInt();
            Bundle bundle18 = null;
            if (l8 != 0)
            {
                bundle18 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(lf18, k8, s23, bundle18);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf17 = lh.a(parcel.readStrongBinder());
            int i8 = parcel.readInt();
            String s22 = parcel.readString();
            int j8 = parcel.readInt();
            Bundle bundle17 = null;
            if (j8 != 0)
            {
                bundle17 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            c(lf17, i8, s22, bundle17);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf16 = lh.a(parcel.readStrongBinder());
            int k7 = parcel.readInt();
            String s21 = parcel.readString();
            int l7 = parcel.readInt();
            Bundle bundle16 = null;
            if (l7 != 0)
            {
                bundle16 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            d(lf16, k7, s21, bundle16);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf15 = lh.a(parcel.readStrongBinder());
            int i7 = parcel.readInt();
            String s20 = parcel.readString();
            int j7 = parcel.readInt();
            Bundle bundle15 = null;
            if (j7 != 0)
            {
                bundle15 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            e(lf15, i7, s20, bundle15);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf14 = lh.a(parcel.readStrongBinder());
            int l6 = parcel.readInt();
            String s16 = parcel.readString();
            String s17 = parcel.readString();
            String as2[] = parcel.createStringArray();
            String s18 = parcel.readString();
            IBinder ibinder1 = parcel.readStrongBinder();
            String s19 = parcel.readString();
            Bundle bundle14;
            if (parcel.readInt() != 0)
            {
                bundle14 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle14 = null;
            }
            a(lf14, l6, s16, s17, as2, s18, ibinder1, s19, bundle14);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf13 = lh.a(parcel.readStrongBinder());
            int j6 = parcel.readInt();
            String s15 = parcel.readString();
            int k6 = parcel.readInt();
            Bundle bundle13 = null;
            if (k6 != 0)
            {
                bundle13 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            f(lf13, j6, s15, bundle13);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf12 = lh.a(parcel.readStrongBinder());
            int l5 = parcel.readInt();
            String s14 = parcel.readString();
            int i6 = parcel.readInt();
            Bundle bundle12 = null;
            if (i6 != 0)
            {
                bundle12 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            g(lf12, l5, s14, bundle12);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf11 = lh.a(parcel.readStrongBinder());
            int j5 = parcel.readInt();
            String s13 = parcel.readString();
            int k5 = parcel.readInt();
            Bundle bundle11 = null;
            if (k5 != 0)
            {
                bundle11 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            h(lf11, j5, s13, bundle11);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf10 = lh.a(parcel.readStrongBinder());
            int l4 = parcel.readInt();
            String s12 = parcel.readString();
            int i5 = parcel.readInt();
            Bundle bundle10 = null;
            if (i5 != 0)
            {
                bundle10 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            i(lf10, l4, s12, bundle10);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf9 = lh.a(parcel.readStrongBinder());
            int j4 = parcel.readInt();
            String s11 = parcel.readString();
            int k4 = parcel.readInt();
            Bundle bundle9 = null;
            if (k4 != 0)
            {
                bundle9 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            j(lf9, j4, s11, bundle9);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf8 = lh.a(parcel.readStrongBinder());
            int l3 = parcel.readInt();
            String s10 = parcel.readString();
            int i4 = parcel.readInt();
            Bundle bundle8 = null;
            if (i4 != 0)
            {
                bundle8 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            k(lf8, l3, s10, bundle8);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf7 = lh.a(parcel.readStrongBinder());
            int j3 = parcel.readInt();
            String s9 = parcel.readString();
            int k3 = parcel.readInt();
            Bundle bundle7 = null;
            if (k3 != 0)
            {
                bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            l(lf7, j3, s9, bundle7);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf6 = lh.a(parcel.readStrongBinder());
            int l2 = parcel.readInt();
            String s8 = parcel.readString();
            int i3 = parcel.readInt();
            Bundle bundle6 = null;
            if (i3 != 0)
            {
                bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            m(lf6, l2, s8, bundle6);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf5 = lh.a(parcel.readStrongBinder());
            int k2 = parcel.readInt();
            String s7 = parcel.readString();
            IBinder ibinder = parcel.readStrongBinder();
            Bundle bundle5;
            if (parcel.readInt() != 0)
            {
                bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle5 = null;
            }
            a(lf5, k2, s7, ibinder, bundle5);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf4 = lh.a(parcel.readStrongBinder());
            int j2 = parcel.readInt();
            String s5 = parcel.readString();
            String as1[] = parcel.createStringArray();
            String s6 = parcel.readString();
            Bundle bundle4;
            if (parcel.readInt() != 0)
            {
                bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle4 = null;
            }
            a(lf4, j2, s5, as1, s6, bundle4);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            b(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            c(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf3 = lh.a(parcel.readStrongBinder());
            int l1 = parcel.readInt();
            String s4 = parcel.readString();
            int i2 = parcel.readInt();
            Bundle bundle3 = null;
            if (i2 != 0)
            {
                bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            n(lf3, l1, s4, bundle3);
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            d(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf2 = lh.a(parcel.readStrongBinder());
            int j1 = parcel.readInt();
            String s3 = parcel.readString();
            int k1 = parcel.readInt();
            Bundle bundle2 = null;
            if (k1 != 0)
            {
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            o(lf2, j1, s3, bundle2);
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            e(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf1 = lh.a(parcel.readStrongBinder());
            int l = parcel.readInt();
            String s2 = parcel.readString();
            int i1 = parcel.readInt();
            Bundle bundle1 = null;
            if (i1 != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            p(lf1, l, s2, bundle1);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            b(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            lf lf = lh.a(parcel.readStrongBinder());
            int k = parcel.readInt();
            String s = parcel.readString();
            String s1 = parcel.readString();
            String as[] = parcel.createStringArray();
            Bundle bundle;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            a(lf, k, s, s1, as, bundle);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            f(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            g(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            h(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            i(lh.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
