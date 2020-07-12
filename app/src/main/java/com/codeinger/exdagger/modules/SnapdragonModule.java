package com.codeinger.exdagger.modules;

import com.codeinger.exdagger.model.Proccessor;
import com.codeinger.exdagger.model.Snapdragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapdragonModule {

    int clockSpeed;

    public SnapdragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    Proccessor getProccessor(){
        return new Snapdragon(clockSpeed);
    }

}
