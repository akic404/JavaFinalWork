package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 创建一个学生
        System.out.print("输入学生名称: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        // 添加最多30个大学
        for (int i = 0; i < 30; i++) {
            System.out.print("输入大学名称(exit退出): ");
            String universityName = scanner.nextLine();
            if (universityName.equalsIgnoreCase("exit")) {
                break;
            }
            University university = new University(universityName);

            // 添加最多6个专业到大学
            for (int j = 0; j < 6; j++) {
                System.out.print("输入" + universityName + "大学志愿 (exit退出): ");
                String majorName = scanner.nextLine();
                if (majorName.equalsIgnoreCase("exit")) {
                    break;
                }
                Major major = new Major(majorName);
                university.addMajor(major);
            }

            // 创建一个志愿并添加到学生
            Application application = new Application(university);
            for(Major major : university.getMajors()) {
                application.addMajor(major);
            }
            student.addApplication(application);
        }

        // 打印学生的志愿填报表
        student.printApplications();

        scanner.close();
    }
}
