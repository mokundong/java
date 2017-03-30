package TheFiveDay;

/**
 * Created by MKD on 2017/3/16.
 */
//定义接口
interface USB {
    public static final int voltage = 8;
    void trans();
}
//实现类
class PC implements USB {
    public void trans(){
        System.out.println("###");
    }
}

class InterfaceDemo{
    public static void main(String[] args){
        PC pc = new PC();
        pc.trans();
        System.out.println(pc.voltage);
    }
}