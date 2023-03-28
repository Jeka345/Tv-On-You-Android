package com.devcm.droidtv;

import androidx.leanback.widget.AbstractDetailsDescriptionPresenter;

public class DetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter {

    @Override
    public void onBindDescription(AbstractDetailsDescriptionPresenter.ViewHolder viewHolder, Object item)
    {
        XMLUtils.EntryMovie movie = (XMLUtils.EntryMovie) item;
        if (movie != null)
        {
            viewHolder.getTitle().setText(movie.getTitle());
            viewHolder.getSubtitle().setText(movie.getStudio());
            viewHolder.getBody().setText(movie.getDescription());
        }
    }
}