package com.codeinger.exdagger.component;

import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.modules.BatteryModule;
import com.codeinger.exdagger.modules.SnapdragonModule;
import com.codeinger.exdagger.scops.ActivityScope;

import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {BatteryModule.class})
public interface ActivityComponent {

    FragmentComponent getFragmentComponent(SnapdragonModule module);

    Battery getBattery();

}
