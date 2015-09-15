package com.accuweather.algirdas.vweather;

import android.content.Context;
import android.net.ConnectivityManager;
import android.provider.SyncStateContract;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Algirdas on 2015.08.31.
 */
public class Utilities {

    public static void showNotification(Context context, String text, int duration) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

    public static void printDebug(String results) {
            Log.i("DEBUG", results);
    }

    public static String celciusSign()
    {
        return "\u2103";
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm.getActiveNetworkInfo() != null) {
            return cm.getActiveNetworkInfo().isConnectedOrConnecting();
        } else return false;
    }
}
