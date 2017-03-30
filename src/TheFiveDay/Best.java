package TheFiveDay;

/**
 * Created by MKD on 2017/3/15.
 */
class Beast {
    public String name;
    public int age;
    public Beast(){
        System.out.println("new Beast");
    }
    public void hehe() {
        System.out.println("sss");
    }
    public void eat(){
        System.out.println("////eat\\\\");
    }
    private void showl() {
        System.out.println("showl");
    }
}
//继承Beast类
class Tiger extends Beast{
    public String color = "yellow";
    public Tiger(){
        System.out.println("new Tiger");
    }
    public void eat(){//方法重写
        super.eat();//super调用父类
        System.out.println("~~~~~~~EAT~~~~~~~~~~~");
    }

}//继承Tiger，同时具备老虎和野兽的特性
class Netiger extends Tiger{
    public Netiger(){
        System.out.println("new Netiger");
    }
}
class Lion extends Beast{

}
class ExtendsDemo{
    public static void main(String[] args){
        //Tiger t = new Tiger();

        //t.hehe();
        //t.eat();
        Netiger net = new Netiger();
        /*
        System.out.println("********************");
        //Lion L = new Lion();
        //L.hehe();
        System.out.println("********************");
        Netiger net = new Netiger();
        net.eat();
        System.out.println(net.color);
        */
    }
}
