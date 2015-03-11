// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            nl, lr

public final class js
    implements SafeParcelable
{

    public static final js A = a("courthouse");
    public static final js B = a("dentist");
    public static final js C = a("department_store");
    public static final nl CREATOR = new nl();
    public static final js D = a("doctor");
    public static final js E = a("electrician");
    public static final js F = a("electronics_store");
    public static final js G = a("embassy");
    public static final js H = a("establishment");
    public static final js I = a("finance");
    public static final js J = a("fire_station");
    public static final js K = a("florist");
    public static final js L = a("food");
    public static final js M = a("funeral_home");
    public static final js N = a("furniture_store");
    public static final js O = a("gas_station");
    public static final js P = a("general_contractor");
    public static final js Q = a("grocery_or_supermarket");
    public static final js R = a("gym");
    public static final js S = a("hair_care");
    public static final js T = a("hardware_store");
    public static final js U = a("health");
    public static final js V = a("hindu_temple");
    public static final js W = a("home_goods_store");
    public static final js X = a("hospital");
    public static final js Y = a("insurance_agency");
    public static final js Z = a("jewelry_store");
    public static final js a = a("accounting");
    public static final js aA = a("restaurant");
    public static final js aB = a("roofing_contractor");
    public static final js aC = a("rv_park");
    public static final js aD = a("school");
    public static final js aE = a("shoe_store");
    public static final js aF = a("shopping_mall");
    public static final js aG = a("spa");
    public static final js aH = a("stadium");
    public static final js aI = a("storage");
    public static final js aJ = a("store");
    public static final js aK = a("subway_station");
    public static final js aL = a("synagogue");
    public static final js aM = a("taxi_stand");
    public static final js aN = a("train_station");
    public static final js aO = a("travel_agency");
    public static final js aP = a("university");
    public static final js aQ = a("veterinary_care");
    public static final js aR = a("zoo");
    public static final js aS = a("administrative_area_level_1");
    public static final js aT = a("administrative_area_level_2");
    public static final js aU = a("administrative_area_level_3");
    public static final js aV = a("colloquial_area");
    public static final js aW = a("country");
    public static final js aX = a("floor");
    public static final js aY = a("geocode");
    public static final js aZ = a("intersection");
    public static final js aa = a("laundry");
    public static final js ab = a("lawyer");
    public static final js ac = a("library");
    public static final js ad = a("liquor_store");
    public static final js ae = a("local_government_office");
    public static final js af = a("locksmith");
    public static final js ag = a("lodging");
    public static final js ah = a("meal_delivery");
    public static final js ai = a("meal_takeaway");
    public static final js aj = a("mosque");
    public static final js ak = a("movie_rental");
    public static final js al = a("movie_theater");
    public static final js am = a("moving_company");
    public static final js an = a("museum");
    public static final js ao = a("night_club");
    public static final js ap = a("painter");
    public static final js aq = a("park");
    public static final js ar = a("parking");
    public static final js as = a("pet_store");
    public static final js at = a("pharmacy");
    public static final js au = a("physiotherapist");
    public static final js av = a("place_of_worship");
    public static final js aw = a("plumber");
    public static final js ax = a("police");
    public static final js ay = a("post_office");
    public static final js az = a("real_estate_agency");
    public static final js b = a("airport");
    public static final js ba = a("locality");
    public static final js bb = a("natural_feature");
    public static final js bc = a("neighborhood");
    public static final js bd = a("political");
    public static final js be = a("point_of_interest");
    public static final js bf = a("post_box");
    public static final js bg = a("postal_code");
    public static final js bh = a("postal_code_prefix");
    public static final js bi = a("postal_town");
    public static final js bj = a("premise");
    public static final js bk = a("room");
    public static final js bl = a("route");
    public static final js bm = a("street_address");
    public static final js bn = a("sublocality");
    public static final js bo = a("sublocality_level_1");
    public static final js bp = a("sublocality_level_2");
    public static final js bq = a("sublocality_level_3");
    public static final js br = a("sublocality_level_4");
    public static final js bs = a("sublocality_level_5");
    public static final js bt = a("subpremise");
    public static final js bu = a("transit_station");
    public static final js bv = a("other");
    public static final js c = a("amusement_park");
    public static final js d = a("aquarium");
    public static final js e = a("art_gallery");
    public static final js f = a("atm");
    public static final js g = a("bakery");
    public static final js h = a("bank");
    public static final js i = a("bar");
    public static final js j = a("beauty_salon");
    public static final js k = a("bicycle_store");
    public static final js l = a("book_store");
    public static final js m = a("bowling_alley");
    public static final js n = a("bus_station");
    public static final js o = a("cafe");
    public static final js p = a("campground");
    public static final js q = a("car_dealer");
    public static final js r = a("car_rental");
    public static final js s = a("car_repair");
    public static final js t = a("car_wash");
    public static final js u = a("casino");
    public static final js v = a("cemetery");
    public static final js w = a("church");
    public static final js x = a("city_hall");
    public static final js y = a("clothing_store");
    public static final js z = a("convenience_store");
    final int bw;
    final String bx;

    js(int i1, String s1)
    {
        lr.a(s1);
        bw = i1;
        bx = s1;
    }

    public static js a(String s1)
    {
        return new js(0, s1);
    }

    public int describeContents()
    {
        nl _tmp = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof js) && bx.equals(((js)obj).bx);
    }

    public int hashCode()
    {
        return bx.hashCode();
    }

    public String toString()
    {
        return bx;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        nl _tmp = CREATOR;
        nl.a(this, parcel, i1);
    }

}
