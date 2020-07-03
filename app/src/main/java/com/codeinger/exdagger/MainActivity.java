package com.codeinger.exdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.model.Proccessor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Battery battery = new Battery();
        Proccessor proccessor = new Proccessor();
        Mobile mobile = new Mobile(battery,proccessor);

    }
}
