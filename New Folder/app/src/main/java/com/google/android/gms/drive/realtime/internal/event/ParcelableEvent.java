// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            a, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails

public class ParcelableEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    final String b;
    final String c;
    final boolean d;
    final String e;
    final String f;
    final TextInsertedDetails g;
    final TextDeletedDetails h;
    final ValuesAddedDetails i;
    final ValuesRemovedDetails j;
    final ValuesSetDetails k;
    final ValueChangedDetails l;
    final ReferenceShiftedDetails m;

    ParcelableEvent(int i1, String s, String s1, boolean flag, String s2, String s3, TextInsertedDetails textinserteddetails, 
            TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails)
    {
        a = i1;
        b = s;
        c = s1;
        d = flag;
        e = s2;
        f = s3;
        g = textinserteddetails;
        h = textdeleteddetails;
        i = valuesaddeddetails;
        j = valuesremoveddetails;
        k = valuessetdetails;
        l = valuechangeddetails;
        m = referenceshifteddetails;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.drive.realtime.internal.event.a.a(this, parcel, i1);
    }

}
