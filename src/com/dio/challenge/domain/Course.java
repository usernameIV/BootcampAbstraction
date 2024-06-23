package com.dio.challenge.domain;

import java.io.Serializable;

public class Course {

    private String title;
    private String description;
    private int workload;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course -"+ '\n'
                + "title: " + title + '\n'
                + "description: " + description + '\n'
                + "workload: " + workload + '\n';
    }
}
