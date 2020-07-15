package com.codeinger.exdagger.component;


import com.codeinger.exdagger.MainActivity;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.modules.BatteryModule;
import com.codeinger.exdagger.modules.MediaTekModule;
import com.codeinger.exdagger.modules.SnapdragonModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {BatteryModule.class, MediaTekModule.class})
public interface MobileComponent {

  //  Mobile getMobile();

    void inject(MainActivity activity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core") int core);


        MobileComponent build();
    }




}
