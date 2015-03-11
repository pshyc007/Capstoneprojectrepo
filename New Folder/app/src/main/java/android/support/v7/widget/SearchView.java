// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.b.b;
import android.support.v7.b.d;
import android.support.v7.c.a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            a, e, b, c, 
//            d

public class SearchView extends LinearLayout
    implements a
{

    static final android.support.v7.widget.a a = new android.support.v7.widget.a();
    private Bundle A;
    private Runnable B;
    private Runnable C;
    private Runnable D;
    private final Intent E;
    private final Intent F;
    private final WeakHashMap G;
    private c b;
    private android.support.v7.widget.b c;
    private android.view.View.OnFocusChangeListener d;
    private android.support.v7.widget.d e;
    private android.view.View.OnClickListener f;
    private boolean g;
    private boolean h;
    private android.support.v4.widget.a i;
    private View j;
    private View k;
    private View l;
    private ImageView m;
    private View n;
    private View o;
    private SearchAutoComplete p;
    private ImageView q;
    private boolean r;
    private CharSequence s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private SearchableInfo z;

    static void a(SearchView searchview, boolean flag)
    {
        searchview.setImeVisibility(flag);
    }

    private void a(boolean flag)
    {
        boolean flag1 = true;
        byte byte0 = 8;
        h = flag;
        int i1;
        boolean flag2;
        View view;
        byte byte1;
        ImageView imageview;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = byte0;
        }
        if (!TextUtils.isEmpty(p.getText()))
        {
            flag2 = flag1;
        } else
        {
            flag2 = false;
        }
        j.setVisibility(i1);
        b(flag2);
        view = n;
        if (flag)
        {
            byte1 = byte0;
        } else
        {
            byte1 = 0;
        }
        view.setVisibility(byte1);
        imageview = q;
        if (!g)
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
        h();
        if (flag2)
        {
            flag1 = false;
        }
        c(flag1);
        g();
    }

    static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private CharSequence b(CharSequence charsequence)
    {
        if (!g)
        {
            return charsequence;
        } else
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.append(charsequence);
            Drawable drawable = getContext().getResources().getDrawable(getSearchIconId());
            int i1 = (int)(1.25D * (double)p.getTextSize());
            drawable.setBounds(0, 0, i1, i1);
            spannablestringbuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            return spannablestringbuilder;
        }
    }

    private void b(boolean flag)
    {
        byte byte0 = 8;
        if (r && f() && hasFocus() && (flag || !w))
        {
            byte0 = 0;
        }
        k.setVisibility(byte0);
    }

    private void c(boolean flag)
    {
        int i1;
        if (w && !c() && flag)
        {
            i1 = 0;
            k.setVisibility(8);
        } else
        {
            i1 = 8;
        }
        o.setVisibility(i1);
    }

    private boolean e()
    {
        SearchableInfo searchableinfo;
        boolean flag;
        searchableinfo = z;
        flag = false;
        if (searchableinfo == null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        flag1 = z.getVoiceSearchEnabled();
        flag = false;
        if (!flag1) goto _L2; else goto _L3
_L3:
        if (!z.getVoiceSearchLaunchWebSearch()) goto _L5; else goto _L4
_L4:
        Intent intent = E;
_L7:
        flag = false;
        if (intent != null)
        {
            android.content.pm.ResolveInfo resolveinfo = getContext().getPackageManager().resolveActivity(intent, 0x10000);
            flag = false;
            if (resolveinfo != null)
            {
                flag = true;
            }
        }
_L2:
        return flag;
_L5:
        boolean flag2 = z.getVoiceSearchLaunchRecognizer();
        intent = null;
        if (flag2)
        {
            intent = F;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean f()
    {
        return (r || w) && !c();
    }

    private void g()
    {
        byte byte0 = 8;
        if (f() && (k.getVisibility() == 0 || o.getVisibility() == 0))
        {
            byte0 = 0;
        }
        l.setVisibility(byte0);
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(d.abc_search_view_preferred_width);
    }

    private int getSearchIconId()
    {
        TypedValue typedvalue = new TypedValue();
        getContext().getTheme().resolveAttribute(b.searchViewSearchIcon, typedvalue, true);
        return typedvalue.resourceId;
    }

    private void h()
    {
        boolean flag = true;
        boolean flag1;
        ImageView imageview;
        int i1;
        Drawable drawable;
        int ai[];
        if (!TextUtils.isEmpty(p.getText()))
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        if (!flag1 && (!g || x))
        {
            flag = false;
        }
        imageview = m;
        i1 = 0;
        if (!flag)
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        drawable = m.getDrawable();
        if (flag1)
        {
            ai = ENABLED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
    }

    private void i()
    {
        post(C);
    }

    private void j()
    {
        if (s != null)
        {
            p.setHint(b(s));
        } else
        if (z != null)
        {
            int i1 = z.getHintId();
            String s1 = null;
            if (i1 != 0)
            {
                s1 = getContext().getString(i1);
            }
            if (s1 != null)
            {
                p.setHint(b(s1));
                return;
            }
        } else
        {
            p.setHint(b(""));
            return;
        }
    }

    private void k()
    {
        int i1 = 1;
        p.setThreshold(z.getSuggestThreshold());
        p.setImeOptions(z.getImeOptions());
        int j1 = z.getInputType();
        if ((j1 & 0xf) == i1)
        {
            j1 &= 0xfffeffff;
            if (z.getSuggestAuthority() != null)
            {
                j1 = 0x80000 | (j1 | 0x10000);
            }
        }
        p.setInputType(j1);
        if (i != null)
        {
            i.a(null);
        }
        if (z.getSuggestAuthority() != null)
        {
            i = new e(getContext(), this, z, G);
            p.setAdapter(i);
            e e1 = (e)i;
            if (t)
            {
                i1 = 2;
            }
            e1.a(i1);
        }
    }

    private void l()
    {
        if (TextUtils.isEmpty(p.getText()))
        {
            if (g && (c == null || !c.a()))
            {
                clearFocus();
                a(true);
            }
            return;
        } else
        {
            p.setText("");
            p.requestFocus();
            setImeVisibility(true);
            return;
        }
    }

    private void m()
    {
        a(false);
        p.requestFocus();
        setImeVisibility(true);
        if (f != null)
        {
            f.onClick(this);
        }
    }

    private void n()
    {
        a.a(p);
        a.b(p);
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            post(B);
        } else
        {
            removeCallbacks(B);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private void setQuery(CharSequence charsequence)
    {
        p.setText(charsequence);
        SearchAutoComplete searchautocomplete = p;
        int i1;
        if (TextUtils.isEmpty(charsequence))
        {
            i1 = 0;
        } else
        {
            i1 = charsequence.length();
        }
        searchautocomplete.setSelection(i1);
    }

    public void a()
    {
        if (x)
        {
            return;
        } else
        {
            x = true;
            y = p.getImeOptions();
            p.setImeOptions(0x2000000 | y);
            p.setText("");
            setIconified(false);
            return;
        }
    }

    void a(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    public void b()
    {
        clearFocus();
        a(true);
        p.setImeOptions(y);
        x = false;
    }

    public boolean c()
    {
        return h;
    }

    public void clearFocus()
    {
        u = true;
        setImeVisibility(false);
        super.clearFocus();
        p.clearFocus();
        u = false;
    }

    void d()
    {
        a(c());
        i();
        if (p.hasFocus())
        {
            n();
        }
    }

    public int getImeOptions()
    {
        return p.getImeOptions();
    }

    public int getInputType()
    {
        return p.getInputType();
    }

    public int getMaxWidth()
    {
        return v;
    }

    public CharSequence getQuery()
    {
        return p.getText();
    }

    public CharSequence getQueryHint()
    {
        CharSequence charsequence;
        if (s != null)
        {
            charsequence = s;
        } else
        {
            SearchableInfo searchableinfo = z;
            charsequence = null;
            if (searchableinfo != null)
            {
                int i1 = z.getHintId();
                charsequence = null;
                if (i1 != 0)
                {
                    return getContext().getString(i1);
                }
            }
        }
        return charsequence;
    }

    public android.support.v4.widget.a getSuggestionsAdapter()
    {
        return i;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(C);
        post(D);
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (z == null)
        {
            return false;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        if (c())
        {
            super.onMeasure(i1, j1);
            return;
        }
        k1 = android.view.View.MeasureSpec.getMode(i1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        k1;
        JVM INSTR lookupswitch 3: default 60
    //                   -2147483648: 74
    //                   0: 130
    //                   1073741824: 109;
           goto _L1 _L2 _L3 _L4
_L1:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), j1);
        return;
_L2:
        if (v > 0)
        {
            l1 = Math.min(v, l1);
        } else
        {
            l1 = Math.min(getPreferredWidth(), l1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (v > 0)
        {
            l1 = Math.min(v, l1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (v > 0)
        {
            l1 = v;
        } else
        {
            l1 = getPreferredWidth();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        i();
    }

    public boolean requestFocus(int i1, Rect rect)
    {
        while (u || !isFocusable()) 
        {
            return false;
        }
        if (!c())
        {
            boolean flag = p.requestFocus(i1, rect);
            if (flag)
            {
                a(false);
            }
            return flag;
        } else
        {
            return super.requestFocus(i1, rect);
        }
    }

    public void setAppSearchData(Bundle bundle)
    {
        A = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            l();
            return;
        } else
        {
            m();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (g == flag)
        {
            return;
        } else
        {
            g = flag;
            a(flag);
            j();
            return;
        }
    }

    public void setImeOptions(int i1)
    {
        p.setImeOptions(i1);
    }

    public void setInputType(int i1)
    {
        p.setInputType(i1);
    }

    public void setMaxWidth(int i1)
    {
        v = i1;
        requestLayout();
    }

    public void setOnCloseListener(android.support.v7.widget.b b1)
    {
        c = b1;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        d = onfocuschangelistener;
    }

    public void setOnQueryTextListener(c c1)
    {
        b = c1;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        f = onclicklistener;
    }

    public void setOnSuggestionListener(android.support.v7.widget.d d1)
    {
        e = d1;
    }

    public void setQueryHint(CharSequence charsequence)
    {
        s = charsequence;
        j();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        t = flag;
        if (i instanceof e)
        {
            e e1 = (e)i;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            e1.a(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        z = searchableinfo;
        if (z != null)
        {
            k();
            j();
        }
        w = e();
        if (w)
        {
            p.setPrivateImeOptions("nm");
        }
        a(c());
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        r = flag;
        a(c());
    }

    public void setSuggestionsAdapter(android.support.v4.widget.a a1)
    {
        i = a1;
        p.setAdapter(i);
    }


    private class SearchAutoComplete extends AutoCompleteTextView
    {

        private int a;
        private SearchView b;

        public boolean enoughToFilter()
        {
            return a <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i1, Rect rect)
        {
            super.onFocusChanged(flag, i1, rect);
            b.d();
        }

        public boolean onKeyPreIme(int i1, KeyEvent keyevent)
        {
            if (i1 == 4)
            {
                if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
                    if (dispatcherstate1 != null)
                    {
                        dispatcherstate1.startTracking(keyevent, this);
                    }
                    return true;
                }
                if (keyevent.getAction() == 1)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
                    if (dispatcherstate != null)
                    {
                        dispatcherstate.handleUpEvent(keyevent);
                    }
                    if (keyevent.isTracking() && !keyevent.isCanceled())
                    {
                        b.clearFocus();
                        android.support.v7.widget.SearchView.a(b, false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i1, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            super.onWindowFocusChanged(flag);
            if (flag && b.hasFocus() && getVisibility() == 0)
            {
                ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (android.support.v7.widget.SearchView.a(getContext()))
                {
                    android.support.v7.widget.SearchView.a.a(this, true);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        void setSearchView(SearchView searchview)
        {
            b = searchview;
        }

        public void setThreshold(int i1)
        {
            super.setThreshold(i1);
            a = i1;
        }

        public SearchAutoComplete(Context context)
        {
            super(context);
            a = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            a = getThreshold();
        }
    }

}
