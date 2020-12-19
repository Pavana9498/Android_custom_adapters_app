package com.example.project2;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.net.Uri;


public class ImageViewActivity extends Activity implements ComponentCallbacks {

    @Override
    public void onCreate(Bundle SavedInstanceState) {

        super.onCreate(SavedInstanceState);

        Intent myIntent = getIntent();

        ImageView imageView = new ImageView(getApplicationContext());

        final int i = myIntent.getIntExtra(MainActivity.EXTRA_RES_ID,0);
        Log.d("clickable","i: "+i);

        switch (i) {
            case R.drawable.joker_t:
                imageView.setImageResource(R.drawable.joker);
                break;
            case R.drawable.knivesout_t:
                imageView.setImageResource(R.drawable.knivesout);
                break;
            case R.drawable.fordvferrari:
                imageView.setImageResource(R.drawable.ford_v_ferrari_large);
                break;
            case R.drawable.dunkirk:
                imageView.setImageResource(R.drawable.dunkirk_full);
                break;
            case R.drawable.lalaland:
                imageView.setImageResource(R.drawable.lalaland_full);
                break;
            case R.drawable.moonlight:
                imageView.setImageResource(R.drawable.moonlight_full);
                break;
            case R.drawable.invisibleguest:
                imageView.setImageResource(R.drawable.invisbileguestfull);
                break;
            case R.drawable.insideout:
                imageView.setImageResource(R.drawable.inside_out_full);
                break;
            default:
                imageView.setImageResource(R.drawable.her);
                break;
        }

        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        setContentView(imageView);

        View.OnClickListener imageClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent();
                myIntent.setAction(Intent.ACTION_VIEW);

                switch (i) {
                    case R.drawable.joker_t:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt7286456/"));
                        break;

                    case R.drawable.knivesout_t:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt8946378/"));
                        break;

                    case R.drawable.fordvferrari:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt1950186/"));
                        break;

                    case R.drawable.dunkirk:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt5013056/"));
                        break;

                    case R.drawable.lalaland:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt3783958/"));
                        break;

                    case R.drawable.moonlight:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt4975722/"));
                        break;

                    case R.drawable.invisibleguest:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt4857264/"));
                        break;

                    case R.drawable.insideout:
                        myIntent.setData(Uri.parse("https:www.imdb.com/title/tt2096673/"));
                        break;

                    default:
                        myIntent.setData(Uri.parse("https:www.google.com"));
                }
                startActivity(myIntent);

            }
        };

        imageView.setOnClickListener(imageClick);

    }
}
