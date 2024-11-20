package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class University {
    private String name;
    private List<Major> majors;

    public University(String name) {
        this.name = name;
        this.majors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMajor(Major major) {
        this.majors.add(major);
    }

    public List<Major> getMajors() {
        return majors;
    }
}
