package com.example.naveenk.amedia;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by naveenk on 12/5/15.
 */
public class GFX extends Activity {

    MyBringBack ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ourView = new MyBringBack(this);
        setContentView(ourView);
    }
}
