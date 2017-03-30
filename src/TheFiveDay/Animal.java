package TheFiveDay;

/**
 * Created by MKD on 2017/3/15.
 * 动物基类
 *继承 super this final...
 */
class Animal {
    public int feets = 4;

    public Animal(int n){
        this.feets = n;
        System.out.println("new Animal");
    }
    public void cry(){
        System.out.println("****************cry*************");
    }
}

class Dog extends Animal{
    public String name;
    public int age;

    public Dog(int feets){
        super(feets);
        System.out.println("new Dog");
    }
    public Dog(int feets,String name,int age){
        this(feets);//重用
        this.name = name;
        this.age = age;
    }
    public void cry(){
        super.cry();
        System.out.println("wangwang");
    }
    private final void run(){//可以编译通过 但是没有意义
        System.out.println("@@@@@@@@@");
    }

    public static void main(String [] args){
        Dog dog = new Dog(4);
        dog.cry();
    }
}

class Jing8 extends Dog{
    Jing8(int feets){
        super(feets);
    }
    public void cry(){
        super.cry();
        System.out.println("!!!!!");
    }
}