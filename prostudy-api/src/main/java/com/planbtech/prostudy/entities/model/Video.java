package com.planbtech.prostudy.entities.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "videos")
public class Video  {

    @Id
    @Column(name = "videoid")
    private String videoId;

    @Column(name = "videotitle")
    private String videoTitle;

    public String getVideoId() {
        return this.videoId;
    }


    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return this.videoTitle;
    }

    public void setVideoTitle(String title) {
        this.videoTitle = title;
    }


}
