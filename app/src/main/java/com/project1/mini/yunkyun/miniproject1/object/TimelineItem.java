package com.project1.mini.yunkyun.miniproject1.object;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class TimelineItem {
    private String title;
    private String content;

    public TimelineItem(){
        this.title = "타임라인 아이템 타이틀";
        this.content = "타임라인 아이템 내용";
    }

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
