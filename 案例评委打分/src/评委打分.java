import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一各评委的分数");
//        arr[0] = sc.nextInt();
//        System.out.println("请输入第二各评委的分数");
//        arr[1] = sc.nextInt();
//        System.out.println("请输入第三各评委的分数");
//        arr[2] = sc.nextInt();
//        System.out.println("请输入第四各评委的分数");
//        arr[3] = sc.nextInt();
//        System.out.println("请输入第五各评委的分数");
//        arr[4] = sc.nextInt();
//        System.out.println("请输入第六各评委的分数");
//        arr[5] = sc.nextInt();
        //使用循环改进键盘录入
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x+1) + "位评委的打分");
            arr[x] = sc.nextInt();
        }
        //调用方法 数组中的最大值
        int max = getMax(arr);
        //调用方法 数组中的最小值
        int low = getLow(arr);
        //调用方法 数组综合
        int sum = he(arr);
        //按照计算规则 计算分数
        int fen = (sum - max - low)/4;
        //输出分数
        System.out.println("选手的最终的分是："+ fen);
    }
    //求出数组中所有数的总和
    public static int he(int[] arr){
        int sum = 0;

        for(int x=0 ; x<arr.length ; x++){
            sum += arr[x];
        }
        return sum;
    }

    /*
    两个明确
    返回值类型 ： int
    参数 ： int[] arr
     */
    //判断数组中的最低分
    public static int getLow(int[] arr) {
        int low = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < low) {
                low = arr[x];
            }
        }
        return low;
    }
    //判断数组中的最高分
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}

