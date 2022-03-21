public class 不死神兔 {
    public static void main(String[] args) {
        //定义一个数组储存图的的对数
        //数组长度为20
        int[] arr = new int[20];
        //因为第一个月，第二个月对数都是1，所以第一个二个元素索引值为1
        arr[0] = 1;
        arr[1] = 1;

        //arr[2] = arr[0] + arr[1];
        //arr[3] = arr[1] + arr[2];

        //用循环计算每个月兔子的对数
        for (int x = 2; x<arr.length; x++){
            arr[x] = arr[x-2] + arr[x-1];

            /*
            //arr[2] = arr[0] + arr[1];
            //arr[3] = arr[1] + arr[2];
            */
        }
        //输出最后一个元素的值，第二十月的兔子对数
        System.out.println("第二十月兔子对数是：" + arr[19]);
    }
}
