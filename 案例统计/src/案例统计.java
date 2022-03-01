public class 案例统计 {
    public  static void main (String[] args){
        int count = 0;
        for (int i=100; i <=999; i++){
            int ge = i %10;
            int shi = i/10  %10;
            int bai = i/100;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                count++;
            }
        }
        System.out.println("水仙花有："+count+"个");
    }
}
