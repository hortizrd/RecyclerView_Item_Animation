package com.example.RecyclerView_Item_AnimationRD;

public class NewsItem {
    String Title,Content,Date;
    int usePhoto;

    public NewsItem(){

    }

    public NewsItem(String title, String content, String date, int usePhoto) {
        Title = title;
        Content = content;
        Date = date;
        this.usePhoto = usePhoto;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setUsePhoto(int usePhoto) {
        this.usePhoto = usePhoto;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public String getDate() {
        return Date;
    }

    public int getUsePhoto() {
        return usePhoto;
    }
}
