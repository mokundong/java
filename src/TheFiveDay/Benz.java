package TheFiveDay;

/**
 * Created by MKD on 2017/3/14.
 */
class Benz {
    //静态成员变量
    static String brand = "x";
    //private static String brand = "x";
    public static String getBrand(){
        return brand;
    }
    //静态代码块
    static{
        System.out.println("喷漆");
        System.out.println(brand);
        System.out.println("打蜡");
    }
    public Benz(){
        System.out.println("new Benz()");
    }
}
class BenzDemo{
    public static void main(String[] args0){
        //加载Benz类

        System.out.println(Benz.getBrand());
        System.out.println("-------------");
        new Benz();
        new Benz();

    }
}