package com.codeinger.exdagger.model;

import android.util.Log;

public class Camera {

    //we don't own this class so we can't annotate it with @Inject

    int megapixel;

    public Camera(int megapixel) {
        this.megapixel = megapixel;
        Log.i("MyMobile", "Camera: created with "+megapixel+ " megapixel");
    }
}
