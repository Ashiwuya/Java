public class 形参实参 {
    public static void main(String[] args) {

        //调用方法abbc
        abbc(10,20);
        //或定义abbc方法中的变量
        int a = 10;
        int b = 20;
        abbc(a,b);
    }

    //定义一个方法
    public static void abbc(int a, int b){
        if ( a > b ){
            System.out.println("Max:" + a);
        } else {
            System.out.println("Max:" + b);
        }
    }
}
