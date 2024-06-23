package com.dio.challenge.domain;

public class Course extends Subject{

    private int workload;

    @Override
    public double calcXp() {
        return XP_default * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return '\n'
                +"Course -"+ '\n'
                + "title: " + getTitle() + '\n'
                + "description: " + getDescription() + '\n'
                + "workload: " + workload + "h " +'\n';
    }
}
