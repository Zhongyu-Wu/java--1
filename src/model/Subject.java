package model;

public class Subject {
    //成员属性 学科名称 学科编号 学制年限 报名选修的学生信息
    private String subjectName;
    private String subjectNO;
    private int subjectLife;
    private Student[] myStudents;
    private int studentNum;

    public Subject(){

    }
    //带参构造
    public Subject(String subjectName, String subjectNO, int subjectLife){
        //this.subjectName = subjectName;
        this.setSubjectName(subjectName);
        this.setsubjectNO(subjectNO);
        this.setsubjectLife(subjectLife);
    }
    //带参构造，实现对属性的全部赋值
    public Subject(String subjectName, String subjectNO, int subjectLife,Student[] myStudents){
        //this.subjectName = subjectName;
        this.setSubjectName(subjectName);
        this.setsubjectNO(subjectNO);
        this.setsubjectLife(subjectLife);
        this.setMyStudents(myStudents);
    }



    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    public String getSubjectName(){
        return this.subjectName;
    }
    public void setsubjectNO(String subjectNO){
        this.subjectNO = subjectNO;
    }
    public String getSubjectNO(){
        return this.subjectNO;
    }
    //设置学制年限
    public void setsubjectLife(int subjectLife){
        if(subjectLife <= 0)
            return;
        this.subjectLife = subjectLife;
    }
    public int getSubjectLife(){
        return subjectLife;
    }
    public int getStudentNum(){
        return studentNum;
    }
    public void setStudentNum(int studentNum){
        this.studentNum = studentNum;
    }

    /**
     * 获取选修专业的学生信息 如果保存学生信息的数组未被初始化 则 先初始化长度200
     * @return 保存学生信息的数组
     */
    public Student[] getMyStudents(){
        if(this.myStudents == null)
            this.myStudents = new Student[200];
        return myStudents;
    }
    public void setMyStudents(Student[] myStudents){
        this.myStudents = myStudents;
    }

    /**
     * 专业介绍的方法
     * @return 专业介绍的相关信息，包括名称，编号和年限。
     */
    public String info(){
        String str = "专业信息如下： \n" + this.getSubjectName() + "\n专业编号 :" +
                this.getSubjectNO() + "\n学制年限:" + this.getSubjectLife() + "年";
        return str;
    }
    public void addStudent(Student stu){
        /**
         * 1.将学生保存到数组中
         * 2.将学生个数保存到studentnum
         */
        int i;
        for( i = 0; i< this.getMyStudents().length; i++){
            if(this.getMyStudents()[i] == null){
                this.getMyStudents()[i] = stu;
                break;
            }
        }
        //将学生个数保存到studentnum
        this.studentNum = i + 1;
        return;
    }
}
