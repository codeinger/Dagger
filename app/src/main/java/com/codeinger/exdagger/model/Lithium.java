package com.codeinger.exdagger.model;

import android.util.Log;

public class Lithium {

    //we don't own this class so we can't annotate it with @Inject

    public Lithium() {
        Log.i("MyMobile", "Lithium: ");
    }

    public void done(){
        Log.i("MyMobile", "done: ");
    }
}
