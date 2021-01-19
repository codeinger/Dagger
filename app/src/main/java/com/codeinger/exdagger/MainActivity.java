package com.codeinger.exdagger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.codeinger.exdagger.component.ActivityComponent;
import com.codeinger.exdagger.component.ApplicationComponent;
import com.codeinger.exdagger.component.DaggerActivityComponent;
import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.model.Camera;
import com.codeinger.exdagger.model.Mobile;


//        Application ---- Camera
//        Activity --- Battery
//        Fragment --- Processor


public class MainActivity extends AppCompatActivity {



    ActivityComponent component;

    Battery battery1,battery2;
    Camera camera1,camera2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        replace(new MainFragment());


        component = DaggerActivityComponent.builder().build();
        battery1 = component.getBattery();
        battery2 = component.getBattery();

        ApplicationComponent applicationComponent = ((MainApplication)getApplicationContext()).getComponent();
        camera1 = applicationComponent.getCamera();
        camera2 = applicationComponent.getCamera();

        Log.i("sjahcvjhds", "================Activity:============ ");
        Log.i("sjahcvjhds", "Activity: "+battery1);
        Log.i("sjahcvjhds", "Activity: "+battery2);

        Log.i("sjahcvjhds", "Activity: "+camera1);
        Log.i("sjahcvjhds", "Activity: "+camera2);


        
    }

    public ActivityComponent getComponent() {
        return component;
    }

    void replace(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.commit();
    }





}
