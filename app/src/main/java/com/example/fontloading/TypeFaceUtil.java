package com.example.fontloading;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;

public final class TypeFaceUtil {

    private TypeFaceUtil() {
        // utility class
    }

    public static Typeface getRegular(Context context) {
        return ResourcesCompat.getFont(context, R.font.open_sans);
    }
}
