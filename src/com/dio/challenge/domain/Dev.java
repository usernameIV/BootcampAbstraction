package com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Subject> subjectsSubscribe = new LinkedHashSet<>();
    private Set<Subject> doneSubjects = new LinkedHashSet<>();

    public void subscribeInBootcamp(Bootcamp btc) {
        this.subjectsSubscribe.addAll(btc.getSbj());
        btc.getDevelopersSubscribed().add(this);
    }
    public void advance() {
        Optional<Subject> sbj = this.subjectsSubscribe.stream()
                .findFirst();
        if (sbj.isPresent()) {
            this.doneSubjects.add(sbj.get());
            this.subjectsSubscribe.remove(sbj.get());
        }
        else {
        System.err.println("You're not registered in any bootcamp ");
        }
    }
    public double calculateAllXp() {
        return this.doneSubjects.stream()
                .mapToDouble(Subject::calcXp)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubjectsSubscribe() {
        return subjectsSubscribe;
    }

    public void setSubjectsSubscribe(Set<Subject> subjectsSubscribe) {
        this.subjectsSubscribe = subjectsSubscribe;
    }

    public Set<Subject> getDoneSubjects() {
        return doneSubjects;
    }

    public void setDoneSubjects(Set<Subject> doneSubjects) {
        this.doneSubjects = doneSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getSubjectsSubscribe(), dev.getSubjectsSubscribe()) && Objects.equals(getDoneSubjects(), dev.getDoneSubjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubjectsSubscribe(), getDoneSubjects());
    }
}
