package com.codeinger.exdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Chager {

    @Inject
    public Chager() {
    }

    void setCharger(Mobile mobile){
        Log.i("MyMobile", "setCharger: ");
    }
}
