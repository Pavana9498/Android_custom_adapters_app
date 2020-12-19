package com.example.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Info> arr = new ArrayList<>();

    public InfoAdapter(Context c, ArrayList<Info> infos) {
        mContext = c;
        arr = infos;
    }

    @Override
    public int getCount() {
        return arr.size();
    }
    @Override
    public Object getItem(int position) {
        return arr.get(position);
    }
    @Override
    public long getItemId(int position) {
        return arr.get(position).getmId();
    }
    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        position = 0;
        View infoView = convertView;
        if(infoView == null) {
            infoView = LayoutInflater.from(mContext).inflate(R.layout.info_item, parent, false);
        }

        String i = arr.get(position).getmReleaseDate();

        TextView textView = (TextView)infoView.findViewById(R.id.viewRelDate);
        textView.setText(arr.get(position).getmReleaseDate());
        TextView textView1 = (TextView)infoView.findViewById(R.id.viewDuration);
        textView1.setText(arr.get(position).getmDuration());
        TextView textView2 = (TextView)infoView.findViewById(R.id.viewDirector);
        textView2.setText(arr.get(position).getmDirector());
        TextView textView3 = (TextView)infoView.findViewById(R.id.viewStar1);
        textView3.setText(arr.get(position).getmStar1());
        TextView textView4 = (TextView)infoView.findViewById(R.id.viewStar2);
        textView4.setText(arr.get(position).getmStar2());
        TextView textView5 = (TextView)infoView.findViewById(R.id.viewStar3);
        textView5.setText(arr.get(position).getmStar3());
        TextView textView6 = (TextView)infoView.findViewById(R.id.viewRating1);
        textView6.setText(arr.get(position).getmRating1());
        TextView textView7 = (TextView)infoView.findViewById(R.id.viewRating2);
        textView7.setText(arr.get(position).getmRating2());
        TextView textView8 = (TextView)infoView.findViewById(R.id.viewName);
        textView8.setText(arr.get(position).getmName());

        return infoView;
    }

}
