package com.devcm.droidtv;

import android.net.Uri;
import android.os.Bundle;

import androidx.leanback.app.VideoSupportFragment;
import androidx.leanback.app.VideoSupportFragmentGlueHost;
import androidx.leanback.media.MediaPlayerAdapter;
import androidx.leanback.media.PlaybackTransportControlGlue;
import androidx.leanback.widget.PlaybackControlsRow;

import java.util.HashMap;
import java.util.Map;

public class PlaybackVideoFragment extends VideoSupportFragment
{
    private PlaybackTransportControlGlue<MediaPlayerAdapter> mTransportControlGlue;
    Map<String, String> headerMap = new HashMap<String, String>();;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        XMLUtils.EntryMovie movie = (XMLUtils.EntryMovie) requireActivity().getIntent().getSerializableExtra(DetailsActivity.MOVIE);
        VideoSupportFragmentGlueHost glueHost = new VideoSupportFragmentGlueHost(this);
        MediaPlayerAdapter playerAdapter = new MediaPlayerAdapter(requireActivity());
        playerAdapter.setRepeatAction(PlaybackControlsRow.RepeatAction.INDEX_ONE);
        PlaybackTransportControlGlue<MediaPlayerAdapter> playbackTransportControlGlue = new PlaybackTransportControlGlue<>(requireActivity(), playerAdapter);
        mTransportControlGlue = playbackTransportControlGlue;
        playbackTransportControlGlue.setHost(glueHost);
        mTransportControlGlue.setTitle(movie.getTitle());
        mTransportControlGlue.setControlsOverlayAutoHideEnabled(true);
        mTransportControlGlue.setSeekEnabled(true);
        mTransportControlGlue.playWhenPrepared();
        playerAdapter.setDataSource(Uri.parse(movie.getVideoUrl()));
    }

    @Override
    public void onPause()
    {
        super.onPause();
        if (mTransportControlGlue != null)
        {
            mTransportControlGlue.pause();
        }
    }
}
