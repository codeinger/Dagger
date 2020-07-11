package com.codeinger.exdagger.component;


import com.codeinger.exdagger.MainActivity;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.modules.BatteryModule;

import dagger.Component;

@Component(modules = BatteryModule.class)
public interface MobileComponent {

  //  Mobile getMobile();

    void inject(MainActivity activity);




}
