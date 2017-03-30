package TheFiveDay;

/**
 * Created by MKD on 2017/3/14.
 */
 class CodeBlockDemo {
    public static void main(String[] args){
        new Doog();
    }
}
class Doog{
     public String name;         //构造代码块
    {
         System.out.println("constructor block:-1");
    }
    public Doog(){                 //构造函数
         System.out.println("new Dog()");
    }
    {                            //构造代码块
        System.out.println("constructor block:-2");
    }
}
