package model;

public class Student {

    //成员特征 学号 姓名 性别 年龄
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;
    //无参构造
    public Student(){

    }
    //多参构造 实现对学号 姓名，性别以及年龄的赋值
    public Student(String studentNo, String studentName, String studentSex, int studentAge){
        this.setStudentNo(studentNo);
        this.setStudentAge(studentAge);
        this.setStudentSex(studentSex);
        this.setSudentName(studentName);



    }
    public Student(String studentNo, String studentName, String studentSex, int studentAge,Subject studentSubject){
        this.setStudentNo(studentNo);
        this.setStudentAge(studentAge);
        this.setStudentSex(studentSex);
        this.setSudentName(studentName);
        this.setStudentSubject(studentSubject);



    }
    public String getStudentNo(){
        return studentNo;
    }
    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }
    public String getSudentName(){
        return studentName;
    }
    public void setSudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentSex(){
        return studentSex;
    }
    public void setStudentSex(String studentSex){
        this.studentSex = studentSex;
    }
    public int getStudentAge(){
        return studentAge;
    }
    public void setStudentAge(int studentAge){
        if(studentAge < 10 || studentAge > 100)
            this.studentAge = 18;
        this.studentAge = studentAge;
    }

    /**
     * 获取专业对象，如果没有实例化，先实例化后返回
     * @return 专业对象信息
     */
    public Subject getStudentSubject(){
        if(this.studentSubject== null)
            this.studentSubject = new Subject();
        return studentSubject;
    }
    public void setStudentSubject(Subject studentSubject){
        this.studentSubject = studentSubject;
    }
    //学生自我介绍
    public String introduction(){
        String str = "学生信息如下：\n姓名" + this.getSudentName() + "\n学号："+ this.getStudentNo()+"\n性别" +
                this.getStudentSex() + "\n年龄："+ this.getStudentAge()+"\n所报专业名称："+ "\n所报专业名称："
                +this.getStudentSubject().getSubjectName()+"\n学制年限："+this.getStudentSubject().getSubjectLife();
        return str;
    }
    public String introduction(String subjectName, int subjectLife){
        String str = "学生信息如下：\n姓名" + this.getSudentName() + "\n学号："+ this.getStudentNo()+"\n性别" +
        this.getStudentSex() + "\n年龄："+ this.getStudentAge() + "\n所报专业名称："+subjectName+"\n学制年限："+subjectLife;
        return str;
    }
    public String introduction(Subject mySubject){
        String str = "学生信息如下：\n姓名" + this.getSudentName() + "\n学号："+ this.getStudentNo()+"\n性别" +
                this.getStudentSex() + "\n年龄："+ this.getStudentAge() + "\n所报专业名称："+
                mySubject.getSubjectName()+"\n学制年限："+mySubject.getSubjectLife();
        return str;
    }

}
