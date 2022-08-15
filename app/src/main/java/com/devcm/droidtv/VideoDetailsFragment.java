package com.devcm.droidtv;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.leanback.app.DetailsSupportFragment;
import androidx.leanback.app.DetailsSupportFragmentBackgroundController;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

public class VideoDetailsFragment extends DetailsSupportFragment
{
    private static final int DETAIL_THUMB_WIDTH = 330;
    private static final int DETAIL_THUMB_HEIGHT = 220;
    private static final int ACTION_WATCH_TV = 1;
    private static final String TAG = "VideoDetailsFragment";
    private ArrayObjectAdapter mAdapter;
    private DetailsSupportFragmentBackgroundController mDetailsBackground;
    private ClassPresenterSelector mPresenterSelector;
    private XMLUtils.EntryMovie mSelectedMovie;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Log.d(TAG, "onCreate DetailsFragment");
        super.onCreate(savedInstanceState);
        mDetailsBackground = new DetailsSupportFragmentBackgroundController(this);
        XMLUtils.EntryMovie entryMovie = (XMLUtils.EntryMovie) getActivity().getIntent().getSerializableExtra(DetailsActivity.MOVIE);
        mSelectedMovie = entryMovie;
        if (entryMovie != null)
        {
            mPresenterSelector = new ClassPresenterSelector();
            mAdapter = new ArrayObjectAdapter(mPresenterSelector);
            setupDetailsOverviewRow();
            setupDetailsOverviewRowPresenter();
            setAdapter(mAdapter);
            initializeBackground(mSelectedMovie);
            setOnItemViewClickedListener(new ItemViewClickedListener());
            return;
        }
        startActivity(new Intent(getActivity(), MainActivity.class));
    }

    private void initializeBackground(XMLUtils.EntryMovie data)
    {
        mDetailsBackground.enableParallax();
        Glide.with(getActivity()).asBitmap().centerCrop().error(R.drawable.default_background).load(data.getBackgroundImageUrl()).into(new SimpleTarget<Bitmap>()
        {
            @Override
            public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition)
            {
                mDetailsBackground.setCoverBitmap(bitmap);
                mAdapter.notifyArrayItemRangeChanged(0, mAdapter.size());
            }
        });
    }

    private void setupDetailsOverviewRow()
    {
        Log.d(TAG, "doInBackground: " + mSelectedMovie.toString());
        final DetailsOverviewRow row = new DetailsOverviewRow(mSelectedMovie);
        row.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.default_background));
        int width = convertDpToPixel(getActivity().getApplicationContext(), DETAIL_THUMB_WIDTH);
        int height = convertDpToPixel(getActivity().getApplicationContext(), DETAIL_THUMB_HEIGHT);
        Glide.with(getActivity()).load(mSelectedMovie.getCardImageUrl()).centerCrop().error(R.drawable.default_background).into(new SimpleTarget<Drawable>(width, height)
        {
            @Override
            public void onResourceReady(@NonNull Drawable drawable, @Nullable Transition<? super Drawable> transition)
            {
                Log.d(TAG, "details overview card image url ready: " + drawable);
                row.setImageDrawable(drawable);
                mAdapter.notifyArrayItemRangeChanged(0, mAdapter.size());
            }
        });
        ArrayObjectAdapter actionAdapter = new ArrayObjectAdapter();
        actionAdapter.add(new Action(1, getResources().getString(R.string.online_tv)));
        row.setActionsAdapter(actionAdapter);
        this.mAdapter.add(row);
    }

    private void setupDetailsOverviewRowPresenter()
    {
        FullWidthDetailsOverviewRowPresenter detailsPresenter = new FullWidthDetailsOverviewRowPresenter(new DetailsDescriptionPresenter());
        detailsPresenter.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.selected_background));
        FullWidthDetailsOverviewSharedElementHelper sharedElementHelper = new FullWidthDetailsOverviewSharedElementHelper();
        sharedElementHelper.setSharedElementEnterTransition(getActivity(), DetailsActivity.SHARED_ELEMENT_NAME);
        detailsPresenter.setListener(sharedElementHelper);
        detailsPresenter.setParticipatingEntranceTransition(true);
        detailsPresenter.setOnActionClickedListener(action ->
        {
            if (action.getId() == ACTION_WATCH_TV)
            {
                Intent intent = new Intent(getActivity(), PlaybackActivity.class);
                intent.putExtra(DetailsActivity.MOVIE, VideoDetailsFragment.this.mSelectedMovie);
                VideoDetailsFragment.this.startActivity(intent);
            }
            else
            {
                Toast.makeText(getActivity(), action.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        mPresenterSelector.addClassPresenter(DetailsOverviewRow.class, detailsPresenter);
    }

    private int convertDpToPixel(Context context, int dp)
    {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }

    private final class ItemViewClickedListener implements OnItemViewClickedListener
    {
        @Override
        public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row)
        {
            if (item instanceof XMLUtils.EntryMovie)
            {
                Log.d(VideoDetailsFragment.TAG, "Item: " + item);
               /* Intent intent = new Intent(VideoDetailsFragment.this.getActivity(), DetailsActivity.class);
                intent.putExtra(VideoDetailsFragment.this.getResources().getString(R.string.movie), VideoDetailsFragment.this.mSelectedMovie);
                VideoDetailsFragment.this.getActivity().startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(VideoDetailsFragment.this.getActivity(), ((ImageCardView) itemViewHolder.view).getMainImageView(), DetailsActivity.SHARED_ELEMENT_NAME).toBundle());*/
                Intent intent = new Intent(getActivity(), PlaybackActivity.class);
                intent.putExtra(VideoDetailsFragment.this.getResources().getString(R.string.movie), VideoDetailsFragment.this.mSelectedMovie);
                VideoDetailsFragment.this.startActivity(intent);
                return;
            }
        }
    }
}
