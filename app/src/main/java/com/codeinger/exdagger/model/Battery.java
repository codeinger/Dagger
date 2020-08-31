package com.codeinger.exdagger.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Battery {



    private Cobalt cobalt;
    private Lithium lithium;

    public Battery(Cobalt cobalt,Lithium lithium ) {
        this.cobalt = cobalt;
        this.lithium = lithium;
        Log.i("MyMobile", "Battery: ");
    }
}
