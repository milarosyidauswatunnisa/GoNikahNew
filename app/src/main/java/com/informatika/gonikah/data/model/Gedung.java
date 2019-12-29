package com.informatika.gonikah.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Gedung implements Parcelable {
    private String name;
    private String location;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.location);
        dest.writeInt(this.image);
    }

    public Gedung() {
    }

    protected Gedung(Parcel in) {
        this.name = in.readString();
        this.location = in.readString();
        this.image = in.readInt();
    }

    public static final Parcelable.Creator<Gedung> CREATOR = new Parcelable.Creator<Gedung>() {
        @Override
        public Gedung createFromParcel(Parcel source) {
            return new Gedung(source);
        }

        @Override
        public Gedung[] newArray(int size) {
            return new Gedung[size];
        }
    };
}
