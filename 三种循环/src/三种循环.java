public class 三种循环 {
    public static void main(String[] args){
        //for
        for (int i = 1 ; i <= 5 ;i++){
            System.out.println("For:Java");
        }
        System.out.println("--------");
        //  while
        int j = 1;
        while (j <=  5 ){
            System.out.println("While:Java");
            j++;
        }
        System.out.println("--------");
        // do_while
        int k = 1;
        do {
            System.out.println("Do_while:Java");
            k++;
        }while (k <= 5);
    }
}
