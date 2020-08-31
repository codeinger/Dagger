package com.codeinger.exdagger.component;


import com.codeinger.exdagger.MainActivity;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.modules.BatteryModule;
import com.codeinger.exdagger.modules.CameraModule;
import com.codeinger.exdagger.modules.MediaTekModule;
import com.codeinger.exdagger.modules.SnapdragonModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {BatteryModule.class, MediaTekModule.class,CameraModule.class})
public interface MobileComponent {

  //  Mobile getMobile();

    void inject(MainActivity activity);




    @Component.Factory
    interface Factory{

        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance @Named("core") int core,
                               @BindsInstance @Named("megapixel") int megapixel
        );

    }




}
