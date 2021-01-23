package com.codeinger.exdagger.component;

import com.codeinger.exdagger.model.MediaTek;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.model.Proccessor;
import com.codeinger.exdagger.modules.MediaTekModule;
import com.codeinger.exdagger.scops.FragmentScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@FragmentScope
@Component(dependencies = {ApplicationComponent.class,ActivityComponent.class},modules = {MediaTekModule.class})
public interface FragmentComponent {

    Proccessor getProcessor();

    Mobile getMobile();



    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockspeed);

        @BindsInstance
        Builder setCore(@Named("core") int core);

        Builder setApplicationComponent(ApplicationComponent component);

        Builder setActivityComponent(ActivityComponent component);

        FragmentComponent build();

    }

}
