package com.codeinger.exdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Snapdragon implements Proccessor {

    int clockSpeed;


    @Inject
    public Snapdragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        Log.i("MyMobile", "Snapdragon: ");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "Snapdragon start: with clock speed "+clockSpeed);
    }
}
