package com.ieti.startapp_android.model;

public class Comment {
    
    private String id;
    private User idUser;
    private Project idProject;
    private String data;
    private int rate;

    public Comment(User idUser, Project idProject, String data, int rate) {
        this.idUser = idUser;
        this.idProject = idProject;
        this.data = data;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Project getIdProject() {
        return idProject;
    }

    public void setIdProject(Project idProject) {
        this.idProject = idProject;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
