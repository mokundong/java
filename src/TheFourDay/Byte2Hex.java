package TheFourDay;

/**
 * Created by MKD on 2017/3/12.
 * 将字节型转换成16进制的字符串表现形式
 */
public class Byte2Hex {
    public static void main(String[] args){
        byte b = 108;
        System.out.println(convert(b));
    }
    //转换函数
    public static String convert(byte b){
        //1.取出字节b的低四位的数值
        int low = b & 0x0F; //低四位0-15
        //2.取出高四位的值，先将b向右移动4位
        int high = (b >> 4) & 0x0F;//高四位0-15
        //定义字符数组
        char[] arr ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //拼接串
        return "" + arr[high] + arr[low];
    }

}
