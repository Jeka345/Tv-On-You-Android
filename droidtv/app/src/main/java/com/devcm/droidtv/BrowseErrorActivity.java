package com.devcm.droidtv;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.C;
import java.util.List;
import com.devcm.droidtv.XMLUtils;

public class BrowseErrorActivity extends FragmentActivity {
    private List<XMLUtils.Entry> eg;
    private List<XMLUtils.EntryMovie> em;
    private List<XMLUtils.EntryMovie> ef;
    private ErrorFragment mErrorFragment;
    private SpinnerFragment mSpinnerFragment;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_browse_fragment, new MainFragment(this.em, this.eg)).commitNow();
        }
        testError();
    }

    public BrowseErrorActivity(List<XMLUtils.EntryMovie> entries_m, List<XMLUtils.Entry> entries_g, List<XMLUtils.EntryMovie> entries_f)
    {
        this.em = entries_m;
        this.eg = entries_g;
        this.ef = entries_f;
    }

    private void testError()
    {
        mErrorFragment = new ErrorFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main_browse_fragment, mErrorFragment).commit();
        mSpinnerFragment = new SpinnerFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main_browse_fragment, mSpinnerFragment).commit();
        final Handler handler = new Handler();
        handler.postDelayed(() ->
        {
            getSupportFragmentManager().beginTransaction().remove(mSpinnerFragment).commit();
            mErrorFragment.setErrorContent();
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public static class SpinnerFragment extends Fragment
    {
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            ProgressBar progressBar = new ProgressBar(container.getContext());
            if (container instanceof FrameLayout)
            {
                progressBar.setLayoutParams(new FrameLayout.LayoutParams(100, 100, 17));
            }
            return progressBar;
        }
    }
}
