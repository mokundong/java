package TheSixthDay;

/**
 * Created by MKD on 2017/3/16.
 */
abstract class Animal {
    public String name;
    public abstract void cry();
}
class Dog extends Animal{
    public String color;
    public void cry(){
        System.out.println("*************");
    }
}
class Jing8 extends Dog{
    public String xxx;
    public String color;
    public void cry(){
        super.cry();
        System.out.println("汪汪汪");
    }
}
class MultiState{
    public static void main(String[] args){
        Jing8 dog = new Jing8();        //
        dog.cry();
        //System.out.println(dog.name);
        Dog d2 = dog;
        d2.cry();                       //
        System.out.println("**********");
        Jing8 d3 = new Jing8();
        d3.color = "white";
        System.out.println(d3.color);

        Dog d4 = d3;
        d4.color = "black";
        System.out.println(d4.color);
        System.out.println(d3.color);//去掉18行试试看

    }
}