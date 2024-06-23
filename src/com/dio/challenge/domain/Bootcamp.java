package com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate initDate = LocalDate.now();
    private final LocalDate finalDate = initDate.plusDays(45);
    private Set<Dev> developersSubscribed = new HashSet<>();
    private Set<Subject> sbj = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getDevelopersSubscribed() {
        return developersSubscribed;
    }

    public void setDevelopersSubscribed(Set<Dev> developersSubscribed) {
        this.developersSubscribed = developersSubscribed;
    }

    public Set<Subject> getSbj() {
        return sbj;
    }

    public void setSbj(Set<Subject> sbj) {
        this.sbj = sbj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getName(), bootcamp.getName()) && Objects.equals(getDescription(), bootcamp.getDescription()) && Objects.equals(getInitDate(), bootcamp.getInitDate()) && Objects.equals(getFinalDate(), bootcamp.getFinalDate()) && Objects.equals(getDevelopersSubscribed(), bootcamp.getDevelopersSubscribed()) && Objects.equals(getSbj(), bootcamp.getSbj());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getInitDate(), getFinalDate(), getDevelopersSubscribed(), getSbj());
    }
}
