public class 自增自减运算符 {
    public static void main(String[] args){
        //定义变量
        int i = 10 ;
        System.out.println("i:" + i);
        //单独使用 ++放在前后都可以
        //i++;
        //System.out.println("i:" + i);

        //参与操作使用
        int j = ++i;
        System.out.println("i:" + i);//结果为11
        //System.out.println("j:" + j);//结果为10
        System.out.println("j:" + j);//结果为11

    }
}
