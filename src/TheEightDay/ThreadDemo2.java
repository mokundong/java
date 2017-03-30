package TheEightDay;
/**
 * Created by MKD on 2017/3/26.
 */
class MyThread extends Thread {
    public void run(){
        while(true){
            System.out.println(getName());
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
            //线程放弃cpu的抢占权
            //yield();
        }
    }
}
class ThreadDemo2{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t1.start();
    }
}