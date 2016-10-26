package com.m.app.ui.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by datutu on 2016/10/26.
 */

public class UiHelper {
    public static void ShowToast(Context PContext, String St) {
        Toast.makeText(PContext, St, Toast.LENGTH_SHORT).show();

    }
}
