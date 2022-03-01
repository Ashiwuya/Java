public class 关系运算符 {
    public static void main(String[] args){
        //定义变量
        int i = 10;
        int l = 20;
        int j = 10;
        // ==
        System.out.println(i == l);
        System.out.println(i == j);
        System.out.println("---------");
        // !=
        System.out.println(i != l);
        System.out.println(i != j);
        System.out.println("---------");
        // >
        System.out.println(i > l);
        System.out.println(i > j);
        System.out.println("---------");
        // >=
        System.out.println(i >= l);
        System.out.println(i >= j);
        System.out.println("---------");
        //不小心把==写成了=，
        //把l的值赋值给了i，输出了i的值。
        System.out.println(i = l);
        System.out.println("---------");
        // <
        System.out.println(i < l);
        System.out.println(i < j);
        System.out.println("---------");
        // <=
        System.out.println(i <= l);
        System.out.println(i <= j);

    }
}
