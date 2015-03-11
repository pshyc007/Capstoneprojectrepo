// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;

// Referenced classes of package com.google.android.gms.internal:
//            by, ai, cb, al

class ca
    implements by
{

    private IBinder a;

    ca(IBinder ibinder)
    {
        a = ibinder;
    }

    public a a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        a a1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        a1 = com.google.android.gms.a.b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return a1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(a a1, ai ai1, String s, cb cb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder = a1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder);
        if (ai1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        IBinder ibinder1;
        ibinder1 = null;
        if (cb1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ibinder1 = cb1.asBinder();
        parcel.writeStrongBinder(ibinder1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
          goto _L5
    }

    public void a(a a1, ai ai1, String s, String s1, cb cb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder = a1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder);
        if (ai1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        IBinder ibinder1;
        ibinder1 = null;
        if (cb1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        ibinder1 = cb1.asBinder();
        parcel.writeStrongBinder(ibinder1);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
          goto _L5
    }

    public void a(a a1, al al1, ai ai1, String s, cb cb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder = a1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder);
        if (al1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        al1.writeToParcel(parcel, 0);
_L6:
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        IBinder ibinder1;
        ibinder1 = null;
        if (cb1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ibinder1 = cb1.asBinder();
        parcel.writeStrongBinder(ibinder1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
        parcel.writeInt(0);
          goto _L7
    }

    public void a(a a1, al al1, ai ai1, String s, String s1, cb cb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder = a1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder);
        if (al1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        al1.writeToParcel(parcel, 0);
_L6:
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        parcel.writeString(s1);
        IBinder ibinder1;
        ibinder1 = null;
        if (cb1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        ibinder1 = cb1.asBinder();
        parcel.writeStrongBinder(ibinder1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
        parcel.writeInt(0);
          goto _L7
    }

    public IBinder asBinder()
    {
        return a;
    }

    public void b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
