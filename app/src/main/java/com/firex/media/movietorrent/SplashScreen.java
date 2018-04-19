package com.firex.media.movietorrent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.firex.media.movietorrent.Activities.MainActivity;
import com.firex.media.movietorrent.Models.Movies;
import com.firex.media.movietorrent.Utilities.MyVolleySingleton;
import com.google.gson.Gson;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        String url = "https://yts.am/api/v2/list_movies.json?limit=5";
        StringRequest req = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response!=null){
                            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                            intent.putExtra("movies", response);
                            startActivity(intent);
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(SplashScreen.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
        MyVolleySingleton.getInstance(this).addToRequestQueue(req);
    }
}
