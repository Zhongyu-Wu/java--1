package animal;

public class Cat {
    //属性：昵称 年龄 体重 品种
    //修改属性的可见性--private 限定只能在当前类内访问
    private String name;
    private int month;
    private double weight;
    private String species;


    public Cat() {

    }


    //创建get set方法
    //在get set方法中添加对属性的限定
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return "我是一只名叫:" + this.name + "的猫咪";
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month) {
        if (month <= 0) {
            System.out.println("wrong");
        } else {
            this.month = month;
        }
    }

    //方法：跑动 吃东西
    public void run() {
        this.eat();
        System.out.println("run");
    }

    public void run(String name) {
        System.out.println(name + "run");
    }

    public void eat() {
        System.out.println("eat");
    }


    /*public Cat(String newName,int newMonth,double newWeight,String newSpecies){
    name = newName;
    month = newMonth;
    weight = newWeight;
    species = newSpecies
    }
}*/
    public Cat(String name, int month, double weight, String species) {
        this();
        this.name = name;//this代表的是当前对象 也就是cattest里的one
        this.month = month;
        this.weight = weight;
        this.species = species;
    }


}