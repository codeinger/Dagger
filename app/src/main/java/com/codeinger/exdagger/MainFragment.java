package com.codeinger.exdagger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeinger.exdagger.component.ActivityComponent;
import com.codeinger.exdagger.component.ApplicationComponent;
import com.codeinger.exdagger.component.DaggerFragmentComponent;
import com.codeinger.exdagger.component.FragmentComponent;
import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.model.Camera;
import com.codeinger.exdagger.model.Proccessor;


public class MainFragment extends Fragment {

    private View view;

    FragmentComponent component;
    Proccessor proccessor1,proccessor2;
    Battery battery1,battery2;
    Camera camera1,camera2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);

        component = DaggerFragmentComponent.builder().setCore(8).setClockSpeed(3).build();
        proccessor1 = component.getProcessor();
        proccessor2 = component.getProcessor();

        ActivityComponent activityComponent = ((MainActivity)getActivity()).getComponent();
        battery1 = activityComponent.getBattery();
        battery2 = activityComponent.getBattery();

        ApplicationComponent applicationComponent = ((MainApplication)getActivity().getApplicationContext()).getComponent();
        camera1 = applicationComponent.getCamera();
        camera2 = applicationComponent.getCamera();

        Log.i("sjahcvjhds", "===========Fragment:======== ");
        Log.i("sjahcvjhds", "Fragment: "+proccessor1);
        Log.i("sjahcvjhds", "Fragment: "+proccessor2);

        Log.i("sjahcvjhds", "Fragment: "+battery1);
        Log.i("sjahcvjhds", "Fragment: "+battery2);

        Log.i("sjahcvjhds", "Fragment: "+camera1);
        Log.i("sjahcvjhds", "Fragment: "+camera2);

        return view;
    }
}