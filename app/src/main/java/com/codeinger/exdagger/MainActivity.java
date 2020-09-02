package com.codeinger.exdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codeinger.MainApplication;
import com.codeinger.exdagger.component.DaggerMobileComponent;
import com.codeinger.exdagger.component.MobileComponent;
import com.codeinger.exdagger.model.Mobile;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

//    @Inject
    Mobile mobile1,mobile2,mobile3,mobile4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        MobileComponent component = ((MainApplication)getApplication()).getComponent();

        mobile1 = component.getMobile();
        mobile2 = component.getMobile();

        mobile3 = component.getMobile();
        mobile4 = component.getMobile();

        mobile1.run();
        mobile2.run();






        
    }
}
