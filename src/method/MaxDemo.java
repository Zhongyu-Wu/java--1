package method;

public class MaxDemo {
    public void max(int a, int b){
        int max;
        if(a > b){
            max = a;
        }
        else{
            max = b;
        }
        System.out.println(("两个数" + a +"and" + b + "的最大值为:" + max));
    }
    public static void main(String[] args){
        MaxDemo maxDemo = new MaxDemo();
        int a = 5, b = 3;
        maxDemo.max(a,b);


    }
}
