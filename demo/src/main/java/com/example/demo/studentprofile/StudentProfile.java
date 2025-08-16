package com.example.demo.studentprofile;

public class StudentProfile {
    private String name;
    private String branch;
    private long StudentId;
    private String Section;
    private String startingYear;
    private String collegeName;
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getStudentId() {
        return StudentId;
    }

    public void setStudentId(long studentId) {
        StudentId = studentId;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(String startingYear) {
        this.startingYear = startingYear;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", StudentId=" + StudentId +
                ", Section='" + Section + '\'' +
                ", startingYear='" + startingYear + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}


