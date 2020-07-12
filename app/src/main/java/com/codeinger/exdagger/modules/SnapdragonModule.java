package com.codeinger.exdagger.modules;

import com.codeinger.exdagger.model.Proccessor;
import com.codeinger.exdagger.model.Snapdragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapdragonModule {

    @Provides
    static Proccessor getProccessor(Snapdragon snapdragon){
        return snapdragon;
    }

}
