package com.codeinger.exdagger.component;

import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.modules.BatteryModule;
import com.codeinger.exdagger.scops.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = {BatteryModule.class})
public interface ActivityComponent {

    Battery getBattery();

}
