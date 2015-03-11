// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.internal:
//            iq, ip, io, it, 
//            is, ir, ii, ig, 
//            db, iu

public class in extends WebChromeClient
{

    private final ii a;

    public in(ii ii1)
    {
        a = ii1;
    }

    private static void a(android.app.AlertDialog.Builder builder, String s, JsResult jsresult)
    {
        builder.setMessage(s).setPositiveButton(0x104000a, new iq(jsresult)).setNegativeButton(0x1040000, new ip(jsresult)).setOnCancelListener(new io(jsresult)).create().show();
    }

    private static void a(Context context, android.app.AlertDialog.Builder builder, String s, String s1, JsPromptResult jspromptresult)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        TextView textview = new TextView(context);
        textview.setText(s);
        EditText edittext = new EditText(context);
        edittext.setText(s1);
        linearlayout.addView(textview);
        linearlayout.addView(edittext);
        builder.setView(linearlayout).setPositiveButton(0x104000a, new it(jspromptresult, edittext)).setNegativeButton(0x1040000, new is(jspromptresult)).setOnCancelListener(new ir(jspromptresult)).create().show();
    }

    protected final void a(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        db db1 = a.d();
        if (db1 == null)
        {
            ig.e("Could not get ad overlay when showing custom view.");
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            db1.a(view, customviewcallback);
            db1.a(i);
            return;
        }
    }

    protected boolean a(Context context, String s, String s1, String s2, JsResult jsresult, JsPromptResult jspromptresult, boolean flag)
    {
        android.app.AlertDialog.Builder builder;
        builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(s);
        if (flag)
        {
            try
            {
                a(context, builder, s1, s2, jspromptresult);
            }
            catch (android.view.WindowManager.BadTokenException badtokenexception)
            {
                ig.c("Fail to display Dialog.", badtokenexception);
            }
            break MISSING_BLOCK_LABEL_56;
        }
        a(builder, s1, jsresult);
        return true;
    }

    public final void onCloseWindow(WebView webview)
    {
        if (!(webview instanceof ii))
        {
            ig.e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        db db1 = ((ii)webview).d();
        if (db1 == null)
        {
            ig.e("Tried to close an AdWebView not associated with an overlay.");
            return;
        } else
        {
            db1.a();
            return;
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String s = (new StringBuilder()).append("JS: ").append(consolemessage.message()).append(" (").append(consolemessage.sourceId()).append(":").append(consolemessage.lineNumber()).append(")").toString();
        iu.a[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 96
    //                   1 106
    //                   2 113
    //                   3 120
    //                   4 120
    //                   5 127;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        ig.c(s);
_L7:
        return super.onConsoleMessage(consolemessage);
_L2:
        ig.b(s);
        continue; /* Loop/switch isn't completed */
_L3:
        ig.e(s);
        continue; /* Loop/switch isn't completed */
_L4:
        ig.c(s);
        continue; /* Loop/switch isn't completed */
_L5:
        ig.a(s);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        android.webkit.WebView.WebViewTransport webviewtransport = (android.webkit.WebView.WebViewTransport)message.obj;
        WebView webview1 = new WebView(webview.getContext());
        webview1.setWebViewClient(a.f());
        webviewtransport.setWebView(webview1);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        long l3 = 0x500000L - l2;
        if (l3 <= 0L)
        {
            quotaupdater.updateQuota(l);
            return;
        }
        if (l == 0L)
        {
            if (l1 > l3 || l1 > 0x100000L)
            {
                l1 = 0L;
            }
        } else
        if (l1 == 0L)
        {
            l1 = Math.min(l + Math.min(0x20000L, l3), 0x100000L);
        } else
        {
            if (l1 <= Math.min(0x100000L - l, l3))
            {
                l += l1;
            }
            l1 = l;
        }
        quotaupdater.updateQuota(l1);
    }

    public final void onHideCustomView()
    {
        db db1 = a.d();
        if (db1 == null)
        {
            ig.e("Could not get ad overlay when hiding custom view.");
            return;
        } else
        {
            db1.c();
            return;
        }
    }

    public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        if ((webview instanceof ii) && ((ii)webview).j() != null)
        {
            return a(((ii)webview).j(), s, s1, null, jsresult, null, false);
        } else
        {
            return a(webview.getContext(), s, s1, null, jsresult, null, false);
        }
    }

    public final boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        return a(webview.getContext(), s, s1, s2, null, jspromptresult, true);
    }

    public final void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        long l2 = 0x500000L - l1;
        long l3 = 0x20000L + l;
        if (l2 < l3)
        {
            quotaupdater.updateQuota(0L);
            return;
        } else
        {
            quotaupdater.updateQuota(l3);
            return;
        }
    }

    public final void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        a(view, -1, customviewcallback);
    }
}
