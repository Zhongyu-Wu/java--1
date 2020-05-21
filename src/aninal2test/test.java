package aninal2test;


import animal2.Cat2;
import animal2.Dog;

public class test {
    public static void main(String[] args){
        Cat2 one = new Cat2();
        one.setName("huahau");
        one.setSpecies("yingduan");
        one.eat();
        one.run();
        System.out.println(one.temp);
        System.out.println("--------------------------------");
        Dog two = new Dog();
        two.setName("niuniu");
        two.setMonth(1);
        two.eat();
        two.sleep();
    }
}
