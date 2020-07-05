package com.codeinger.exdagger.component;


import com.codeinger.exdagger.MainActivity;
import com.codeinger.exdagger.model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {

    Mobile getMobile();

    void inject(MainActivity activity);




}
