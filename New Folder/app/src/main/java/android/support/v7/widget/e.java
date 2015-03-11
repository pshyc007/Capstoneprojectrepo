// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.q;
import android.support.v7.b.b;
import android.support.v7.b.g;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            SearchView, f

class e extends q
    implements android.view.View.OnClickListener
{

    private SearchManager j;
    private SearchView k;
    private SearchableInfo l;
    private Context m;
    private WeakHashMap n;
    private boolean o;
    private int p;
    private ColorStateList q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;

    public e(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
        super(context, g.abc_search_dropdown_item_icons_2line, null, true);
        o = false;
        p = 1;
        r = -1;
        s = -1;
        t = -1;
        u = -1;
        v = -1;
        w = -1;
        j = (SearchManager)d.getSystemService("search");
        k = searchview;
        l = searchableinfo;
        m = context;
        n = weakhashmap;
    }

    private Drawable a(ComponentName componentname)
    {
        String s1 = componentname.flattenToShortString();
        if (n.containsKey(s1))
        {
            android.graphics.drawable.Drawable.ConstantState constantstate1 = (android.graphics.drawable.Drawable.ConstantState)n.get(s1);
            if (constantstate1 == null)
            {
                return null;
            } else
            {
                return constantstate1.newDrawable(m.getResources());
            }
        }
        Drawable drawable = b(componentname);
        android.graphics.drawable.Drawable.ConstantState constantstate = null;
        if (drawable != null)
        {
            constantstate = drawable.getConstantState();
        }
        n.put(s1, constantstate);
        return drawable;
    }

    private Drawable a(String s1)
    {
        if (s1 != null && s1.length() != 0 && !"0".equals(s1)) goto _L2; else goto _L1
_L1:
        Drawable drawable = null;
_L4:
        return drawable;
_L2:
        int i;
        String s2;
        i = Integer.parseInt(s1);
        s2 = (new StringBuilder()).append("android.resource://").append(m.getPackageName()).append("/").append(i).toString();
        drawable = b(s2);
        if (drawable != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Drawable drawable2;
        drawable2 = m.getResources().getDrawable(i);
        a(s2, drawable2);
        return drawable2;
        NumberFormatException numberformatexception;
        numberformatexception;
        drawable = b(s1);
        if (drawable == null)
        {
            Drawable drawable1 = b(Uri.parse(s1));
            a(s1, drawable1);
            return drawable1;
        }
        continue; /* Loop/switch isn't completed */
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon resource not found: ").append(s1).toString());
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Cursor cursor, int i)
    {
        if (i == -1)
        {
            return null;
        }
        String s1;
        try
        {
            s1 = cursor.getString(i);
        }
        catch (Exception exception)
        {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception);
            return null;
        }
        return s1;
    }

    public static String a(Cursor cursor, String s1)
    {
        return a(cursor, cursor.getColumnIndex(s1));
    }

    private void a(ImageView imageview, Drawable drawable, int i)
    {
        imageview.setImageDrawable(drawable);
        if (drawable == null)
        {
            imageview.setVisibility(i);
            return;
        } else
        {
            imageview.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
            return;
        }
    }

    private void a(TextView textview, CharSequence charsequence)
    {
        textview.setText(charsequence);
        if (TextUtils.isEmpty(charsequence))
        {
            textview.setVisibility(8);
            return;
        } else
        {
            textview.setVisibility(0);
            return;
        }
    }

    private void a(String s1, Drawable drawable)
    {
        if (drawable != null)
        {
            n.put(s1, drawable.getConstantState());
        }
    }

    private Drawable b(ComponentName componentname)
    {
        PackageManager packagemanager = d.getPackageManager();
        ActivityInfo activityinfo;
        int i;
        try
        {
            activityinfo = packagemanager.getActivityInfo(componentname, 128);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.w("SuggestionsAdapter", namenotfoundexception.toString());
            return null;
        }
        i = activityinfo.getIconResource();
        if (i == 0)
        {
            return null;
        }
        Drawable drawable = packagemanager.getDrawable(componentname.getPackageName(), i, activityinfo.applicationInfo);
        if (drawable == null)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder()).append("Invalid icon resource ").append(i).append(" for ").append(componentname.flattenToShortString()).toString());
            return null;
        } else
        {
            return drawable;
        }
    }

    private Drawable b(Uri uri)
    {
        boolean flag = "android.resource".equals(uri.getScheme());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Drawable drawable1 = a(uri);
        return drawable1;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        try
        {
            throw new FileNotFoundException((new StringBuilder()).append("Resource does not exist: ").append(uri).toString());
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon not found: ").append(uri).append(", ").append(filenotfoundexception.getMessage()).toString());
        }
        return null;
        InputStream inputstream = m.getContentResolver().openInputStream(uri);
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        throw new FileNotFoundException((new StringBuilder()).append("Failed to open ").append(uri).toString());
        Drawable drawable = Drawable.createFromStream(inputstream, null);
        inputstream.close();
        return drawable;
        IOException ioexception1;
        ioexception1;
        Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(uri).toString(), ioexception1);
        return drawable;
        Exception exception;
        exception;
        inputstream.close();
_L1:
        throw exception;
        IOException ioexception;
        ioexception;
        Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(uri).toString(), ioexception);
          goto _L1
    }

    private Drawable b(String s1)
    {
        android.graphics.drawable.Drawable.ConstantState constantstate = (android.graphics.drawable.Drawable.ConstantState)n.get(s1);
        if (constantstate == null)
        {
            return null;
        } else
        {
            return constantstate.newDrawable();
        }
    }

    private CharSequence b(CharSequence charsequence)
    {
        if (q == null)
        {
            TypedValue typedvalue = new TypedValue();
            d.getTheme().resolveAttribute(b.textColorSearchUrl, typedvalue, true);
            q = d.getResources().getColorStateList(typedvalue.resourceId);
        }
        SpannableString spannablestring = new SpannableString(charsequence);
        spannablestring.setSpan(new TextAppearanceSpan(null, 0, 0, q, null), 0, charsequence.length(), 33);
        return spannablestring;
    }

    private void d(Cursor cursor)
    {
        Bundle bundle;
        if (cursor != null)
        {
            bundle = cursor.getExtras();
        } else
        {
            bundle = null;
        }
        if (bundle != null)
        {
            if (!bundle.getBoolean("in_progress"));
        }
    }

    private Drawable e(Cursor cursor)
    {
        Drawable drawable;
        if (u == -1)
        {
            drawable = null;
        } else
        {
            drawable = a(cursor.getString(u));
            if (drawable == null)
            {
                return g(cursor);
            }
        }
        return drawable;
    }

    private Drawable f(Cursor cursor)
    {
        if (v == -1)
        {
            return null;
        } else
        {
            return a(cursor.getString(v));
        }
    }

    private Drawable g(Cursor cursor)
    {
        Drawable drawable = a(l.getSearchActivity());
        if (drawable != null)
        {
            return drawable;
        } else
        {
            return d.getPackageManager().getDefaultActivityIcon();
        }
    }

    Cursor a(SearchableInfo searchableinfo, String s1, int i)
    {
        String s2;
        if (searchableinfo != null)
        {
            if ((s2 = searchableinfo.getSuggestAuthority()) != null)
            {
                android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("content").authority(s2).query("").fragment("");
                String s3 = searchableinfo.getSuggestPath();
                if (s3 != null)
                {
                    builder.appendEncodedPath(s3);
                }
                builder.appendPath("search_suggest_query");
                String s4 = searchableinfo.getSuggestSelection();
                String as[];
                Uri uri;
                if (s4 != null)
                {
                    as = (new String[] {
                        s1
                    });
                } else
                {
                    builder.appendPath(s1);
                    as = null;
                }
                if (i > 0)
                {
                    builder.appendQueryParameter("limit", String.valueOf(i));
                }
                uri = builder.build();
                return d.getContentResolver().query(uri, null, s4, as, null);
            }
        }
        return null;
    }

    public Cursor a(CharSequence charsequence)
    {
        String s1;
        if (charsequence == null)
        {
            s1 = "";
        } else
        {
            s1 = charsequence.toString();
        }
        if (k.getVisibility() != 0 || k.getWindowVisibility() != 0)
        {
            return null;
        }
        Cursor cursor = a(l, s1, 50);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        cursor.getCount();
        return cursor;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", runtimeexception);
        return null;
    }

    Drawable a(Uri uri)
    {
        String s1 = uri.getAuthority();
        if (TextUtils.isEmpty(s1))
        {
            throw new FileNotFoundException((new StringBuilder()).append("No authority: ").append(uri).toString());
        }
        Resources resources;
        List list;
        try
        {
            resources = d.getPackageManager().getResourcesForApplication(s1);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No package found for authority: ").append(uri).toString());
        }
        list = uri.getPathSegments();
        if (list == null)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No path: ").append(uri).toString());
        }
        int i = list.size();
        int i1;
        if (i == 1)
        {
            int j1;
            try
            {
                j1 = Integer.parseInt((String)list.get(0));
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new FileNotFoundException((new StringBuilder()).append("Single path segment is not a resource ID: ").append(uri).toString());
            }
            i1 = j1;
        } else
        if (i == 2)
        {
            i1 = resources.getIdentifier((String)list.get(1), (String)list.get(0), s1);
        } else
        {
            throw new FileNotFoundException((new StringBuilder()).append("More than two path segments: ").append(uri).toString());
        }
        if (i1 == 0)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No resource found for: ").append(uri).toString());
        } else
        {
            return resources.getDrawable(i1);
        }
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        View view = super.a(context, cursor, viewgroup);
        view.setTag(new f(view));
        return view;
    }

    public void a(int i)
    {
        p = i;
    }

    public void a(Cursor cursor)
    {
        if (!o) goto _L2; else goto _L1
_L1:
        Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return;
_L2:
        super.a(cursor);
        if (cursor != null)
        {
            try
            {
                r = cursor.getColumnIndex("suggest_text_1");
                s = cursor.getColumnIndex("suggest_text_2");
                t = cursor.getColumnIndex("suggest_text_2_url");
                u = cursor.getColumnIndex("suggest_icon_1");
                v = cursor.getColumnIndex("suggest_icon_2");
                w = cursor.getColumnIndex("suggest_flags");
                return;
            }
            catch (Exception exception)
            {
                Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception);
            }
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, Context context, Cursor cursor)
    {
        f f1 = (f)view.getTag();
        int i;
        String s1;
        Object obj;
        if (w != -1)
        {
            i = cursor.getInt(w);
        } else
        {
            i = 0;
        }
        if (f1.a != null)
        {
            String s2 = a(cursor, r);
            a(f1.a, ((CharSequence) (s2)));
        }
        if (f1.b == null) goto _L2; else goto _L1
_L1:
        s1 = a(cursor, t);
        if (s1 != null)
        {
            obj = b(s1);
        } else
        {
            obj = a(cursor, s);
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        if (f1.a != null)
        {
            f1.a.setSingleLine(false);
            f1.a.setMaxLines(2);
        }
_L6:
        a(f1.b, ((CharSequence) (obj)));
_L2:
        if (f1.c != null)
        {
            a(f1.c, e(cursor), 4);
        }
        if (f1.d != null)
        {
            a(f1.d, f(cursor), 8);
        }
        if (p == 2 || p == 1 && (i & 1) != 0)
        {
            f1.e.setVisibility(0);
            f1.e.setTag(f1.a.getText());
            f1.e.setOnClickListener(this);
            return;
        } else
        {
            f1.e.setVisibility(8);
            return;
        }
_L4:
        if (f1.a != null)
        {
            f1.a.setSingleLine(true);
            f1.a.setMaxLines(1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public CharSequence c(Cursor cursor)
    {
        if (cursor != null)
        {
            String s1 = a(cursor, "suggest_intent_query");
            if (s1 != null)
            {
                return s1;
            }
            if (l.shouldRewriteQueryFromData())
            {
                String s3 = a(cursor, "suggest_intent_data");
                if (s3 != null)
                {
                    return s3;
                }
            }
            if (l.shouldRewriteQueryFromText())
            {
                String s2 = a(cursor, "suggest_text_1");
                if (s2 != null)
                {
                    return s2;
                }
            }
        }
        return null;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view2;
        try
        {
            view2 = super.getView(i, view, viewgroup);
        }
        catch (RuntimeException runtimeexception)
        {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeexception);
            View view1 = a(d, c, viewgroup);
            if (view1 != null)
            {
                ((f)view1.getTag()).a.setText(runtimeexception.toString());
            }
            return view1;
        }
        return view2;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        d(a());
    }

    public void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        d(a());
    }

    public void onClick(View view)
    {
        Object obj = view.getTag();
        if (obj instanceof CharSequence)
        {
            k.a((CharSequence)obj);
        }
    }
}
