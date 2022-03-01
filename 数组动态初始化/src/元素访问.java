public class 元素访问 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);//[I@4617c264
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // 给元素赋值
        arr[0] = 100;
        arr[2] = 200;
        //再次输出
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
