package com.mkd.honeydemo;

/**
 * Created by MKD on 2017/3/29.
 */
public class Bee extends Thread{
    private int bag;
    private static final int BAG_MAX = 20;
    private static final int ONCE = 5;      //每生产5斤可以放入蜜罐（放入量取决去罐里剩余空间和bag里的量）
    private static final int TIME = 10;     //生产1斤花费10ms

    private Box box;
    private String name;

    public Bee(String name,Box box){
        this.name = name;
        this.box = box;
    }

    public void run(){
        while(true){
            /*//如果不足5
            if(bag >= 0 && bag < 5){
                bag ++;
                try{
                    Thread.sleep(10); //休眠10毫秒
                }catch (Exception e){
                }
            }*/
            //满足放蜂蜜的条件
            if(bag>=5){
                //向蜜罐放蜜
                synchronized (box){
                    //取出当前蜜罐的容量
                    int cap = box.capacity;
                    //蜜罐已满
                    if(cap >= Box.MAX){
                        box.notifyAll(); //通知熊吃蜜
                    }
                    //未满
                    else{
                        //蜜罐剩余空间
                        int remain = box.MAX - cap;
                        //蜜蜂带
                        if(bag > remain){
                            box.capacity = Box.MAX;
                            bag = bag - remain;
                            System.out.println(name+".添加了"+remain+",name.bag"+bag+",蜜罐有"+box.capacity);
                            box.notifyAll(); //通知熊吃蜜
                        }
                        //不足remain
                        else{
                            box.capacity = box.capacity + bag;
                            System.out.println(name+".添加了"+remain+",name.bag"+bag+",蜜罐有"+box.capacity);
                            bag = 0;
                        }
                    }
                }
            }
            //向小包增加蜂蜜
            if(bag >= Bee.BAG_MAX){
                synchronized (box){
                    try{
                        box.wait();
                    }catch (Exception e){}
                }
            }
            else{
                bag ++;
                System.out.println(name+".bag"+bag);
                try{
                    Thread.sleep(10);
                }catch (Exception e){}
            }
        }
    }
}
