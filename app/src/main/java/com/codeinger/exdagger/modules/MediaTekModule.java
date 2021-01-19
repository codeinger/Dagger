package com.codeinger.exdagger.modules;

import com.codeinger.exdagger.model.MediaTek;
import com.codeinger.exdagger.model.Proccessor;
import com.codeinger.exdagger.scops.FragmentScope;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModule {

    @FragmentScope
    @Binds
    abstract Proccessor getPrccessor(MediaTek mediaTek);


}
