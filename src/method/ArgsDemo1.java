package method;
//可变参数列表可以和数组兼容，数组作为参数时，是不能将多个值传递给数组的；一个方法中只能有一个可变参数
public class ArgsDemo1 {
    public void search(int n, int...a){
        boolean flag = false;
        for(int a1 : a){
            if(a1 == n){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("find" + n);
        }else{
            System.out.println("not find" + n);
        }
    }
    public static void main(String[] args){
        ArgsDemo1 ad1 = new ArgsDemo1();
        ad1.search(3,1,2,3,4,5);
        int[]a ={1,2,3,4,5};
        ad1.search(3,a);
    }
}
