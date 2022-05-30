package com.devcm.tvyoutv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
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

import java.util.Collections;
import java.util.List;
import java.util.Timer;

public class MainFragment extends BrowseSupportFragment
{
    private static final String TAG = "MainFragment";
    private static final int NUM_ROWS = 1;
    private static final int NUM_FEDERALS_COLS = 20;
    private static final int NUM_RAZVLEKATILNIE_NUM = 8;
    private static final int NUM_INFOCHANNELS = 2;
    private static final int NUM_MUSICCHANNELS = 12;
    private static final int NUM_KIDSTV = 7;
    private static final int NUM_POZNAVATELNIECANALI = 20;
    private static final int NUM_POZNAVATELNIECANALIUHD = 1;
    private static final int NUM_FILMSCHANNELS = 18;
    private static final int NUM_REGIONALSCH = 4;
    private static final int NUM_SPORTCHANNELS = 33;
    private static final int NUM_RADIOCHANNELS = 25;
    private final Handler mHandler = new Handler();
    private DisplayMetrics mMetrics;
    private Timer mBackgroundTimer;
    private String mBackgroundUri;
    private BackgroundManager mBackgroundManager;
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        Log.i(TAG, "onCreate");
        super.onActivityCreated(savedInstanceState);
        prepareBackgroundManager();
        setupUIElements();
        loadRows();
        setupEventListeners();
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        if (null != mBackgroundTimer)
        {
            Log.d(TAG, "onDestroy: " + mBackgroundTimer.toString());
            mBackgroundTimer.cancel();
        }
    }

    private void loadRows()
    {
        List<Movie> list;
        list = ChannelList.getList();
        List<Movie> razvlekat;
        razvlekat = ChannelList.getrazvlekat();
        List<Movie> informatios;
        informatios = ChannelList.getInformations();
        List<Movie> kidstv;
        kidstv = ChannelList.getKidsTv();
        List<Movie> poznavatelnie;
        poznavatelnie = ChannelList.getAnimaltv();
        List<Movie> poznavatelnieuhd;
        poznavatelnieuhd = ChannelList.getAnimalUHDtv();
        List<Movie> filmovie;
        filmovie = ChannelList.getFilmsTV();
        List<Movie> musictv;
        musictv = ChannelList.getMusicTV();
        List<Movie> regionalstv;
        regionalstv = ChannelList.getRegionaltv();
        List<Movie> sport1;
        sport1 = ChannelList.getSporttv();
        List<Movie> radiotv;
        radiotv = ChannelList.getRadio();
        ArrayObjectAdapter rowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        CardPresenter cardPresenter = new CardPresenter();
        int i;
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0) {
                Collections.shuffle(list);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_FEDERALS_COLS; j++) {
                listRowAdapter.add(list.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.FEDERALS[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0) {
                Collections.shuffle(razvlekat);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_RAZVLEKATILNIE_NUM; j++) {
                listRowAdapter.add(razvlekat.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.RAZVLEKATILNIE[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0) {
                Collections.shuffle(informatios);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_INFOCHANNELS; j++) {
                listRowAdapter.add(informatios.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.INFORMATIONS[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0) {
                Collections.shuffle(kidstv);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_KIDSTV; j++)
            {
                listRowAdapter.add(kidstv.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.KIDSMENU[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0)
            {
                Collections.shuffle(poznavatelnie);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_POZNAVATELNIECANALI; j++)
            {
                listRowAdapter.add(poznavatelnie.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.ANIMALMENU[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0)
            {
                Collections.shuffle(poznavatelnieuhd);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_POZNAVATELNIECANALIUHD; j++)
            {
                listRowAdapter.add(poznavatelnieuhd.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.ANIMALUHD[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0)
            {
                Collections.shuffle(filmovie);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_FILMSCHANNELS; j++)
            {
                listRowAdapter.add(filmovie.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.FILMSCATEGORY[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0)
            {
                Collections.shuffle(musictv);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_MUSICCHANNELS; j++)
            {
                listRowAdapter.add(musictv.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.MUSICCATEGORY[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0)
            {
                Collections.shuffle(regionalstv);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_REGIONALSCH; j++)
            {
                listRowAdapter.add(regionalstv.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.REGIONALS[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0)
            {
                Collections.shuffle(sport1);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_SPORTCHANNELS; j++)
            {
                listRowAdapter.add(sport1.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.SPORTCHANNELS[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        for (i = 0; i < NUM_ROWS; i++)
        {
            if (i != 0)
            {
                Collections.shuffle(radiotv);
            }
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(cardPresenter);
            for (int j = 0; j < NUM_RADIOCHANNELS; j++)
            {
                listRowAdapter.add(radiotv.get(j));
            }
            HeaderItem header = new HeaderItem(i, ChannelList.RADIOCHANNELS[i]);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }
        setAdapter(rowsAdapter);
    }

    private void prepareBackgroundManager()
    {
        mBackgroundManager = BackgroundManager.getInstance(getActivity());
        mBackgroundManager.attach(getActivity().getWindow());
        ContextCompat.getDrawable(getActivity(), R.drawable.default_background);
        mMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(mMetrics);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void setupUIElements()
    {
         /* set later  */ // setBadgeDrawable(getActivity().getResources().getDrawable(R.drawable.tv_banner));
        setTitle(getString(R.string.browse_title)); // Badge, when set, takes precedent
        // over title
        setHeadersState(HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);
        // set fastLane (or headers) background color
        setBrandColor(ContextCompat.getColor(getActivity(), R.color.fastlane_background));
        // set search icon color
        setSearchAffordanceColor(ContextCompat.getColor(getActivity(), R.color.search_opaque));
    }

    private void setupEventListeners()
    {
        setOnSearchClickedListener(view -> Toast.makeText(getActivity(), getString(R.string.author), Toast.LENGTH_LONG).show());
        setOnItemViewClickedListener(new ItemViewClickedListener());
        setOnItemViewSelectedListener(new ItemViewSelectedListener());
    }

    private final class ItemViewClickedListener implements OnItemViewClickedListener
    {
        @Override
        public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row)
        {
            if (item instanceof Movie)
            {
                Movie movie = (Movie) item;
                Log.d(TAG, "Item: " + item.toString());
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra(DetailsActivity.MOVIE, movie);
                Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), ((ImageCardView) itemViewHolder.view).getMainImageView(), DetailsActivity.SHARED_ELEMENT_NAME).toBundle();
                getActivity().startActivity(intent, bundle);
            }
            else if (item instanceof String)
            {
                if (((String) item).contains(getString(R.string.error_fragment)))
                {
                    Intent intent = new Intent(getActivity(), BrowseErrorActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getActivity(), ((String) item), Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private final class ItemViewSelectedListener implements OnItemViewSelectedListener
    {
        @Override
        public void onItemSelected(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row)
        {

        }
    }
}