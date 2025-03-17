package com.example.Course.Registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private String courseid;
    private String coursename;
    private String trainer;
    private int durationinweeks;

    public int getDurationinweeks() {
        return durationinweeks;
    }

    public void setDurationinweeks(int durationinweeks) {
        this.durationinweeks = durationinweeks;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }
}
