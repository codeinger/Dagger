package com.codeinger.exdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Snapdragon implements Proccessor {

    @Inject
    public Snapdragon() {
        Log.i("MyMobile", "Snapdragon: ");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "Snapdragon start: ");
    }
}
