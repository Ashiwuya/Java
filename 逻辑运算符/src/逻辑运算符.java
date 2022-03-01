public class 逻辑运算符 {
    public static void main(String[] args){
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;
        //System.out.println(i < j < k); 不可以直接输出
        // & 逻辑与  结果中包含false 输出结果就会是false
        System.out.println(i < j & j < k);// true & true
        System.out.println(i > j & j < k);//false & true
        System.out.println(i < j & j > k);//true & false
        System.out.println(i > j & j > k);//false & false
        System.out.println("-----------");

        // | 逻辑或  结果中包含true 输出结果就会是true
        System.out.println(i < j | j < k);// true | true
        System.out.println(i > j | j < k);//false | true
        System.out.println(i < j | j > k);//true |false
        System.out.println(i > j | j > k);//false | false
        System.out.println("-----------");

        // ^ 逻辑异或 结果相同输出结果为false 结果不同 输出结果就为 true
        System.out.println(i < j ^ j < k);// true ^ true
        System.out.println(i > j ^ j < k);//false ^ true
        System.out.println(i < j ^ j > k);//true ^ false
        System.out.println(i > j ^ j > k);//false ^ false
        System.out.println("-----------");
        // ！ 输出结果相反
        System.out.println(!(i < j));//true
        System.out.println(!(i > j));//false
        System.out.println("-----------");
    }
}
