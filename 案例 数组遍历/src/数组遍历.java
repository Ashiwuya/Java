public class 数组遍历 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        //for (int x =0 ; x<arr.length ; x++)
        //System.out.print(x );
        //方法一
        System.out.print("["+ arr[0] + ", ");
        System.out.print(arr[1] +", ");
        System.out.print(arr[2] +", ");
        System.out.print(arr[3] +", ");
        System.out.print(arr[4] +"]");
        System.out.println();
        //方法二 调用方法
        xarr(arr);
    }
    //定义方法
    public static void xarr(int[] arr) {
        System.out.print("[");
        //遍历数组
        for (int x = 0 ; x<arr.length ; x++){
            if (x == arr.length - 1){
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }
}
