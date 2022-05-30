package com.devcm.tvyoutv;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

/**
 * Loads {@link RunStream}.
 */
public class PlayOnChannel extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new RunStream()).commit();
        }
    }
}