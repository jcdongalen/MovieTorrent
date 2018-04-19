package com.firex.media.movietorrent.Activities;

import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firex.media.movietorrent.Adapters.SlideAdapter;
import com.firex.media.movietorrent.Models.Movies;
import com.firex.media.movietorrent.R;
import com.firex.media.movietorrent.Utilities.BitmapHelper;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private Movies movies;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        if (getIntent().getExtras().getString("movies") != null) {
            movies = new Gson().fromJson(getIntent().getExtras().getString("movies"), Movies.class);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Bitmap[] slide_images = new Bitmap[0];
                String[] slide_titles = new String[0];
                for (int i = 0; i < movies.getData().getMovies().size(); i++) {
                    slide_images = new Bitmap[slide_images.length + 1];
                    slide_titles = new String[slide_titles.length + 1];
                    slide_images[i] = BitmapHelper.getBitmapFromHttpsURL(movies.getData().getMovies().get(i).getMedium_cover_image());
                    slide_titles[i] = movies.getData().getMovies().get(i).getTitle_english();
                }

                SlideAdapter slideAdapter = new SlideAdapter(MainActivity.this, slide_images, slide_titles);
                viewPager.setAdapter(slideAdapter);
            }
        }, 100);
    }
}
