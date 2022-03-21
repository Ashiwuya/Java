import java.util.Scanner;

public class 查找 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
       //键盘录入要查找的数组，用一个变量接受收
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据");
        int number = sc.nextInt();
       /* //定义一个索引变量
        int index = -1;
        //遍历数组 获取到数组的每一个元素
        for (int x=0; x< arr.length; x++){
            if (arr[x] == nmb){
                index = x;
                break;
            }
        }
        */
        //调用方法
        int index = getindex(arr, number );
        //输出索引变量
        System.out.println(index);
    }
    //查找指定的数据在数组中的索引
    /*
        两个明确
        明确类型 int
        明确参数 ： int[] arr , int nmb
     */
    public static int getindex(int[] arr ,int number) {
        //键盘录入要查找的数组，用一个变量接受收
        int index = -1;
        //遍历数组 获取到数组的每一个元素
        for (int x=0; x<arr.length; x++){
            if (arr[x] == number){
                index = x;
                break;
            }
        }
        //返回索引
        return index;
    }
}
