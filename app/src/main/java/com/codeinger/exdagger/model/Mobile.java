package com.codeinger.exdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    @Inject
    Battery battery;
    private Proccessor proccessor;

    @Inject
    public Mobile(Proccessor proccessor) {
        this.proccessor = proccessor;
        Log.i("MyMobile", "Mobile: ");

    }

    public void run(){
        Log.i("MyMobile", "run: ");
    }



    @Inject
    public void connectCharger(Chager chager){
        chager.setCharger(this);
    }


}
