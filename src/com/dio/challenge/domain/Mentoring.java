package com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Subject{

    private LocalDate date;


    @Override
    public double calcXp() {
        return XP_default + 5;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return '\n'
                +"Mentoring -"+ '\n'
                +"title: " + getTitle() + '\n'
                +"description: " + getDescription() + '\n'
                +"date: " + date + '\n';
    }
}
