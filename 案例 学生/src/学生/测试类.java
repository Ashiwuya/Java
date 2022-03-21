package 学生;
//              学生测试类
public class 测试类 {
    public static void main(String[] args) {
        //创建对象
        Student S = new Student();
        S.name = "骆浩";
        S.age = 88;
        //使用成员变量
        System.out.println(S.name +"," +S.age+"岁");
        //使用成员方法
        S.student();
        S.doHomework();
    }
}
