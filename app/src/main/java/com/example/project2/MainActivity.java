package com.example.project2;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends Activity implements ComponentCallbacks {

    protected static final String EXTRA_RES_ID = "POS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView)findViewById(R.id.listView);

        registerForContextMenu(lv);


        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(R.drawable.joker_t, R.drawable.joker, "Joker","2019"));
        movieList.add(new Movie(R.drawable.knivesout_t,R.drawable.knivesout, "Knives Out","2019"));
        movieList.add(new Movie(R.drawable.fordvferrari,R.drawable.ford_v_ferrari_large,
                "Ford v Ferrari","2019"));
        movieList.add(new Movie(R.drawable.dunkirk, R.drawable.dunkirk_full,"Dunkirk", "2017"));
        movieList.add(new Movie(R.drawable.lalaland,R.drawable.lalaland_full, "La La Land", "2016"));
        movieList.add(new Movie(R.drawable.moonlight, R.drawable.moonlight_full,"Moonlight", "2016"));
        movieList.add(new Movie(R.drawable.invisibleguest, R.drawable.invisbileguestfull,"The Invisible Guest",
                "2016"));
        movieList.add(new Movie(R.drawable.insideout,R.drawable.inside_out_full, "Inside Out", "2015"));

        lv.setAdapter(new MovieAdapter(this, movieList));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int id, long position) {

                Intent myIntent  = new Intent(MainActivity.this,
                        ImageViewActivity.class);

                myIntent.putExtra(EXTRA_RES_ID, (int) position);

                startActivity(myIntent);

                onTrimMemory(TRIM_MEMORY_UI_HIDDEN);

            }
        });


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
                                    ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, view, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.moviemenu, menu);

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;

    }

    @Override
    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo info =
                (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();

        Intent myIntent = new Intent();
        myIntent.setAction(Intent.ACTION_VIEW);

        switch (menuItem.getItemId()){
            case R.id.option1:
                Intent infoViewIntent = new Intent(this, InfoViewActivity.class);
                infoViewIntent.putExtra(EXTRA_RES_ID, info.position);
                startActivity(infoViewIntent);
                return true;
            case R.id.option2:
                viewTrailer(myIntent, (int)info.id);
                return true;
            case R.id.option3:
                viewDirector(myIntent, (int)info.id);
                return true;
            case R.id.option4:
                viewMovie(myIntent, (int)info.id);
                return true;
            default:
                return super.onContextItemSelected(menuItem);
        }
    }

    public void viewTrailer(Intent intent, int id) {
        switch (id) {
            case R.drawable.joker:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=zAGVQLHvwOY"));
                break;

            case R.drawable.knivesout:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=qGqiHJTsRkQ"));
                break;

            case R.drawable.fordvferrari:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=I3h9Z89U9ZA"));
                break;

            case R.drawable.dunkirk:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=F-eMt3SrfFU"));
                break;

            case R.drawable.lalaland:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=0pdqf4P9MB8"));
                break;

            case R.drawable.moonlight:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=9NJj12tJzqc"));
                break;

            case R.drawable.invisibleguest:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=epCg2RbyF80"));
                break;

            case R.drawable.insideout:
                intent.setData(Uri.parse("https:www.youtube.com/watch?v=seMwpP0yeu4"));
                break;

            default:
                intent.setData(Uri.parse("https:www.google.com"));
                break;
        }
        startActivity(intent);
    }

    public void viewDirector(Intent intent, int id) {

        switch (id) {
            case R.drawable.joker:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/Todd_Phillips"));
                break;

            case R.drawable.knivesout:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/Rian_Johnson"));
                break;

            case R.drawable.fordvferrari:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/James_Mangold"));
                break;

            case R.drawable.dunkirk:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/Christopher_Nolan"));
                break;

            case R.drawable.lalaland:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/Damien_Chazelle"));
                break;

            case R.drawable.moonlight:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/Barry_Jenkins"));
                break;

            case R.drawable.invisibleguest:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/Oriol_Paulo"));
                break;

            case R.drawable.insideout:
                intent.setData(Uri.parse("https:en.wikipedia.org/wiki/Pete_Docter"));
                break;

            default:
                intent.setData(Uri.parse("https:www.google.com"));
                break;
        }
        startActivity(intent);
    }

    public void viewMovie(Intent intent, int id) {

        switch (id) {
            case R.drawable.joker:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt7286456/"));
                break;

            case R.drawable.knivesout:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt8946378/"));
                break;

            case R.drawable.fordvferrari:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt1950186/"));
                break;

            case R.drawable.dunkirk:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt5013056/"));
                break;

            case R.drawable.lalaland:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt3783958/"));
                break;

            case R.drawable.moonlight:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt4975722/"));
                break;

            case R.drawable.invisibleguest:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt4857264/"));
                break;

            case R.drawable.insideout:
                intent.setData(Uri.parse("https:www.imdb.com/title/tt2096673/"));
                break;

            default:
                intent.setData(Uri.parse("https:www.google.com"));
        }
        startActivity(intent);
    }

}



