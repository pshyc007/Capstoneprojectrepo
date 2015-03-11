// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;

// Referenced classes of package com.google.android.gms.wearable:
//            d

public class Asset
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int a;
    public ParcelFileDescriptor b;
    public Uri c;
    private byte d[];
    private String e;

    Asset(int i, byte abyte0[], String s, ParcelFileDescriptor parcelfiledescriptor, Uri uri)
    {
        a = i;
        d = abyte0;
        e = s;
        b = parcelfiledescriptor;
        c = uri;
    }

    public byte[] a()
    {
        return d;
    }

    public String b()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Asset))
            {
                return false;
            }
            Asset asset = (Asset)obj;
            if (!ln.a(d, asset.d) || !ln.a(e, asset.e) || !ln.a(b, asset.b) || !ln.a(c, asset.c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[4];
        aobj[0] = d;
        aobj[1] = e;
        aobj[2] = b;
        aobj[3] = c;
        return ln.a(aobj);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Asset[@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (e == null)
        {
            stringbuilder.append(", nodigest");
        } else
        {
            stringbuilder.append(", ");
            stringbuilder.append(e);
        }
        if (d != null)
        {
            stringbuilder.append(", size=");
            stringbuilder.append(d.length);
        }
        if (b != null)
        {
            stringbuilder.append(", fd=");
            stringbuilder.append(b);
        }
        if (c != null)
        {
            stringbuilder.append(", uri=");
            stringbuilder.append(c);
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wearable.d.a(this, parcel, i | 1);
    }

}
