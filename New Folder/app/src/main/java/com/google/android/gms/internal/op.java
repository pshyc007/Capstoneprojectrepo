// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal:
//            oi, oq

public class op
{

    private final oi a;
    private final SecureRandom b;

    public op(oi oi1, SecureRandom securerandom)
    {
        a = oi1;
        b = securerandom;
    }

    static void a(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)(0x44 ^ abyte0[i]);
        }

    }

    public byte[] a(String s)
    {
        byte abyte0[];
        try
        {
            abyte0 = a.a(s, false);
            if (abyte0.length != 32)
            {
                throw new oq(this);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new oq(this, illegalargumentexception);
        }
        byte abyte1[];
        ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0, 4, 16);
        abyte1 = new byte[16];
        bytebuffer.get(abyte1);
        a(abyte1);
        return abyte1;
    }

    public byte[] a(byte abyte0[], String s)
    {
        if (abyte0.length != 16)
        {
            throw new oq(this);
        }
        byte abyte1[];
        ByteBuffer bytebuffer;
        byte abyte2[];
        byte abyte3[];
        SecretKeySpec secretkeyspec;
        Cipher cipher;
        byte abyte4[];
        try
        {
            abyte1 = a.a(s, false);
            if (abyte1.length <= 16)
            {
                throw new oq(this);
            }
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new oq(this, nosuchalgorithmexception);
        }
        catch (InvalidKeyException invalidkeyexception)
        {
            throw new oq(this, invalidkeyexception);
        }
        catch (IllegalBlockSizeException illegalblocksizeexception)
        {
            throw new oq(this, illegalblocksizeexception);
        }
        catch (NoSuchPaddingException nosuchpaddingexception)
        {
            throw new oq(this, nosuchpaddingexception);
        }
        catch (BadPaddingException badpaddingexception)
        {
            throw new oq(this, badpaddingexception);
        }
        catch (InvalidAlgorithmParameterException invalidalgorithmparameterexception)
        {
            throw new oq(this, invalidalgorithmparameterexception);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new oq(this, illegalargumentexception);
        }
        bytebuffer = ByteBuffer.allocate(abyte1.length);
        bytebuffer.put(abyte1);
        bytebuffer.flip();
        abyte2 = new byte[16];
        abyte3 = new byte[-16 + abyte1.length];
        bytebuffer.get(abyte2);
        bytebuffer.get(abyte3);
        secretkeyspec = new SecretKeySpec(abyte0, "AES");
        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretkeyspec, new IvParameterSpec(abyte2));
        abyte4 = cipher.doFinal(abyte3);
        return abyte4;
    }
}
