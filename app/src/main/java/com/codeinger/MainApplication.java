package com.codeinger;

import android.app.Application;

import com.codeinger.exdagger.component.DaggerMobileComponent;
import com.codeinger.exdagger.component.MobileComponent;

public class MainApplication extends Application {

    private MobileComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerMobileComponent.factory().create(3,8,64);

    }

    public MobileComponent getComponent() {
        return component;
    }
}
