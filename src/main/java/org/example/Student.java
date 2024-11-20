package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Application> applications;

    public Student(String name) {
        this.name = name;
        this.applications = new ArrayList<>();
    }

    public void addApplication(Application application) {
        this.applications.add(application);
    }

    public void printApplications() {
        System.out.println("志愿清单:");
        for (Application application : applications) {
            System.out.println(application.getUniversity().getName() + " 大学：(" + application.getMajors() + ")");
        }
    }
}
