package com.ieti.startapp_android.model;

import com.ieti.startapp_android.model.enums.UserRole;

import java.util.List;

public class User {

    private static final long serialVersionUID = 1L;
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private long identification;
    private UserRole role;
    private String description;
    private List<Project> projects;
    private String image;

    public User(String firstName, String lastName, String email, long identification, UserRole role, String description,
                List<Project> projects, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
        this.role = role;
        this.description = description;
        this.projects = projects;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getIdentification() {
        return identification;
    }

    public void setIdentification(long identification) {
        this.identification = identification;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}