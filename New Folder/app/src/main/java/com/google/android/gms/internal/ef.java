// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            eg, ig, ed

public class ef
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] {
        "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"
    });
    private static final Object c = new Object();
    private static ef d;
    private final eg b;

    private ef(Context context)
    {
        b = new eg(this, context, "google_inapp_purchase.db");
    }

    public static ef a(Context context)
    {
        ef ef1;
        synchronized (c)
        {
            if (d == null)
            {
                d = new ef(context);
            }
            ef1 = d;
        }
        return ef1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static String d()
    {
        return a;
    }

    public SQLiteDatabase a()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = b.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            ig.e("Error opening writable conversion tracking database");
            return null;
        }
        return sqlitedatabase;
    }

    public ed a(Cursor cursor)
    {
        if (cursor == null)
        {
            return null;
        } else
        {
            return new ed(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
        }
    }

    public List a(long l)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = new LinkedList();
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj;
        JVM INSTR monitorexit ;
        return linkedlist;
        SQLiteDatabase sqlitedatabase = a();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj;
        JVM INSTR monitorexit ;
        return linkedlist;
        Cursor cursor1 = sqlitedatabase.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(l));
        Cursor cursor = cursor1;
        boolean flag;
        if (cursor.moveToFirst())
        {
            do
            {
                linkedlist.add(a(cursor));
                flag = cursor.moveToNext();
            } while (flag);
        }
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        cursor.close();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return linkedlist;
        SQLiteException sqliteexception;
        sqliteexception;
        cursor = null;
_L5:
        ig.e((new StringBuilder()).append("Error extracing purchase info: ").append(sqliteexception.getMessage()).toString());
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        cursor = null;
_L4:
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        cursor.close();
        throw exception1;
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
        sqliteexception;
          goto _L5
    }

    public void a(ed ed1)
    {
        if (ed1 == null)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object aobj[] = new Object[2];
        aobj[0] = "purchase_id";
        aobj[1] = Long.valueOf(ed1.a);
        sqlitedatabase.delete("InAppPurchase", String.format("%s = %d", aobj), null);
        obj;
        JVM INSTR monitorexit ;
    }

    public int b()
    {
        Cursor cursor = null;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        obj;
        JVM INSTR monitorexit ;
        return 0;
        int i;
        cursor = sqlitedatabase.rawQuery("select count(*) from InAppPurchase", null);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        i = cursor.getInt(0);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        cursor.close();
        obj;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        cursor.close();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return 0;
        SQLiteException sqliteexception;
        sqliteexception;
        ig.e((new StringBuilder()).append("Error getting record count").append(sqliteexception.getMessage()).toString());
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
          goto _L2
        Exception exception1;
        exception1;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        cursor.close();
        throw exception1;
    }

    public void b(ed ed1)
    {
        if (ed1 == null)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("product_id", ed1.c);
        contentvalues.put("developer_payload", ed1.b);
        contentvalues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        ed1.a = sqlitedatabase.insert("InAppPurchase", null, contentvalues);
        if ((long)b() > 20000L)
        {
            c();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public void c()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Cursor cursor1 = sqlitedatabase.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
        Cursor cursor;
        cursor = cursor1;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (cursor.moveToFirst())
        {
            a(a(cursor));
        }
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        cursor.close();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        SQLiteException sqliteexception;
        sqliteexception;
        cursor = null;
_L4:
        ig.e((new StringBuilder()).append("Error remove oldest record").append(sqliteexception.getMessage()).toString());
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
          goto _L2
_L3:
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        cursor.close();
        Exception exception1;
        throw exception1;
        exception1;
          goto _L3
        sqliteexception;
          goto _L4
        exception1;
        cursor = null;
          goto _L3
    }

}
