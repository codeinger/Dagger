package com.codeinger.exdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {


    private Battery battery;
    private Camera Camera;
    private Proccessor proccessor;

    @Inject
    public Mobile(Battery battery,Proccessor proccessor,Camera Camera) {
        this.proccessor = proccessor;
        this.battery = battery;
        this.Camera = Camera;
        Log.i("hdbfvhjdf", "Mobile: "+battery.toString()+" "+proccessor.toString()+" "+this.toString());

    }

    public void run(){
        proccessor.start();
        Log.i("MyMobile", "Mobile run: ");
    }








}
