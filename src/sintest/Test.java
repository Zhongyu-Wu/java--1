package sintest;


import singleton.SingletonOne;

public class Test {
    public static void main(String[] args){
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one == two);
        System.out.println(two);
        System.out.println("---------------------");
        SingletonOne one1 = SingletonOne.getInstance();
        SingletonOne two1 = SingletonOne.getInstance();
        System.out.println(one1);
        System.out.println(two1);
    }
}
