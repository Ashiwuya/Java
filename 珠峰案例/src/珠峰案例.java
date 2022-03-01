public class 珠峰案例 {
    public static void main (String[] args) {
        int zf = 8844430;
        double i = 0.1;
        int jishu = 0;
        while (i <= zf){
            i *= 2;
            jishu++;
        }
        System.out.println(jishu+"次");
    }
}
