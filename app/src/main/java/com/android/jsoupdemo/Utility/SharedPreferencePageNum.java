package com.android.jsoupdemo.Utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by liurenyi on 2017/4/14.
 */
public class SharedPreferencePageNum {

    public static String getPreferencesPageNum(Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("pageNumber",null);
    }

}
