package com.devcm.droidtv;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;

import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.Timer;

public class MainFragment extends BrowseSupportFragment
{
    private static final String TAG = "MainFragment";
    private static List<XMLUtils.EntryMovie> em;
    private static List<XMLUtils.EntryMovie> ef;
    private List<XMLUtils.Entry> eg;
    private Timer mBackgroundTimer;
    private DisplayMetrics mMetrics;

    public MainFragment(List<XMLUtils.EntryMovie> entries_m, List<XMLUtils.Entry> entries_g)
    {
        em = entries_m;
        this.eg = entries_g;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        System.out.println("MainFragment onCreate ");
        super.onActivityCreated(savedInstanceState);
        prepareBackgroundManager();
        setupUIElements();
        UpdateRows(em, eg);
        setupEventListeners();
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        if (null != mBackgroundTimer)
        {
            Log.d(TAG, "onDestroy: " + mBackgroundTimer);
            mBackgroundTimer.cancel();
        }
    }

    public void UpdateRows(List<XMLUtils.EntryMovie> updmovies, List<XMLUtils.Entry> updgenres)
    {
        ArrayObjectAdapter rowsAdapter2 = new ArrayObjectAdapter(new ListRowPresenter());
        CardPresenter cardPresenter = new CardPresenter();
        for (int i = 0; i < updgenres.size(); i++)
        {
            if (i != 0)
            {
                Collections.shuffle(updmovies);
            }
            int t_genre = Integer.parseInt(updgenres.get(i).summary);
            ArrayObjectAdapter ListRowChannels = new ArrayObjectAdapter(cardPresenter);
            boolean add_row = false;
            for (int k = 0; k < updmovies.size(); k++)
            {
                if (Integer.parseInt(updmovies.get(k).genre) == t_genre)
                {
                    PrintStream printStream = System.out;
                    printStream.println("MOVIE TITLE " + updmovies.get(k).title);
                    ListRowChannels.add(updmovies.get(k));
                    add_row = true;
                }
            }
            if (add_row)
            {
                PrintStream printStream2 = System.out;
                printStream2.println("HEADER TITLE " + updgenres.get(i).title);
                rowsAdapter2.add(new ListRow(new HeaderItem(updgenres.get(i).title), ListRowChannels));
            }
        }
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        setAdapter(rowsAdapter2);
    }

    private void prepareBackgroundManager()
    {
        BackgroundManager instance = BackgroundManager.getInstance(requireActivity());
        instance.attach(requireActivity().getWindow());
        this.mMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(this.mMetrics);
    }

    private void setupUIElements()
    {
        setTitle(getString(R.string.browse_title));
        // setSearchAffordanceColor(getResources().getColor(R.color.search_opaque));
        /* код выше отключен до лучших времен */
        setBrandColor(ContextCompat.getColor(requireActivity(), R.color.fastlane_background));
    }

    private void setupEventListeners()
    {
        // setOnSearchClickedListener(this.searchClickListener);
        /* код выше отключен из-за отсуствия стабильности а так-же крашей, пофикшено будет позже */
        setOnItemViewClickedListener(new ItemViewClickedListener());
        setOnItemViewSelectedListener(new ItemViewSelectedListener());
    }

    public final class ItemViewClickedListener implements OnItemViewClickedListener
    {
        @Override
        public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row)
        {
            if (item instanceof XMLUtils.EntryMovie)
            {
                Log.d(MainFragment.TAG, "Item: " + item);
                Intent intent = new Intent(MainFragment.this.getActivity(), PlaybackActivity.class);
                intent.putExtra(DetailsActivity.MOVIE, (XMLUtils.EntryMovie) item);
                MainFragment.this.requireActivity().startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(MainFragment.this.requireActivity(), ((ImageCardView) itemViewHolder.view).getMainImageView(), DetailsActivity.SHARED_ELEMENT_NAME).toBundle());
            }
            else if (!(item instanceof String))
            {
            }
            else
            {
                if (((String) item).contains(MainFragment.this.getString(R.string.error_fragment)))
                {
                    MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity(), BrowseErrorActivity.class));
                    return;
                }
                Toast.makeText(MainFragment.this.getActivity(), (String) item, Toast.LENGTH_SHORT).show();
            }
        }
    }


    public static final class ItemViewSelectedListener implements OnItemViewSelectedListener
    {
        @Override
        public void onItemSelected(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row)
        {
            if (item instanceof XMLUtils.EntryMovie)
            {

            }
        }
    }

}
