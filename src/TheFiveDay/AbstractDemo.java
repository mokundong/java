package TheFiveDay;

import java.security.SecureRandom;

/**
 * Created by MKD on 2017/3/15.
 */
abstract class Person {
    public String name;
    public Person(){
        System.out.println("new Person");
    }
    //抽象方法
    abstract public void speak();
    //具体方法
    public void speakAloud(){
        System.out.println("提高音量！！！");
        speak();//具体方法调用抽象方法
    }

}
/*
* 具体类，继承Person
* */
class Man extends Person{
    public Man(){
        super();
        System.out.println("new Man()");
    }
    public void speak(){
        System.out.println("川普");
    }
}

class AbstractDemo{
    public static void main(String[] args){
        Man man = new Man();
        //man.speak();
        man.speakAloud();
    }
}
