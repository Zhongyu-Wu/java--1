package test;


import model.Student;
import model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        Subject sub1 = new Subject("计算机科学与应用","j0001",4);
        System.out.println(sub1.info());
        System.out.println("-----------------------");
        //测试Student
        Student stu1 = new Student("s01","lucy","男",18,sub1);
        System.out.println(stu1.introduction());
        System.out.println("-----------------------");
        Student stu2 = new Student("s02","lili","nv",17);
        System.out.println(stu2.introduction("计算机科学与应用",4));
        System.out.println("-----------------------");
        Student stu3 = new Student("s03", "yuyu","男",18);
        System.out.println(stu3.introduction(sub1));
        System.out.println("-----------------------");
        //测试指定专业中到底有多少学生报名
        sub1.addStudent(stu1);
        sub1.addStudent(stu2);
        sub1.addStudent(stu3);
        System.out.println(sub1.getStudentNum() + "的专业中已有" + sub1.getStudentNum() + "学生进行了报名");

    }
}
