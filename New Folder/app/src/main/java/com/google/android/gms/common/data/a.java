// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.common.data:
//            e

public class a
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    ParcelFileDescriptor b;
    final int c;
    private Bitmap d;
    private boolean e;
    private File f;

    a(int i, ParcelFileDescriptor parcelfiledescriptor, int j)
    {
        a = i;
        b = parcelfiledescriptor;
        c = j;
        d = null;
        e = false;
    }

    private FileOutputStream a()
    {
        if (f == null)
        {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        FileOutputStream fileoutputstream;
        try
        {
            file = File.createTempFile("teleporter", ".tmp", f);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Could not create temporary file", ioexception);
        }
        try
        {
            fileoutputstream = new FileOutputStream(file);
            b = ParcelFileDescriptor.open(file, 0x10000000);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file.delete();
        return fileoutputstream;
    }

    private void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        catch (IOException ioexception)
        {
            Log.w("BitmapTeleporter", "Could not close stream", ioexception);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bitmap bitmap;
        byte abyte0[];
        DataOutputStream dataoutputstream;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        bitmap = d;
        ByteBuffer bytebuffer = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(bytebuffer);
        abyte0 = bytebuffer.array();
        dataoutputstream = new DataOutputStream(a());
        dataoutputstream.writeInt(abyte0.length);
        dataoutputstream.writeInt(bitmap.getWidth());
        dataoutputstream.writeInt(bitmap.getHeight());
        dataoutputstream.writeUTF(bitmap.getConfig().toString());
        dataoutputstream.write(abyte0);
        a(dataoutputstream);
        com.google.android.gms.common.data.e.a(this, parcel, i);
        return;
        IOException ioexception;
        ioexception;
        throw new IllegalStateException("Could not write into unlinked file", ioexception);
        Exception exception;
        exception;
        a(dataoutputstream);
        throw exception;
    }

}
