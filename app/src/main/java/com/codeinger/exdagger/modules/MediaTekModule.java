package com.codeinger.exdagger.modules;

import com.codeinger.exdagger.model.MediaTek;
import com.codeinger.exdagger.model.Proccessor;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModule {

    @Binds
    abstract Proccessor getPrccessor(MediaTek mediaTek);

    //Dagger 2 Tutorial Part 6 - Providing interfaces with module in hindi (2020) Android Studio Tutorial

}
