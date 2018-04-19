package com.firex.media.movietorrent.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.firex.media.movietorrent.R;

import java.util.List;

public class SlideAdapter extends PagerAdapter {

    private Context mContext;
    private LayoutInflater mInflater;

    public Bitmap[] slide_images;
    public String[] slide_titles;

    public SlideAdapter(Context context, Bitmap[] slide_images, String[] slide_titles) {
        this.mContext = context;
        this.slide_images = slide_images;
        this.slide_titles = slide_titles;
    }

    @Override
    public int getCount() {
        return slide_titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = mInflater.inflate(R.layout.viewpager_item, container, false);
        ImageView imgBackground = view.findViewById(R.id.imgBackground);
        ImageView imgCover = view.findViewById(R.id.imgCover);
        TextView tvTitle = view.findViewById(R.id.tvTitle);

        imgBackground.setImageBitmap(slide_images[position]);
        imgCover.setImageBitmap(slide_images[position]);
        tvTitle.setText(slide_titles[position]);
        return view;
    }
}
