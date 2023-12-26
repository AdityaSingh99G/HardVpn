package com.example.hardvpn;

import android.net.Uri;

public class Utiles {

    // used for converting drawable Image Source to String

    public static String getImageUrl(int resourceId){


        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }

}
