package com.ieti.startapp_android;

public class cardProjectElement {
    private String userOwnProject;
    private String dateProject;
    private String projectName;
    private String goalProject;
    private String financeProject;
    private String progressProject;
    private String investorProject;

    public cardProjectElement(String userOwnProject, String dateProject, String projectName, String goalProject, String financeProject, String progressProject, String investorProject) {
        this.userOwnProject = userOwnProject;
        this.dateProject = dateProject;
        this.projectName = projectName;
        this.goalProject = goalProject;
        this.financeProject = financeProject;
        this.progressProject = progressProject;
        this.investorProject = investorProject;
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
}
