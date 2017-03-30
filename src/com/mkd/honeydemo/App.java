package com.mkd.honeydemo;

/**
 * Created by MKD on 2017/3/29.
 */
public class App {
    public static void main(String[] args){
        Box box = new Box();//蜜罐
        Bee bee1 = new Bee("b-1",box);
        Bee bee2 = new Bee("b-2",box);
        Bee bee3 = new Bee("b-3",box);
        Bee bee4 = new Bee("b-4",box);
        Bee bee5 = new Bee("b-5",box);
        Bee bee6 = new Bee("b-6",box);
        Bear bear1 = new Bear(box,"熊大");
        Bear bear2 = new Bear(box,"熊二");
        Bear bear3 = new Bear(box,"熊三");

        bee1.start();
        bee2.start();
        bee3.start();
        bee4.start();
        bee5.start();
        bee6.start();
    }
}
