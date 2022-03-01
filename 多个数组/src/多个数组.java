public class 多个数组 {
    public static void main(String[] args) {
        int[] arr = new int [2];
        int[] arr2 = new int[3];
        //先输出一次
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
        //给索引赋值
        arr[0] = 100;
        arr[1] = 110;
        arr2[0] = 300;
        arr2[2] = 350;
        //再次输出
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
    }
}
