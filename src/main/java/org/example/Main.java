package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入学生名称: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        //30个大学
        for (int i = 0; i < 30; i++) {
            System.out.print("输入大学名称(exit退出): ");
            String universityName = scanner.nextLine();//这里每次都要新建一个不然只记得一个学校
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
                ZhuanYe zhuanYe = new ZhuanYe(majorName);
                university.addZhuanye(zhuanYe);
            }

            // 创建一个志愿并添加到学生
            ZhiYuan zhiYuan = new ZhiYuan(university);
            for(ZhuanYe zhuanYe : university.getZhuanYes()) {
                zhiYuan.addMajor(zhuanYe);
            }
            student.addApplication(zhiYuan);
        }

        // 打印学生的志愿填报表
        student.printApplications();

        scanner.close();
    }
}
