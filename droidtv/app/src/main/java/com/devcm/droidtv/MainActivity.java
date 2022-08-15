package com.devcm.droidtv;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.FragmentActivity;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {
    private static final String Categories_API = "https://jeka345.github.io/list.xml";
    private static final String Channels_API = "https://jeka345.github.io/list_channels.xml";
    Download_Categories dxg = null;
    Downloads_Channels dxm = null;
    MainFragment mf = null;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        if(!isConnected())
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_no_ethernet);
        }
        else
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Download_Categories download_categories_on_api = new Download_Categories();
            this.dxg = download_categories_on_api;
            download_categories_on_api.execute(Categories_API);
            Downloads_Channels download_channels_on_api = new Downloads_Channels();
            this.dxm = download_channels_on_api;
            download_channels_on_api.execute(Channels_API);
            wait_load();
            System.out.println(this.dxg.entries);
            System.out.println(this.dxm.entries);
            if (savedInstanceState == null) {
                this.mf = new MainFragment(this.dxm.entries, this.dxg.entries);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_browse_fragment, this.mf).commitNow();
            }
        }
    }

    @Override
    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        System.out.println("EVENT ON INTENT");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        System.out.println("ALL RIGHT LOADED RESUME");
    }

    public void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        System.out.println("ALL RIGHT LOADED");
    }

    private void wait_load()
    {
        System.out.print("DXG STATUS ");
        System.out.print(this.dxg.getStatus());
        System.out.println(" .");
        while (!this.dxg.mstat) {
            System.out.print("DXG STATUS ");
            System.out.print(this.dxg.getStatus());
            System.out.println(" .");
        }
        do {
        } while (!this.dxm.mstat);
    }

    public boolean isConnected()
    {
        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        }
        catch (Exception e)
        {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }
}