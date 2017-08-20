package com.pakistan.kisan;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class AppClass extends Application {
    static String prefferdLanguage;
    static  String previous_language = "EN";
    static  boolean previous_checked = false;

    public static void checkAndSetLanguage(Context context) {
        if (AppClass.prefferdLanguage.equalsIgnoreCase("En")) {
            AppClass.setLocaleEn(context);
        } else {
            AppClass.setLocaleAr(context);
        }
    }

    public static void setLocaleAr(Context context) {
        Locale locale = new Locale("ldrtl");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getApplicationContext().getResources().updateConfiguration(config, null);
    }

    // Setting app language in English
    public static void setLocaleEn(Context context) {
        Locale locale = new Locale("EN");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getApplicationContext().getResources().updateConfiguration(config, null);
    }
}
