public class 字符加的操作 {
    public static void main(String[] args){
        //定义两个变量
        int i = 10;
        char c = 'A';//字符'A'的值是65
        c = 'a';//字符'a'的值是 97
        c = '0';//字符'0'的值是48
        System.out.println(i + c);
        //char ch = i + c;
        //char类型还会被自动提升为int类型
        int j = i + c;
        System.out.println(j);

        //int k =10 + 13.14;
        //int类型应该换成double类型，因为13.14为double类型。
        double k =10 + 13.14;
        System.out.println(k);
    }
}
