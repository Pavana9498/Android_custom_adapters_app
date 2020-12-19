package com.example.project2;

public class Info {

    private int mId;
    private String mName;
    private String mReleaseDate;
    private String mDuration;
    private String mDirector;
    private String mStar1;
    private String mStar2;
    private String mStar3;
    private String mRating1;
    private String mRating2;

    Info(int d, String name, String releaseDate, String duration, String director, String star1, String star2,
         String star3, String rating1, String rating2) {
        mId = d;
        mName = name;
        mReleaseDate = releaseDate;
        mDuration = duration;
        mDirector = director;
        mStar1 = star1;
        mStar2 = star2;
        mStar3 = star3;
        mRating1 = rating1;
        mRating2 = rating2;
    }

    public int getmId() {
        return mId;
    }

    public String getmReleaseDate() {
        return mReleaseDate;
    }

    public String getmDuration() {
        return mDuration;
    }

    public String getmDirector() {
        return mDirector;
    }

    public String getmStar1() {
        return mStar1;
    }

    public String getmStar2() {
        return mStar2;
    }

    public String getmStar3() {
        return mStar3;
    }

    public String getmRating1() {
        return mRating1;
    }

    public String getmRating2() {
        return mRating2;
    }

    public String getmName() {
        return mName;
    }
}
