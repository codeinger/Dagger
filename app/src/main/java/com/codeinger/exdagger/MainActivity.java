package com.codeinger.exdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codeinger.exdagger.component.DaggerMobileComponent;
import com.codeinger.exdagger.component.MobileComponent;
import com.codeinger.exdagger.model.Mobile;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent component = DaggerMobileComponent.create();
        Mobile mobile = component.getMobile();
        mobile.run();

    }
}
