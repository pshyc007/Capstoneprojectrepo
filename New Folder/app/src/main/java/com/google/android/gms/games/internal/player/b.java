// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class b
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;

    public b(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            a = "external_player_id";
            b = "profile_name";
            c = "profile_icon_image_uri";
            d = "profile_icon_image_url";
            e = "profile_hi_res_image_uri";
            f = "profile_hi_res_image_url";
            g = "last_updated";
            h = "is_in_circles";
            i = "played_with_timestamp";
            j = "current_xp_total";
            k = "current_level";
            l = "current_level_min_xp";
            m = "current_level_max_xp";
            n = "next_level";
            o = "next_level_max_xp";
            p = "last_level_up_timestamp";
            q = "player_title";
            r = "has_all_public_acls";
            s = "most_recent_external_game_id";
            t = "most_recent_game_name";
            u = "most_recent_activity_timestamp";
            v = "most_recent_game_icon_uri";
            w = "most_recent_game_hi_res_uri";
            x = "most_recent_game_featured_uri";
            return;
        } else
        {
            a = (new StringBuilder()).append(s1).append("external_player_id").toString();
            b = (new StringBuilder()).append(s1).append("profile_name").toString();
            c = (new StringBuilder()).append(s1).append("profile_icon_image_uri").toString();
            d = (new StringBuilder()).append(s1).append("profile_icon_image_url").toString();
            e = (new StringBuilder()).append(s1).append("profile_hi_res_image_uri").toString();
            f = (new StringBuilder()).append(s1).append("profile_hi_res_image_url").toString();
            g = (new StringBuilder()).append(s1).append("last_updated").toString();
            h = (new StringBuilder()).append(s1).append("is_in_circles").toString();
            i = (new StringBuilder()).append(s1).append("played_with_timestamp").toString();
            j = (new StringBuilder()).append(s1).append("current_xp_total").toString();
            k = (new StringBuilder()).append(s1).append("current_level").toString();
            l = (new StringBuilder()).append(s1).append("current_level_min_xp").toString();
            m = (new StringBuilder()).append(s1).append("current_level_max_xp").toString();
            n = (new StringBuilder()).append(s1).append("next_level").toString();
            o = (new StringBuilder()).append(s1).append("next_level_max_xp").toString();
            p = (new StringBuilder()).append(s1).append("last_level_up_timestamp").toString();
            q = (new StringBuilder()).append(s1).append("player_title").toString();
            r = (new StringBuilder()).append(s1).append("has_all_public_acls").toString();
            s = (new StringBuilder()).append(s1).append("most_recent_external_game_id").toString();
            t = (new StringBuilder()).append(s1).append("most_recent_game_name").toString();
            u = (new StringBuilder()).append(s1).append("most_recent_activity_timestamp").toString();
            v = (new StringBuilder()).append(s1).append("most_recent_game_icon_uri").toString();
            w = (new StringBuilder()).append(s1).append("most_recent_game_hi_res_uri").toString();
            x = (new StringBuilder()).append(s1).append("most_recent_game_featured_uri").toString();
            return;
        }
    }
}
