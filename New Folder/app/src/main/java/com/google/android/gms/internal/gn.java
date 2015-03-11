// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            gl, ds, du, gk

class gn
    implements gl
{

    private IBinder a;

    gn(IBinder ibinder)
    {
        a = ibinder;
    }

    public du a(ds ds1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (ds1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        ds1.writeToParcel(parcel, 0);
_L3:
        du du2;
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        du2 = du.CREATOR.a(parcel1);
        du du1 = du2;
_L4:
        parcel1.recycle();
        parcel.recycle();
        return du1;
_L2:
        parcel.writeInt(0);
          goto _L3
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
        du1 = null;
          goto _L4
    }

    public IBinder asBinder()
    {
        return a;
    }
}
