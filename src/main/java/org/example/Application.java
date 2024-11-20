package org.example;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Application {
    private University university;
    private List<Major> majors;

    public Application(University university) {
        this.university = university;
        this.majors = new ArrayList<>();
    }

    public University getUniversity() {
        return university;
    }

    public void addMajor(Major major) {
        this.majors.add(major);
    }

    public List<Major> getMajors() {
        return majors;
    }
}
