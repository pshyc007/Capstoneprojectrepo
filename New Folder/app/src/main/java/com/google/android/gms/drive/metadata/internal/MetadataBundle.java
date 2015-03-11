// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            j, g

public final class MetadataBundle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int a;
    final Bundle b;

    MetadataBundle(int i, Bundle bundle)
    {
        a = i;
        b = (Bundle)lr.a(bundle);
        b.setClassLoader(getClass().getClassLoader());
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (g.a(s1) == null)
            {
                arraylist.add(s1);
                Log.w("MetadataBundle", (new StringBuilder()).append("Ignored unknown metadata field in bundle: ").append(s1).toString());
            }
        } while (true);
        String s;
        for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); b.remove(s))
        {
            s = (String)iterator1.next();
        }

    }

    public Set a()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); hashset.add(g.a((String)iterator.next()))) { }
        return hashset;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof MetadataBundle))
        {
            return false;
        }
        MetadataBundle metadatabundle = (MetadataBundle)obj;
        Set set = b.keySet();
        if (!set.equals(metadatabundle.b.keySet()))
        {
            return false;
        }
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (!ln.a(b.get(s), metadatabundle.b.get(s)))
            {
                return false;
            }
        }

        return true;
    }

    public int hashCode()
    {
        Iterator iterator = b.keySet().iterator();
        int i;
        String s;
        for (i = 1; iterator.hasNext(); i = i * 31 + b.get(s).hashCode())
        {
            s = (String)iterator.next();
        }

        return i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MetadataBundle [values=").append(b).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
