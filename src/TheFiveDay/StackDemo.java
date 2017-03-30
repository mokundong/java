package The.Five.Day;

/**
 * Created by MKD on 2017/3/14.
 */
public class StackDemo {
    static int count = 0;
    //
    public static void main(String[] args) throws Exception{
        out();
    }
    //递归方法调用
    public static void out() throws Exception{
        System.out.println(count++);
        Thread.sleep(1);
        if(count < 8000){
            out();
        }
    }
}
