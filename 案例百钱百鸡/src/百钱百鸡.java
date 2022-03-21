public class 百钱百鸡 {
    public static void main(String[] args) {
        //第一层循环，用于表示公鸡范围，判断条件是x<=20;
        for (int x = 0; x<=20; x++){
            //第二层循环，用于表示母鸡范围，判断条件是y<=33;
            for (int y = 0; y<=33; y++){
                //小鸡仔的变量z = 100 - x - y;
                int z = 100 - x - y;
                //判断表达式，z%3==0 和表达式5*x + 3*y + z/3 = 100是否同时成立
                if (z%3==0 && 5*x + 3*y + z/3 == 100){
                    System.out.println(x+","+y+","+z);
                }
            }
        }
    }
}
