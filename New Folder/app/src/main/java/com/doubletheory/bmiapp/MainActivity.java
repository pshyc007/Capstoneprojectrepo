// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.doubletheory.bmiapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity
    implements android.widget.AdapterView.OnItemSelectedListener
{

    EditText A;
    EditText B;
    EditText C;
    EditText D;
    Spinner E;
    Spinner F;
    Spinner G;
    AdView H;
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    float i;
    float j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    String q;
    String r;
    String s;
    TextView t;
    TextView u;
    TextView v;
    TextView w;
    EditText x;
    EditText y;
    EditText z;

    public MainActivity()
    {
    }

    private void a()
    {
        ImageView imageview = (ImageView)findViewById(0x7f080071);
        int i1 = imageview.getWidth();
        int j1 = imageview.getHeight();
        RotateAnimation rotateanimation = new RotateAnimation(i, j, i1 / 2, j1 / 2);
        rotateanimation.setInterpolator(new BounceInterpolator());
        rotateanimation.setDuration(1500L);
        rotateanimation.setFillAfter(true);
        imageview.startAnimation(rotateanimation);
    }

    private void a(int i1)
    {
        if (i1 > 19)
        {
            e = 16D;
            f = 18.5D;
            g = 25D;
            h = 40D;
            return;
        }
        switch (i1)
        {
        default:
            return;

        case 5: // '\005'
            if (b == 0.0D)
            {
                e = 11.699999999999999D;
                f = 14.1D;
                g = 16.699999999999999D;
                h = 20.600000000000001D;
                return;
            } else
            {
                e = 11.699999999999999D;
                f = 13.9D;
                g = 17D;
                h = 22.100000000000001D;
                return;
            }

        case 6: // '\006'
            if (b == 0.0D)
            {
                e = 12.1D;
                f = 14.1D;
                g = 19D;
                h = 21.5D;
                return;
            } else
            {
                e = 11.699999999999999D;
                f = 13.9D;
                g = 17.300000000000001D;
                h = 23.199999999999999D;
                return;
            }

        case 7: // '\007'
            if (b == 0.0D)
            {
                e = 12.300000000000001D;
                f = 14.199999999999999D;
                g = 17.399999999999999D;
                h = 22.699999999999999D;
                return;
            } else
            {
                e = 11.800000000000001D;
                f = 13.9D;
                g = 17.699999999999999D;
                h = 20.5D;
                return;
            }

        case 8: // '\b'
            if (b == 0.0D)
            {
                e = 12.4D;
                f = 14.4D;
                g = 17.899999999999999D;
                h = 24.199999999999999D;
                return;
            } else
            {
                e = 11.9D;
                f = 14.1D;
                g = 18.300000000000001D;
                h = 26.399999999999999D;
                return;
            }

        case 9: // '\t'
            if (b == 0.0D)
            {
                e = 12.6D;
                f = 14.6D;
                g = 18.399999999999999D;
                h = 25.899999999999999D;
                return;
            } else
            {
                e = 12.1D;
                f = 14.4D;
                g = 19D;
                h = 28.199999999999999D;
                return;
            }

        case 10: // '\n'
            if (b == 0.0D)
            {
                e = 12.800000000000001D;
                f = 14.9D;
                g = 19.100000000000001D;
                h = 27.899999999999999D;
                return;
            } else
            {
                e = 12.4D;
                f = 14.9D;
                g = 19.800000000000001D;
                h = 30D;
                return;
            }

        case 11: // '\013'
            if (b == 0.0D)
            {
                e = 13.1D;
                f = 15.300000000000001D;
                g = 19.899999999999999D;
                h = 19.800000000000001D;
                return;
            } else
            {
                e = 12.699999999999999D;
                f = 15.300000000000001D;
                g = 20.699999999999999D;
                h = 31.800000000000001D;
                return;
            }

        case 12: // '\f'
            if (b == 0.0D)
            {
                e = 13.4D;
                f = 15.800000000000001D;
                g = 20.800000000000001D;
                h = 31.600000000000001D;
                return;
            } else
            {
                e = 13.199999999999999D;
                f = 16D;
                g = 21.699999999999999D;
                h = 33.299999999999997D;
                return;
            }

        case 13: // '\r'
            if (b == 0.0D)
            {
                e = 13.800000000000001D;
                f = 16.399999999999999D;
                g = 21.699999999999999D;
                h = 33D;
                return;
            } else
            {
                e = 13.6D;
                f = 16.600000000000001D;
                g = 22.699999999999999D;
                h = 34.600000000000001D;
                return;
            }

        case 14: // '\016'
            if (b == 0.0D)
            {
                e = 14.300000000000001D;
                f = 17D;
                g = 22.600000000000001D;
                h = 34D;
                return;
            } else
            {
                e = 14D;
                f = 17.199999999999999D;
                g = 23.5D;
                h = 35.5D;
                return;
            }

        case 15: // '\017'
            if (b == 0.0D)
            {
                e = 14.699999999999999D;
                f = 17.600000000000001D;
                g = 23.5D;
                h = 34.700000000000003D;
                return;
            } else
            {
                e = 14.4D;
                f = 17.800000000000001D;
                g = 24.100000000000001D;
                h = 36D;
                return;
            }

        case 16: // '\020'
            if (b == 0.0D)
            {
                e = 15.1D;
                f = 18.199999999999999D;
                g = 24.199999999999999D;
                h = 35.200000000000003D;
                return;
            } else
            {
                e = 14.6D;
                f = 18.199999999999999D;
                g = 24.5D;
                h = 36.299999999999997D;
                return;
            }

        case 17: // '\021'
            if (b == 0.0D)
            {
                e = 15.4D;
                f = 18.800000000000001D;
                g = 24.899999999999999D;
                h = 35.399999999999999D;
                return;
            } else
            {
                e = 14.699999999999999D;
                f = 18.399999999999999D;
                g = 24.800000000000001D;
                h = 36.299999999999997D;
                return;
            }

        case 18: // '\022'
            if (b == 0.0D)
            {
                e = 15.699999999999999D;
                f = 19.199999999999999D;
                g = 25D;
                h = 35.5D;
                return;
            } else
            {
                e = 14.699999999999999D;
                f = 18.5D;
                g = 25D;
                h = 36.200000000000003D;
                return;
            }

        case 19: // '\023'
            break;
        }
        if (b == 0.0D)
        {
            e = 15.9D;
            f = 16.600000000000001D;
            g = 25D;
            h = 35.5D;
            return;
        } else
        {
            e = 14.699999999999999D;
            f = 18.5D;
            g = 25D;
            h = 36.200000000000003D;
            return;
        }
    }

    private void b()
    {
        double d1 = 0.0D;
        c();
        double d2 = c / (d * d);
        if (d2 > 250D)
        {
            s = "250+";
        } else
        {
            s = String.valueOf((double)Math.round(d2 * 10D) / 10D);
        }
        k = (int)Math.round(d * d * e * a);
        l = (int)Math.round(d * d * f * a);
        m = (int)Math.round(d * d * g * a);
        n = (int)Math.round(d * d * h * a);
        if (d2 <= e)
        {
            r = "#ffb61c";
        } else
        if (d2 < f)
        {
            d1 += (d2 - e) * (59D / (f - e));
            r = "#ffb61c";
        } else
        if (d2 < g)
        {
            d1 = 60D + (d2 - f) * (60D / (g - f));
            r = "#92c500";
        } else
        if (d2 < h)
        {
            d1 = 120D + (d2 - g) * (58D / (h - g));
            r = "#f83a3a";
        } else
        {
            d1 = 180D;
            r = "#f83a3a";
        }
        if (d1 == (double)j)
        {
            i = (float)d1;
            j = (float)d1;
            return;
        } else
        {
            i = j;
            j = (float)d1;
            return;
        }
    }

    private void c()
    {
        double d1 = 0.0D;
        o;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 65
    //                   2 97
    //                   3 135;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_135;
_L5:
        switch (p)
        {
        default:
            return;

        case 1: // '\001'
            d = 0.01D * Double.parseDouble(B.getText().toString());
            return;

        case 2: // '\002'
            if (D.length() != 0)
            {
                d1 = Double.parseDouble(D.getText().toString());
            }
            d = 0.025399999999999999D * (d1 + 12D * Double.parseDouble(C.getText().toString()));
            return;

        case 3: // '\003'
            d = 0.025399999999999999D * Double.parseDouble(B.getText().toString());
            return;
        }
_L2:
        q = "kg";
        a = 1.0D;
        c = Double.parseDouble(y.getText().toString());
          goto _L5
_L3:
        q = "lb";
        a = 2.2046199999999998D;
        c = 0.453592D * Double.parseDouble(y.getText().toString());
          goto _L5
        q = "st";
        a = 0.157473D;
        double d2;
        if (A.length() == 0)
        {
            d2 = d1;
        } else
        {
            d2 = Double.parseDouble(A.getText().toString());
        }
        c = 0.453592D * (d2 + 14D * Double.parseDouble(z.getText().toString()));
          goto _L5
    }

    public void onClickCalculate(View view)
    {
        TextView textview = (TextView)findViewById(0x7f080073);
        TextView textview1 = (TextView)findViewById(0x7f08006d);
        TextView textview2 = (TextView)findViewById(0x7f080067);
        TextView textview3 = (TextView)findViewById(0x7f080069);
        TextView textview4 = (TextView)findViewById(0x7f08006f);
        t = (TextView)findViewById(0x7f080066);
        u = (TextView)findViewById(0x7f08006c);
        v = (TextView)findViewById(0x7f08006e);
        w = (TextView)findViewById(0x7f080068);
        ((EditText)findViewById(0x7f080053)).requestFocus();
        if (x.length() == 0)
        {
            Toast.makeText(this, "Please enter your Age", 0).show();
            return;
        }
        if (Double.parseDouble(x.getText().toString()) < 5D)
        {
            Toast.makeText(this, "Age must be more than 4", 0).show();
            return;
        }
        if ((o == 1 || o == 2) && y.length() == 0 || o == 3 && z.length() == 0)
        {
            Toast.makeText(this, "Please enter your weight", 0).show();
            return;
        }
        if ((p == 1 || p == 3) && B.length() == 0 || p == 2 && C.length() == 0)
        {
            Toast.makeText(this, "Please enter your height", 0).show();
            return;
        }
        if (p == 1 && Double.parseDouble(B.getText().toString()) > 300D)
        {
            B.setText("300");
        }
        if (p == 2 && Double.parseDouble(C.getText().toString()) > 10D)
        {
            C.setText("10");
        }
        if (p == 3 && Double.parseDouble(B.getText().toString()) > 120D)
        {
            B.setText("120");
        }
        a(Integer.parseInt(x.getText().toString()));
        b();
        textview1.setText((new StringBuilder()).append(k).append(q).toString());
        textview2.setText((new StringBuilder()).append(l).append(q).toString());
        textview3.setText((new StringBuilder()).append(m).append(q).toString());
        textview4.setText((new StringBuilder()).append(n).append(q).toString());
        u.setText((new StringBuilder()).append("BMI ").append(Double.toString(e)).toString());
        t.setText((new StringBuilder()).append("BMI ").append(Double.toString(f)).toString());
        w.setText((new StringBuilder()).append("BMI ").append(Double.toString(g)).toString());
        v.setText((new StringBuilder()).append("BMI ").append(Double.toString(h)).toString());
        textview.setText(s);
        textview.setTextColor(Color.parseColor(r));
        a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030018);
        H = (AdView)findViewById(0x7f08004e);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            H.setLayerType(1, null);
        }
        com.google.android.gms.ads.AdRequest adrequest = (new com.google.android.gms.ads.AdRequest.Builder()).build();
        H.loadAd(adrequest);
        x = (EditText)findViewById(0x7f080054);
        y = (EditText)findViewById(0x7f080057);
        z = (EditText)findViewById(0x7f080058);
        A = (EditText)findViewById(0x7f080059);
        B = (EditText)findViewById(0x7f08005c);
        C = (EditText)findViewById(0x7f08005d);
        D = (EditText)findViewById(0x7f08005e);
        E = (Spinner)findViewById(0x7f08005a);
        F = (Spinner)findViewById(0x7f08005f);
        G = (Spinner)findViewById(0x7f080055);
        x.setSelectAllOnFocus(true);
        y.setSelectAllOnFocus(true);
        z.setSelectAllOnFocus(true);
        A.setSelectAllOnFocus(true);
        B.setSelectAllOnFocus(true);
        C.setSelectAllOnFocus(true);
        D.setSelectAllOnFocus(true);
        ArrayAdapter arrayadapter = ArrayAdapter.createFromResource(this, 0x7f050002, 0x1090008);
        arrayadapter.setDropDownViewResource(0x1090009);
        E.setAdapter(arrayadapter);
        E.setOnItemSelectedListener(this);
        F = (Spinner)findViewById(0x7f08005f);
        ArrayAdapter arrayadapter1 = ArrayAdapter.createFromResource(this, 0x7f050001, 0x1090008);
        arrayadapter1.setDropDownViewResource(0x1090009);
        F.setAdapter(arrayadapter1);
        F.setOnItemSelectedListener(this);
        G = (Spinner)findViewById(0x7f080055);
        ArrayAdapter arrayadapter2 = ArrayAdapter.createFromResource(this, 0x7f050000, 0x1090008);
        arrayadapter2.setDropDownViewResource(0x1090009);
        G.setAdapter(arrayadapter2);
        G.setOnItemSelectedListener(this);
        x.requestFocus();
    }

    public void onDestroy()
    {
        H.destroy();
        super.onDestroy();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
    {
        long l2 = E.getSelectedItemPosition();
        if (l2 != 0L) goto _L2; else goto _L1
_L1:
        o = 1;
        y.setHint("kg");
        y.setVisibility(0);
        z.setVisibility(8);
        A.setVisibility(8);
_L8:
        long l4;
        long l3 = F.getSelectedItemPosition();
        if (l3 == 0L)
        {
            p = 1;
            B.setHint("cm");
            B.setVisibility(0);
            C.setVisibility(8);
            D.setVisibility(8);
        } else
        if (l3 == 1L)
        {
            p = 2;
            B.setVisibility(8);
            C.setVisibility(0);
            D.setVisibility(0);
        } else
        if (l3 == 2L)
        {
            p = 3;
            B.setHint("in");
            B.setVisibility(0);
            C.setVisibility(8);
            D.setVisibility(8);
        }
        l4 = G.getSelectedItemPosition();
        if (l4 != 0L) goto _L4; else goto _L3
_L3:
        b = 0.0D;
_L6:
        return;
_L2:
        if (l2 == 1L)
        {
            o = 2;
            q = "lb";
            y.setHint("lb");
            y.setVisibility(0);
            z.setVisibility(8);
            A.setVisibility(8);
        } else
        if (l2 == 2L)
        {
            o = 3;
            q = "st";
            y.setVisibility(8);
            z.setVisibility(0);
            A.setVisibility(0);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (l4 != 1L) goto _L6; else goto _L5
_L5:
        b = 1.0D;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public void onPause()
    {
        H.pause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        H.resume();
    }
}
