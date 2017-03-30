package TheSixthDay;

/**
 * Created by MKD on 2017/3/16.
 */
//白
interface Iwhite {
    public void white();
}
//富
interface Irich {
    public void rich();
}
//美
interface Ibeauty{
    public void beauty();
}
//开车
interface Idrive{
    public void drive();
}
//定义新的接口，继承三个接口
interface IWRB extends Iwhite,Irich,Ibeauty{

}
//女明星类，继承总的接口
class WomenStar implements IWRB{
    public void white(){
        System.out.println("I'm white");
    }
    public void rich(){
        System.out.println("I'm rich");
    }
    public void beauty(){
        System.out.println("I'm beauty");
    }
}
//给女明星增加技能
class WomenStarDriver extends WomenStar implements Idrive{
    public void drive(){
        System.out.println("I can drive");
    }
}
class RichMan{
    public void marry(IWRB women){
        System.out.println("聊聊看");
    }
    public void drive(Idrive driver){
        driver.drive();
    }
}
class MarryDemo{
    public static void main(String[] args){
        RichMan rm = new RichMan();
        WomenStar ws = new WomenStar();
        rm.marry(ws);

        WomenStarDriver ws2 = new WomenStarDriver();
        rm.drive(ws2);
    }
}
