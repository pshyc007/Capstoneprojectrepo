// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.g;
import com.google.android.gms.drive.metadata.internal.d;
import com.google.android.gms.drive.metadata.internal.i;
import com.google.android.gms.drive.metadata.internal.m;
import com.google.android.gms.drive.metadata.internal.n;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.internal:
//            nc, mn, mo, mp, 
//            mq, mr, ms, mm, 
//            mt, mu

public class ml
{

    public static final a A = new n("webContentLink", 0x419ce0);
    public static final a B = new n("webViewLink", 0x419ce0);
    public static final a C = new n("uniqueIdentifier", 0x4c4b40);
    public static final a a;
    public static final a b = new n("alternateLink", 0x419ce0);
    public static final mn c = new mn(0x4c4b40);
    public static final a d = new n("description", 0x419ce0);
    public static final a e = new n("embedLink", 0x419ce0);
    public static final a f = new n("fileExtension", 0x419ce0);
    public static final a g = new i("fileSize", 0x419ce0);
    public static final a h = new d("hasThumbnail", 0x419ce0);
    public static final a i = new n("indexableText", 0x419ce0);
    public static final a j = new d("isAppData", 0x419ce0);
    public static final a k = new d("isCopyable", 0x419ce0);
    public static final a l = new d("isEditable", 0x3e8fa0);
    public static final mo m = new mo("isPinned", 0x3e8fa0);
    public static final a n = new d("isRestricted", 0x419ce0);
    public static final a o = new d("isShared", 0x419ce0);
    public static final a p = new d("isTrashable", 0x432380);
    public static final a q = new d("isViewed", 0x419ce0);
    public static final mp r = new mp("mimeType", 0x3e8fa0);
    public static final a s = new n("originalFilename", 0x419ce0);
    public static final g t = new m("ownerNames", 0x419ce0);
    public static final mq u = new mq("parents", 0x3e8fa0);
    public static final mr v = new mr("quotaBytesUsed", 0x419ce0);
    public static final ms w = new ms("starred", 0x3e8fa0);
    public static final a x = new mm("thumbnail", Collections.emptySet(), Collections.emptySet(), 0x432380);
    public static final mt y = new mt("title", 0x3e8fa0);
    public static final mu z = new mu("trashed", 0x3e8fa0);

    static 
    {
        a = com.google.android.gms.internal.nc.a;
    }
}
