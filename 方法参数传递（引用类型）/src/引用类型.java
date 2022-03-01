public class 引用类型 {
    public static void main(String[] args) {
        //定义数组变量
        int[] arr = {10,20,30};
        //调用方法dda
        System.out.println("调用前" + arr[1]);
        //再次调用为调用后
        dda(arr);
        System.out.println("调用后" + arr[1]);

    }
    //定义方法
    public static void dda(int [] arr){
        arr[1] = 100;
    }
}
