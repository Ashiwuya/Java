public class 水仙花 {
    public static void main(String [] args){
        for (int i = 100; i <= 999 ; i++){
            //得出个，十，百位数的值
            int ge = i %10;
            int shi = i /10 %10;
            int bai = i /10/10%10;
            //得出符合条件的数值
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                //输出符合条件的数值
                System.out.println(i);
            }
        }
    }
}
