package com.devcm.tvyoutv;

import android.os.Bundle;
import android.os.PowerManager;

import androidx.fragment.app.FragmentActivity;
/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_browse_fragment, new MainFragment()).commitNow();
        }
    }
}