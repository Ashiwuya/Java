public class 反转 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        /*
        //遍历数组，定义两个变量 ， 判断条件是开始索引小于等于结束索引
        for (int start=0,end= arr.length-1; start<=end; start++,end--){
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
         */
        //调用反转的方法
        fanzhuan(arr);
        //遍历数组
        jiaohuan(arr);
    }
    /*
    两个明确
    返回值类型：void
    参数：int[] arr
     */
    public static void fanzhuan(int[] arr) {
        //遍历数组，定义两个变量 ， 判断条件是开始索引小于等于结束索引
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    /*
    两个明确
    返回值类型；void
    参数：arr[] arr
    */

    public static void jiaohuan(int[] arr) {
        System.out.print("[");

        for (int x= 0 ; x< arr.length; x++){
            if (x == arr.length-1){
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }
}
