public class 方法参数传递 {
    public static void main(String[] args) {
        int nmb = 100;
        //输出调用方法前
        System.out.println("调用前:" + nmb);
        //调用方法后
        change(nmb);
        System.out.println("调用后:" + nmb);
    }
    //定义方法
    public static void change(int nmb){
        nmb = 200;
    }
}
