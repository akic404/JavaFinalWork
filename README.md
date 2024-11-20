# JavaFinalWork
JAVA结课作业
## 选题：题目一：高考志愿报名模拟系统
需求：模拟高考前志愿填报的流程，每个学生最多可以填报30个志愿，每个志愿为一个院校专业组，每个组内有某个高校的不超过6个专业。比如，北京市有92所高校，每个高校有若干专业。

要求：分析系统的角色，设计相应的类，模拟程序，系统支持定义学生，支持定义志愿，支持学生填报志愿以及调整志愿的顺序。支持打印某学生的志愿填报表

## 总体设计
将大学和专业存储在列表中，然后打印

## 详细设计
分为main Student University ZhiYuan Zhuanye五个类
Student Univer ZhiYuan Zhuanye分别用于存储信息

main则建立以上类的实体，并通过scanner添加到对应列表中
student内部还有一个方法负责打印学生信息

使用lombok的注解功能返回setter和getter

## 结论
可以实现角色定义 志愿定义 填报志愿 打印志愿

未实现直接调整志愿顺序

## 心得
尝试实践了多个类嵌套的项目，在过程中学会添加依赖，使用注解等
