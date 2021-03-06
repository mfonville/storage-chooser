package com.codekidlabs.storagechooser.utils;


import android.content.SharedPreferences;
import android.os.Build;

public class DiskUtil {

    public static final String IN_KB = "KiB";
    public static final String IN_MB = "MiB";
    public static final String IN_GB = "GiB";
    public static final String SC_PREFERENCE_KEY = "storage_chooser_path";

    public static int getSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static void saveChooserPathPreference(SharedPreferences sharedPreferences, String path) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SC_PREFERENCE_KEY, path);
        editor.apply();
    }
}
