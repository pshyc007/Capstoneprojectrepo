// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.e;
import android.support.v7.b.g;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            x, r

public class ListMenuItemView extends LinearLayout
    implements x
{

    private r a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private Drawable g;
    private int h;
    private Context i;
    private boolean j;
    private int k;
    private Context l;
    private LayoutInflater m;
    private boolean n;

    public ListMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        l = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, j.MenuView, i1, 0);
        g = typedarray.getDrawable(5);
        h = typedarray.getResourceId(1, -1);
        j = typedarray.getBoolean(7, false);
        i = context;
        typedarray.recycle();
    }

    private void b()
    {
        b = (ImageView)getInflater().inflate(g.abc_list_menu_item_icon, this, false);
        addView(b, 0);
    }

    private void c()
    {
        c = (RadioButton)getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        addView(c);
    }

    private void d()
    {
        e = (CheckBox)getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        addView(e);
    }

    private LayoutInflater getInflater()
    {
        if (m == null)
        {
            m = LayoutInflater.from(l);
        }
        return m;
    }

    public void a(r r1, int i1)
    {
        a = r1;
        k = i1;
        int j1;
        if (r1.isVisible())
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        setVisibility(j1);
        setTitle(r1.a(this));
        setCheckable(r1.isCheckable());
        a(r1.e(), r1.c());
        setIcon(r1.getIcon());
        setEnabled(r1.isEnabled());
    }

    public void a(boolean flag, char c1)
    {
        int i1;
        if (flag && a.e())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        if (i1 == 0)
        {
            f.setText(a.d());
        }
        if (f.getVisibility() != i1)
        {
            f.setVisibility(i1);
        }
    }

    public boolean a()
    {
        return false;
    }

    public r getItemData()
    {
        return a;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setBackgroundDrawable(g);
        d = (TextView)findViewById(e.title);
        if (h != -1)
        {
            d.setTextAppearance(i, h);
        }
        f = (TextView)findViewById(e.shortcut);
    }

    protected void onMeasure(int i1, int j1)
    {
        if (b != null && j)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)b.getLayoutParams();
            if (layoutparams.height > 0 && layoutparams1.width <= 0)
            {
                layoutparams1.width = layoutparams.height;
            }
        }
        super.onMeasure(i1, j1);
    }

    public void setCheckable(boolean flag)
    {
        if (flag || c != null || e != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        if (a.f())
        {
            if (c == null)
            {
                c();
            }
            RadioButton radiobutton1 = c;
            CheckBox checkbox1 = e;
            obj = radiobutton1;
            obj1 = checkbox1;
        } else
        {
            if (e == null)
            {
                d();
            }
            CheckBox checkbox = e;
            RadioButton radiobutton = c;
            obj = checkbox;
            obj1 = radiobutton;
        }
        if (flag)
        {
            ((CompoundButton) (obj)).setChecked(a.isChecked());
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            if (((CompoundButton) (obj)).getVisibility() != i1)
            {
                ((CompoundButton) (obj)).setVisibility(i1);
            }
            if (obj1 != null && ((CompoundButton) (obj1)).getVisibility() != 8)
            {
                ((CompoundButton) (obj1)).setVisibility(8);
                return;
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (e != null)
        {
            e.setVisibility(8);
        }
        if (c != null)
        {
            c.setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setChecked(boolean flag)
    {
        Object obj;
        if (a.f())
        {
            if (c == null)
            {
                c();
            }
            obj = c;
        } else
        {
            if (e == null)
            {
                d();
            }
            obj = e;
        }
        ((CompoundButton) (obj)).setChecked(flag);
    }

    public void setForceShowIcon(boolean flag)
    {
        n = flag;
        j = flag;
    }

    public void setIcon(Drawable drawable)
    {
        boolean flag;
        if (a.h() || n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_19;
        if ((flag || j) && (b != null || drawable != null || j))
        {
            if (b == null)
            {
                b();
            }
            if (drawable != null || j)
            {
                ImageView imageview = b;
                if (!flag)
                {
                    drawable = null;
                }
                imageview.setImageDrawable(drawable);
                if (b.getVisibility() != 0)
                {
                    b.setVisibility(0);
                    return;
                }
            } else
            {
                b.setVisibility(8);
                return;
            }
        }
        return;
    }

    public void setTitle(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            d.setText(charsequence);
            if (d.getVisibility() != 0)
            {
                d.setVisibility(0);
            }
        } else
        if (d.getVisibility() != 8)
        {
            d.setVisibility(8);
            return;
        }
    }
}
