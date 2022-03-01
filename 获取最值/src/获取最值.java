public class 获取最值 {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr = {111, 545,324,453,231};
        //定义一个变量名用于最值,用数组第一个值作为初始值
        int max = arr[0];
        // 与数组中的剩余的值做对比
        for (int x = 1 ; x < arr.length; x++){
            //把相比之下大的值赋值给 max
            if (max > arr[x]){
                max = arr[x];
            }
        }
        System.out.println("数组中的最值为："+ max);
    }
}
