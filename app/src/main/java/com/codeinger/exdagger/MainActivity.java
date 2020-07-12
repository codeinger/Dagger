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
                .snapdragonModule(new SnapdragonModule(3))
                .build();
        component.inject(this);
        mobile.run();

        //Dagger 2 Tutorial Part 6 - Providing Value at run time in dagger module in hindi (2020) Android Studio Tutorial
    }
}
