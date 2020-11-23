package com.example.android.RomeGuide;


public class TourItem {

    private String title;
    private String location;
    private int imageResourceId;

    TourItem(String title, String location, int imageResourceId) {
        this.title = title;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    TourItem(String title, String location) {
        this.title = title;
        this.location = location;
    }

    String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    int getImage() {
        return imageResourceId;
    }

    public void setImage(int image) {
        this.imageResourceId = image;
    }

    String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
