package Arrary;

public class Solution1{

    public static void main(String[] args){
    //二维数组声明
    //三种形式
        // 声明int类型二维数组
    int[][] intArray;
        // 声明float类型二维数组
    float floatArray[][];
        // 声明double类型二维数组
    double[] doubleArrary[];
    //创建一个三行三列的int类型数组
    intArray = new int[3][3];
    System.out.println("intArray数组的第三行第二列的元素为:" +intArray[2][1]);
    intArray[1][2] = 9;
    System.out.println("intArray数组的第二行第三列的元素为:" + intArray[1][2]);
    //声明数组的同时进行创建
        char[][] ch = new char[3][5];
        //创建float类型的数组时，只指定行数
        floatArray = new float[3][];
        //System.out.println(floatArray[0][0]);
        //每行相当于一个数组
        floatArray[0] = new float[3];//第一行有三列
        floatArray[1] = new float[4];//第二行有四列
        floatArray[2] = new float[5];
        System.out.println(floatArray[0][0]);
        //二维数组的初始化
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("num数组第一行第二列的元素为:" +num[0][1]);
        System.out.println("num数组的行数为:" +num.length);
        System.out.println("num数组的列数为:" +num[0].length);
        //循环输出二维数组内容
        int[][] num1 = {{78,98},{65,75,63},{98}};
        for(int i = 0; i < num1.length; i++){
            for(int j = 0;j <num1[i].length; j++){
                System.out.println((num1[i][j] + " "));
            }
            System.out.println();
        }
    }
}