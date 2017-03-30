package com.mkd.honeydemo;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by MKD on 2017/3/29.
 */
public class Bear extends Thread {
    private Box box;
    private String name;

    //构造函数
    public Bear(Box box,String name){
        super();
        this.box = box;
        this.name = name;
    }
    //
    public void run(){
        while(true){
            synchronized (box){
                if(box.capacity == Box.MAX){
                    int tem = box.capacity;
                    box.capacity = 0;
                    System.out.println(name + ":吃掉了" + tem);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    box.notifyAll();
                }
                else{
                    try{
                        box.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
