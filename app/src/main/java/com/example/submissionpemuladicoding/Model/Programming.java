package com.example.submissionpemuladicoding.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Programming implements Parcelable {

    private String name;
    private String detail;
    private int photo;

    protected Programming(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Programming> CREATOR = new Creator<Programming>() {
        @Override
        public Programming createFromParcel(Parcel in) {
            return new Programming(in);
        }

        @Override
        public Programming[] newArray(int size) {
            return new Programming[size];
        }
    };

    Programming() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
