package com.example.myproject.Domain;

public class ChatDomain {

    private String title;
    private String lastMsg;
    private String img;
    private String date;
    int num;

    public ChatDomain(String title, String lastMsg, String img, String date, int num) {
        this.title = title;
        this.lastMsg = lastMsg;
        this.img = img;
        this.date = date;
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
