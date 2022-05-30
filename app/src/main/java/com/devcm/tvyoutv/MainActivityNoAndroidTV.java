package com.devcm.tvyoutv;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.fragment.app.FragmentActivity;

public class MainActivityNoAndroidTV extends FragmentActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_browse_fragment, new MainFragment())
                    .commitNow();
        }
    }
}
