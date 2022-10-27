package com.example.myproject.Domain;

public class ReviewDomain {
    private String title;
    private String pic;
    private String contents;
    private String date;
    private int rating;


    public ReviewDomain(String title, String pic, String contents, String date, int rating) {
        this.title = title;
        this.pic = pic;
        this.contents = contents;
        this.date = date;
        this.rating = rating;
    }


    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}

