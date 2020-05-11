package method;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        //创建一个MethodDemo类的对象myMethodDemo
        MethodDemo myMethodDemo = new MethodDemo();
        //使用对象名.方法名()去调用方法
        myMethodDemo.printStar();
        System.out.println("java");
        myMethodDemo.printStar();
    }

    public void printStar() {
        System.out.println("*********");

    }
}


