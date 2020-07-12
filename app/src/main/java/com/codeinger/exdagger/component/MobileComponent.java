package com.codeinger.exdagger.component;


import com.codeinger.exdagger.MainActivity;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.modules.BatteryModule;
import com.codeinger.exdagger.modules.MediaTekModule;
import com.codeinger.exdagger.modules.SnapdragonModule;

import dagger.Component;

@Component(modules = {BatteryModule.class, SnapdragonModule.class})
public interface MobileComponent {

  //  Mobile getMobile();

    void inject(MainActivity activity);




}
