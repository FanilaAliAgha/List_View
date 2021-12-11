package com.example.listview;

public class person {
    int pic;
    String name;
    String message;
    String date;
    String time;

    public person(int pic, String name, String message, String date, String time) {
        this.pic = pic;
        this.name = name;
        this.message = message;
        this.date = date;
        this.time = time;
    }


    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
