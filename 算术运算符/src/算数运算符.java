public class 算数运算符 {
    public static void main(String[] args){
        //定义两个变量
        int a = 5;
        int b = 3;

        System.out.println(a + b);//加法
        System.out.println(a - b);//减法
        System.out.println(a * b);//乘法
        System.out.println(a / b);//除法
        System.out.println(a % b);//取余
        //除法得到的是商，取余得到的是余数

        //整数相除只能得到整数，要想得到浮点数，必须有浮点数的参与。
        System.out.println(6.0 / 4);
    }
}
