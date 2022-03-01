public class 方法重载练习 {
    public static void main(String[] args) {

        //调用方法
        System.out.println(dda((int)10,(int) 20));
        System.out.println(dda((byte) 10,(byte) 20));
        System.out.println(dda((short) 10,(byte)20));
        //System.out.println(dda((long) 10,(long) 20));
        //也可以写成
        System.out.println(dda(10L,20L));
    }
    //定义方法
    public static boolean dda(int a, int b){
        System.out.println("int");
        return a == b;
    }

    public static boolean dda(byte a, byte b){
        System.out.println("byte");
        return a == b;
    }

    public static boolean dda(short a, short b){
        System.out.println("short");
        return a == b;
    }
    public static boolean dda(long a, long b){
        System.out.println("long");
        return a == b;
    }
}
