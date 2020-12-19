package com.example.project2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

//import android

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter{
    private static final int PADDING = 8;
    private static final int WIDTH = 700;
    private static final int HEIGHT = 700;
    private Context mContext;
    private ArrayList<Movie> mMovies = new ArrayList<>();

    static class ViewHolderItem {
        ImageView movieImage;
        TextView movieName;
        TextView movieYear;
    }

    public MovieAdapter(Context c, ArrayList<Movie> movies){
        mContext = c;
        mMovies = movies;
    }

    @Override
    public int getCount() {
        return mMovies.size();
    }

    // Return the data item at position
    @Override
    public Object getItem(int position) {
        return mMovies.get(position);
    }

    // Will get called to provide the ID that
    // is passed to OnItemClickListener.onItemClick()
    @Override
    public long getItemId(int position) {
        return mMovies.get(position).getMovieId();
    }

    // Return an ImageView for each item referenced by the Adapter

    public String getMovieName(int position) {
        return mMovies.get(position).getMovieName();
    }

    public String getMovieYear(int position) {
        return mMovies.get(position).getMovieYear();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolderItem viewHolder;
        View movieView = convertView;


        // if convertView's not recycled, initialize some attributes
        if (movieView == null) {
            movieView = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent,
                    false);

            viewHolder = new ViewHolderItem();
            viewHolder.movieImage = (ImageView)movieView.findViewById(R.id.poster);
            viewHolder.movieName = (TextView)movieView.findViewById(R.id.name);
            viewHolder.movieYear = (TextView)movieView.findViewById(R.id.year);

            movieView.setTag(viewHolder);
        }

        else {
            viewHolder = (ViewHolderItem)movieView.getTag();
        }
//        ImageView movieImage = (ImageView) movieView.findViewById(R.id.poster);
//        TextView movieName = (TextView) movieView.findViewById(R.id.name);
//        TextView movieYear = (TextView) movieView.findViewById(R.id.year);
       viewHolder.movieImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
        viewHolder.movieImage.setImageResource(mMovies.get(position).getMovieId());
        viewHolder.movieName.setText(getMovieName(position));
       viewHolder.movieYear.setText(getMovieYear(position));
//        viewHolder.checkBox.setChecked(checks.get());

        return movieView;
    }

}
