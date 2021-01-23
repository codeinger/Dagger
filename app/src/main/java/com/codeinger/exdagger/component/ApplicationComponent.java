package com.codeinger.exdagger.component;

import com.codeinger.exdagger.model.Camera;
import com.codeinger.exdagger.modules.CameraModule;
import com.codeinger.exdagger.modules.SnapdragonModule;
import com.codeinger.exdagger.scops.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component(modules = {CameraModule.class})
public interface ApplicationComponent {

    ActivityComponent getActivityComponent();

    Camera getCamera();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setMp(@Named("megapixel") int megapixel);

        ApplicationComponent build();
    }

}
