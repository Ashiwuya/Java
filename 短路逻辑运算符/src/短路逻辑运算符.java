public class 短路逻辑运算符 {
    public static void main(String[] args){
        int i = 10;
        int j = 20;
        int k = 30;

        // && 短路与 有false则false
        System.out.println(i < j && j < k);// true && true
        System.out.println(i > j && j < k);//false && true
        System.out.println(i < j &&j > k);//true && false
        System.out.println(i > j && j > k);//false && false
        System.out.println("-----------");

        // || 短路或 有true则true
        System.out.println(i < j || j < k);// true || true
        System.out.println(i > j || j < k);//false || true
        System.out.println(i < j || j > k);//true || false
        System.out.println(i > j || j > k);//false || false
        System.out.println("-----------");

        // &&和 &  下面输出结果为
        // false
        // i：11
        // j：20
        //因为（i++ > 100）结果为false 后面的语句不进行运算！！
        // || 和 | 的作用相反 若左边结果为true 右边不进行运算！！
        //System.out.println((i++ > 100) & (j++ > 100));//false & false
        System.out.println((i++ > 100) && (j++ > 100));//false && false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
