// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.support.v4.view.g;
import android.support.v7.b.c;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            r, u, o, y

public class n
    implements a
{

    private static final int d[] = {
        1, 4, 5, 3, 2, 0
    };
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private o i;
    private ArrayList j;
    private ArrayList k;
    private boolean l;
    private ArrayList m;
    private ArrayList n;
    private boolean o;
    private int p;
    private android.view.ContextMenu.ContextMenuInfo q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private CopyOnWriteArrayList w;
    private r x;

    public n(Context context)
    {
        p = 0;
        r = false;
        s = false;
        t = false;
        u = false;
        v = new ArrayList();
        w = new CopyOnWriteArrayList();
        e = context;
        f = context.getResources();
        j = new ArrayList();
        k = new ArrayList();
        l = true;
        m = new ArrayList();
        n = new ArrayList();
        o = true;
        d(true);
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = -1 + arraylist.size(); j1 >= 0; j1--)
        {
            if (((r)arraylist.get(j1)).b() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = c(k1);
        r r1 = new r(this, i1, j1, k1, l1, charsequence, p);
        if (q != null)
        {
            r1.a(q);
        }
        j.add(a(j, l1), r1);
        b(true);
        return r1;
    }

    private void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
    {
        Resources resources = c();
        if (view == null) goto _L2; else goto _L1
_L1:
        c = view;
        a = null;
        b = null;
_L4:
        b(false);
        return;
_L2:
        if (i1 > 0)
        {
            a = resources.getText(i1);
        } else
        if (charsequence != null)
        {
            a = charsequence;
        }
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        b = resources.getDrawable(j1);
_L6:
        c = null;
        if (true) goto _L4; else goto _L3
_L3:
        if (drawable == null) goto _L6; else goto _L5
_L5:
        b = drawable;
          goto _L6
    }

    private void a(int i1, boolean flag)
    {
        if (i1 >= 0 && i1 < j.size())
        {
            j.remove(i1);
            if (flag)
            {
                b(true);
                return;
            }
        }
    }

    private boolean a(y y1)
    {
        if (w.isEmpty())
        {
            return false;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            u u1 = (u)weakreference.get();
            boolean flag1;
            if (u1 == null)
            {
                w.remove(weakreference);
                flag1 = flag;
            } else
            if (!flag)
            {
                flag1 = u1.a(y1);
            } else
            {
                flag1 = flag;
            }
            flag = flag1;
        }
        return flag;
    }

    private static int c(int i1)
    {
        int j1 = (0xffff0000 & i1) >> 16;
        if (j1 < 0 || j1 >= d.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            return d[j1] << 16 | 0xffff & i1;
        }
    }

    private void c(boolean flag)
    {
        if (w.isEmpty())
        {
            return;
        }
        f();
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            u u1 = (u)weakreference.get();
            if (u1 == null)
            {
                w.remove(weakreference);
            } else
            {
                u1.b(flag);
            }
        }

        g();
    }

    private void d(boolean flag)
    {
        boolean flag1 = true;
        if (!flag || f.getConfiguration().keyboard == flag1 || !f.getBoolean(c.abc_config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag1 = false;
        }
        h = flag1;
    }

    public int a(int i1)
    {
        int j1 = size();
        for (int k1 = 0; k1 < j1; k1++)
        {
            if (((r)j.get(k1)).getItemId() == i1)
            {
                return k1;
            }
        }

        return -1;
    }

    public int a(int i1, int j1)
    {
        int k1 = size();
        if (j1 < 0)
        {
            j1 = 0;
        }
        for (int l1 = j1; l1 < k1; l1++)
        {
            if (((r)j.get(l1)).getGroupId() == i1)
            {
                return l1;
            }
        }

        return -1;
    }

    protected n a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected n a(View view)
    {
        a(0, null, 0, null, view);
        return this;
    }

    protected n a(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    r a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = v;
        arraylist.clear();
        a(((List) (arraylist)), i1, keyevent);
        if (!arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        r r1 = null;
_L4:
        return r1;
_L2:
        int j1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        keyevent.getKeyData(keydata);
        int k1 = arraylist.size();
        if (k1 == 1)
        {
            return (r)arraylist.get(0);
        }
        boolean flag = a();
        int l1 = 0;
        do
        {
label0:
            {
                if (l1 >= k1)
                {
                    break label0;
                }
                r1 = (r)arraylist.get(l1);
                char c1;
                if (flag)
                {
                    c1 = r1.getAlphabeticShortcut();
                } else
                {
                    c1 = r1.getNumericShortcut();
                }
                if (c1 == keydata.meta[0] && (j1 & 2) == 0 || c1 == keydata.meta[2] && (j1 & 2) != 0 || flag && c1 == '\b' && i1 == 67)
                {
                    continue; /* Loop/switch isn't completed */
                }
                l1++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    void a(r r1)
    {
        l = true;
        b(true);
    }

    public void a(u u1)
    {
        w.add(new WeakReference(u1));
        u1.a(e, this);
        o = true;
    }

    void a(MenuItem menuitem)
    {
        int i1 = menuitem.getGroupId();
        int j1 = j.size();
        int k1 = 0;
        do
        {
            if (k1 >= j1)
            {
                break;
            }
            r r1 = (r)j.get(k1);
            if (r1.getGroupId() == i1 && r1.f() && r1.isCheckable())
            {
                boolean flag;
                if (r1 == menuitem)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                r1.b(flag);
            }
            k1++;
        } while (true);
    }

    void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = a();
        int j1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int k1 = j.size();
            int l1 = 0;
            while (l1 < k1) 
            {
                r r1 = (r)j.get(l1);
                if (r1.hasSubMenu())
                {
                    ((n)r1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = r1.getAlphabeticShortcut();
                } else
                {
                    c1 = r1.getNumericShortcut();
                }
                if ((j1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && r1.isEnabled())
                {
                    list.add(r1);
                }
                l1++;
            }
        }
    }

    final void a(boolean flag)
    {
        if (u)
        {
            return;
        }
        u = true;
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            u u1 = (u)weakreference.get();
            if (u1 == null)
            {
                w.remove(weakreference);
            } else
            {
                u1.a(this, flag);
            }
        }

        u = false;
    }

    boolean a()
    {
        return g;
    }

    boolean a(n n1, MenuItem menuitem)
    {
        return i != null && i.a(n1, menuitem);
    }

    public boolean a(MenuItem menuitem, int i1)
    {
        r r1;
        boolean flag;
        r1 = (r)menuitem;
        flag = false;
        if (r1 == null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        flag1 = r1.isEnabled();
        flag = false;
        if (flag1) goto _L3; else goto _L2
_L2:
        return flag;
_L3:
        boolean flag2;
        g g1;
        boolean flag3;
        flag2 = r1.a();
        g1 = r1.m();
        if (g1 != null && g1.e())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!r1.n())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2 | r1.expandActionView();
        if (flag)
        {
            a(true);
            return flag;
        }
        if (true) goto _L2; else goto _L4
_L4:
        if (r1.hasSubMenu() || flag3)
        {
            a(false);
            if (!r1.hasSubMenu())
            {
                r1.a(new y(d(), this, r1));
            }
            y y1 = (y)r1.getSubMenu();
            if (flag3)
            {
                g1.a(y1);
            }
            flag = flag2 | a(y1);
            if (!flag)
            {
                a(true);
                return flag;
            }
        } else
        {
            if ((i1 & 1) == 0)
            {
                a(true);
            }
            return flag2;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public MenuItem add(int i1)
    {
        return a(0, 0, 0, f.getString(i1));
    }

    public MenuItem add(int i1, int j1, int k1, int l1)
    {
        return a(i1, j1, k1, f.getString(l1));
    }

    public MenuItem add(int i1, int j1, int k1, CharSequence charsequence)
    {
        return a(i1, j1, k1, charsequence);
    }

    public MenuItem add(CharSequence charsequence)
    {
        return a(0, 0, 0, charsequence);
    }

    public int addIntentOptions(int i1, int j1, int k1, ComponentName componentname, Intent aintent[], Intent intent, int l1, 
            MenuItem amenuitem[])
    {
        PackageManager packagemanager = e.getPackageManager();
        List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
        int i2;
        int j2;
        if (list != null)
        {
            i2 = list.size();
        } else
        {
            i2 = 0;
        }
        if ((l1 & 1) == 0)
        {
            removeGroup(i1);
        }
        j2 = 0;
        while (j2 < i2) 
        {
            ResolveInfo resolveinfo = (ResolveInfo)list.get(j2);
            Intent intent1;
            Intent intent2;
            MenuItem menuitem;
            if (resolveinfo.specificIndex < 0)
            {
                intent1 = intent;
            } else
            {
                intent1 = aintent[resolveinfo.specificIndex];
            }
            intent2 = new Intent(intent1);
            intent2.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
            menuitem = add(i1, j1, k1, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(intent2);
            if (amenuitem != null && resolveinfo.specificIndex >= 0)
            {
                amenuitem[resolveinfo.specificIndex] = menuitem;
            }
            j2++;
        }
        return i2;
    }

    public SubMenu addSubMenu(int i1)
    {
        return addSubMenu(0, 0, 0, ((CharSequence) (f.getString(i1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
    {
        return addSubMenu(i1, j1, k1, ((CharSequence) (f.getString(l1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
    {
        r r1 = (r)a(i1, j1, k1, charsequence);
        y y1 = new y(e, this, r1);
        r1.a(y1);
        return y1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public int b(int i1)
    {
        return a(i1, 0);
    }

    void b(r r1)
    {
        o = true;
        b(true);
    }

    void b(boolean flag)
    {
        if (!r)
        {
            if (flag)
            {
                l = true;
                o = true;
            }
            c(flag);
            return;
        } else
        {
            s = true;
            return;
        }
    }

    public boolean b()
    {
        return h;
    }

    Resources c()
    {
        return f;
    }

    public boolean c(r r1)
    {
        boolean flag;
        boolean flag1;
        flag = w.isEmpty();
        flag1 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        return flag1;
_L2:
        Iterator iterator;
        boolean flag2;
        f();
        iterator = w.iterator();
        flag2 = false;
_L4:
        u u1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        WeakReference weakreference = (WeakReference)iterator.next();
        u1 = (u)weakreference.get();
        if (u1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        w.remove(weakreference);
        flag1 = flag2;
_L6:
        flag2 = flag1;
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = u1.a(this, r1);
        if (!flag1) goto _L6; else goto _L5
_L5:
        g();
        if (flag1)
        {
            x = r1;
            return flag1;
        }
        if (true) goto _L1; else goto _L7
_L7:
        flag1 = flag2;
          goto _L5
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void clear()
    {
        if (x != null)
        {
            d(x);
        }
        j.clear();
        b(true);
    }

    public void clearHeader()
    {
        b = null;
        a = null;
        c = null;
        b(false);
    }

    public void close()
    {
        a(true);
    }

    public Context d()
    {
        return e;
    }

    public boolean d(r r1)
    {
        boolean flag;
        boolean flag1;
        flag = w.isEmpty();
        flag1 = false;
        if (flag) goto _L2; else goto _L1
_L1:
        r r2;
        r2 = x;
        flag1 = false;
        if (r2 == r1) goto _L3; else goto _L2
_L2:
        return flag1;
_L3:
        Iterator iterator;
        boolean flag2;
        f();
        iterator = w.iterator();
        flag2 = false;
_L5:
        u u1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        WeakReference weakreference = (WeakReference)iterator.next();
        u1 = (u)weakreference.get();
        if (u1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        w.remove(weakreference);
        flag1 = flag2;
_L7:
        flag2 = flag1;
        if (true) goto _L5; else goto _L4
_L4:
        flag1 = u1.b(this, r1);
        if (!flag1) goto _L7; else goto _L6
_L6:
        g();
        if (flag1)
        {
            x = null;
            return flag1;
        }
        if (true) goto _L2; else goto _L8
_L8:
        flag1 = flag2;
          goto _L6
        if (true) goto _L2; else goto _L9
_L9:
    }

    public void e()
    {
        if (i != null)
        {
            i.a(this);
        }
    }

    public void f()
    {
        if (!r)
        {
            r = true;
            s = false;
        }
    }

    public MenuItem findItem(int i1)
    {
        int j1;
        int k1;
        j1 = size();
        k1 = 0;
_L6:
        if (k1 >= j1) goto _L2; else goto _L1
_L1:
        Object obj = (r)j.get(k1);
        if (((r) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        if (!((r) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((r) (obj)).getSubMenu().findItem(i1);
        if (obj != null) goto _L3; else goto _L5
_L5:
        k1++;
          goto _L6
_L2:
        return null;
    }

    public void g()
    {
        r = false;
        if (s)
        {
            s = false;
            b(true);
        }
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)j.get(i1);
    }

    ArrayList h()
    {
        if (!l)
        {
            return k;
        }
        k.clear();
        int i1 = j.size();
        for (int j1 = 0; j1 < i1; j1++)
        {
            r r1 = (r)j.get(j1);
            if (r1.isVisible())
            {
                k.add(r1);
            }
        }

        l = false;
        o = true;
        return k;
    }

    public boolean hasVisibleItems()
    {
        int i1 = size();
        for (int j1 = 0; j1 < i1; j1++)
        {
            if (((r)j.get(j1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    public void i()
    {
        if (!o)
        {
            return;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            u u1 = (u)weakreference.get();
            boolean flag1;
            if (u1 == null)
            {
                w.remove(weakreference);
                flag1 = flag;
            } else
            {
                flag1 = flag | u1.f();
            }
            flag = flag1;
        }
        if (flag)
        {
            m.clear();
            n.clear();
            ArrayList arraylist = h();
            int i1 = arraylist.size();
            int j1 = 0;
            while (j1 < i1) 
            {
                r r1 = (r)arraylist.get(j1);
                if (r1.i())
                {
                    m.add(r1);
                } else
                {
                    n.add(r1);
                }
                j1++;
            }
        } else
        {
            m.clear();
            n.clear();
            n.addAll(h());
        }
        o = false;
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    ArrayList j()
    {
        i();
        return m;
    }

    ArrayList k()
    {
        i();
        return n;
    }

    public CharSequence l()
    {
        return a;
    }

    public Drawable m()
    {
        return b;
    }

    public View n()
    {
        return c;
    }

    public n o()
    {
        return this;
    }

    boolean p()
    {
        return t;
    }

    public boolean performIdentifierAction(int i1, int j1)
    {
        return a(findItem(i1), j1);
    }

    public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
    {
        r r1 = a(i1, keyevent);
        boolean flag = false;
        if (r1 != null)
        {
            flag = a(r1, j1);
        }
        if ((j1 & 2) != 0)
        {
            a(true);
        }
        return flag;
    }

    public r q()
    {
        return x;
    }

    public void removeGroup(int i1)
    {
        int j1 = b(i1);
        if (j1 >= 0)
        {
            int k1 = j.size() - j1;
            int l1 = 0;
            do
            {
                int i2 = l1 + 1;
                if (l1 >= k1 || ((r)j.get(j1)).getGroupId() != i1)
                {
                    break;
                }
                a(j1, false);
                l1 = i2;
            } while (true);
            b(true);
        }
    }

    public void removeItem(int i1)
    {
        a(a(i1), true);
    }

    public void setGroupCheckable(int i1, boolean flag, boolean flag1)
    {
        int j1 = j.size();
        for (int k1 = 0; k1 < j1; k1++)
        {
            r r1 = (r)j.get(k1);
            if (r1.getGroupId() == i1)
            {
                r1.a(flag1);
                r1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int j1 = j.size();
        for (int k1 = 0; k1 < j1; k1++)
        {
            r r1 = (r)j.get(k1);
            if (r1.getGroupId() == i1)
            {
                r1.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i1, boolean flag)
    {
        int j1 = j.size();
        int k1 = 0;
        boolean flag1 = false;
        while (k1 < j1) 
        {
            r r1 = (r)j.get(k1);
            boolean flag2;
            if (r1.getGroupId() == i1 && r1.c(flag))
            {
                flag2 = true;
            } else
            {
                flag2 = flag1;
            }
            k1++;
            flag1 = flag2;
        }
        if (flag1)
        {
            b(true);
        }
    }

    public void setQwertyMode(boolean flag)
    {
        g = flag;
        b(false);
    }

    public int size()
    {
        return j.size();
    }

}
