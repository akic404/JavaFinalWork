package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<ZhiYuan> zhiYuans;

    public Student(String name) {
        this.name = name;
        this.zhiYuans = new ArrayList<>();
    }

    public void addApplication(ZhiYuan zhiYuan) {
        this.zhiYuans.add(zhiYuan);
    }

    public void printApplications() {
        System.out.println("志愿清单:");
        for (ZhiYuan zhiYuan : zhiYuans) {
            System.out.println(zhiYuan.getUniversity().getName() + " 大学：(" + zhiYuan.getZhuanYes() + ")");
        }
    }
}
