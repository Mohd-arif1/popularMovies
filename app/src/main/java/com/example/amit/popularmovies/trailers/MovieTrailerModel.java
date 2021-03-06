package com.example.amit.popularmovies.trailers;

import android.os.Parcel;
import android.os.Parcelable;


public class MovieTrailerModel implements Parcelable {
    public String mKey;
    public String mName;
    public String mSite;

    public MovieTrailerModel(String key, String name, String site){
        this.mKey = key;
        this.mName = name;
        this.mSite = site;
    }

    MovieTrailerModel(Parcel parcel){
        this.mKey = parcel.readString();
        this.mName = parcel.readString();
        this.mSite = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(mKey);
        dest.writeString(mName);
        dest.writeString(mSite);
    }

    public static final Creator<MovieTrailerModel> CREATOR = new Creator<MovieTrailerModel>() {

        @Override
        public MovieTrailerModel createFromParcel(Parcel parcel) {
            return new MovieTrailerModel(parcel);
        }

        @Override
        public MovieTrailerModel[] newArray(int size) {
            return new MovieTrailerModel[size];
        }
    };
}
