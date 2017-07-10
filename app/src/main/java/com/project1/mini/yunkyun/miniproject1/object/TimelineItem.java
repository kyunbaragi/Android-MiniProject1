package com.project1.mini.yunkyun.miniproject1.object;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class TimelineItem {
    private String title;
    private String content;

    public TimelineItem(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
}
