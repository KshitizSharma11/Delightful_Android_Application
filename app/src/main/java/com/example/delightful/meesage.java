package com.example.delightful;

import android.content.Context;
import android.widget.Toast;

public class meesage {
    public static void meesage(Context context, String msg) {

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}