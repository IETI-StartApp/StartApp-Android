package com.ieti.startapp_android.model;

import java.util.List;

public class Project {
    private String id;

    private String name;

    private String image;

    private String video;

    private String country;

    private String description;

    private Finance finance;

    private List<Comment> comments;

    private User user;
    public Project(String name, String image, String video, String country, String description, Finance finance, List<Comment> comments, User user) {
        this.name = name;
        this.image = image;
        this.video = video;
        this.country = country;
        this.description = description;
        this.finance = finance;
        this.comments = comments;
        this.user = user;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
