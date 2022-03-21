public class 数组相同 {
    public static void main(String[] args) {
        //定义两个数组，使用静态初始化，完成两个数组的初始化
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        //调用方法
        boolean flag = bijiao(arr1,arr2);
        //输出结果
        System.out.println(
                flag
        );
    }
    //定义一个方法，用于比较两个数组内容是否正确
    /*
    * 两个明确
    * 明确类型 ：布尔类型
    * 明确参数：int[] arr1 ; int[] arr2
    * */
    public static boolean bijiao(int[]arr1 , int[] arr2 ) {
        //首先比较数组长度，
        if (arr1.length != arr2.length){
            return false;
        }
        //第二部遍历数组中的每一个元素，如果相等输出true 不相等输出false
        for (int x = 0; x< arr1.length; x++){
            if (arr1[x] != arr2[x]){
                return false;
            }
        }
        //如果都相等 最后输出 true
        return true;
    }
}
