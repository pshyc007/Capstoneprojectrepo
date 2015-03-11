// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            c, e, af, ai

public abstract class d extends Binder
    implements c
{

    public static c a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        if (iinterface != null && (iinterface instanceof c))
        {
            return (c)iinterface;
        } else
        {
            return new e(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        int k;
        ai ai1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            int j1 = parcel.readInt();
            DataHolder dataholder = null;
            if (j1 != 0)
            {
                dataholder = DataHolder.CREATOR.a(parcel);
            }
            a(dataholder);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            int i1 = parcel.readInt();
            af af1 = null;
            if (i1 != 0)
            {
                af1 = (af)af.CREATOR.createFromParcel(parcel);
            }
            a(af1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            int l = parcel.readInt();
            ai ai2 = null;
            if (l != 0)
            {
                ai2 = (ai)ai.CREATOR.createFromParcel(parcel);
            }
            a(ai2);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            k = parcel.readInt();
            ai1 = null;
            break;
        }
        if (k != 0)
        {
            ai1 = (ai)ai.CREATOR.createFromParcel(parcel);
        }
        b(ai1);
        return true;
    }
}
