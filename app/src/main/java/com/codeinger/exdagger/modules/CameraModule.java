package com.codeinger.exdagger.modules;

import com.codeinger.exdagger.model.Camera;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class CameraModule {

    @Provides
    static Camera getCamera(@Named("megapixel") int megapixel){
        return new Camera(megapixel);
    }

}
