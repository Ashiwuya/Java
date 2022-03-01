public class 带返回值方法 {
    public static void main(String[] args) {
        int result = getMax(10,20);
        System.out.println(result);
    }
        //声明一个方法 求两个数的较大值
        public static int getMax(int a,int b ){
            if (a > b){
                return a;
            }else {
                return b;
        }
    }
}