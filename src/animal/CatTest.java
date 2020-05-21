package animal;

public class CatTest {
    public static void main(String [] args){
        //对象实例化
        Cat one = new Cat();
        one.setName ("a") ;
        one.setMonth(3);
        //test
        one.eat();
        one.run();

        System.out.println(one.getName());
        System.out.println(one.getMonth());
    }
}
