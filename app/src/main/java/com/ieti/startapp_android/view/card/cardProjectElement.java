package com.ieti.startapp_android.view.card;

public class cardProjectElement {
    private String userOwnProject;
    private String dateProject;
    private String projectName;
    private String goalProject;
    private String financeProject;
    private String progressProject;
    private String investorProject;
    private String projectImage;
    private String userImage, id;

    public cardProjectElement(String id, String userOwnProject, String dateProject, String projectName, String goalProject, String financeProject, String progressProject, String investorProject, String projectImage, String userImage) {
        this.userOwnProject = userOwnProject;
        this.dateProject = dateProject;
        this.projectName = projectName;
        this.goalProject = goalProject;
        this.financeProject = financeProject;
        this.progressProject = progressProject;
        this.investorProject = investorProject;
        this.projectImage = projectImage;
        this.userImage = userImage;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserOwnProject() {
        return userOwnProject;
    }

    public void setUserOwnProject(String userOwnProject) {
        this.userOwnProject = userOwnProject;
    }

    public String getDateProject() {
        return dateProject;
    }

    public void setDateProject(String dateProject) {
        this.dateProject = dateProject;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getGoalProject() {
        return goalProject;
    }

    public void setGoalProject(String goalProject) {
        this.goalProject = goalProject;
    }

    public String getFinanceProject() {
        return financeProject;
    }

    public void setFinanceProject(String financeProject) {
        this.financeProject = financeProject;
    }

    public String getProgressProject() {
        return progressProject;
    }

    public void setProgressProject(String progressProject) {
        this.progressProject = progressProject;
    }

    public String getInvestorProject() {
        return investorProject;
    }

    public void setInvestorProject(String investorProject) {
        this.investorProject = investorProject;
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }
}
