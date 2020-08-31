package com.codeinger.exdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codeinger.exdagger.component.DaggerMobileComponent;
import com.codeinger.exdagger.component.MobileComponent;
import com.codeinger.exdagger.model.Mobile;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile1,mobile2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent component = DaggerMobileComponent.factory().create(3,8,64);

        component.inject(this);
        mobile1.run();
        mobile2.run();




    }
}
