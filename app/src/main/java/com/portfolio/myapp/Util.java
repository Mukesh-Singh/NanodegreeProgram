package com.portfolio.myapp;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by mukesh on 28/1/16.
 */
public class Util {
    public static void showToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
