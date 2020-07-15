package com.codeinger.exdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codeinger.exdagger.component.DaggerMobileComponent;
import com.codeinger.exdagger.component.MobileComponent;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.modules.SnapdragonModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent component = DaggerMobileComponent.builder()
                .setClockSpeed(4)
                .setCore(2)
                .build();

        component.inject(this);
        mobile.run();

        //@component.builder, @bindsinstance & @named

    }
}
