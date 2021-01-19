package com.codeinger.exdagger.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;


public class MediaTek  implements Proccessor {

    int clockSpeed;
    int core;

    @Inject
    public MediaTek(@Named("clockSpeed") int clockSpeed,@Named("core") int core) {
        this.clockSpeed = clockSpeed;
        this.core = core;
        Log.i("MyMobile", "MediaTek: start with clockspeed : "+clockSpeed+" core : "+core);
    }

    @Override
    public void start() {
        Log.i("MyMobile", "MediaTek start: ");
    }
}
