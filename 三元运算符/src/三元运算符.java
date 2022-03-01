/*
    三元运算符
    格式： 关系表达式 ？ 表达式1 ： 表达式2 ；
    流程如下 ：
    先计算表达式的值
    值为true 表达式1的值就是输出结果
    值为false 表达式2的值就是输出结果
*/
public class 三元运算符 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //获取两个数据中的较大值
        int max = a > b ? a : b;
        //输出结果
        System.out.println("max :" + max);
    }
}
