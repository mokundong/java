package TheFourDay;

/**
 * Created by MKD on 2017/3/13.
 * 计算所有元素的和
 */
public class SumArrayDemo {
    public static void main(String[] args){
        //int result = sum(new int[] {1,2,4,5,6});
        //System.out.println(result);
        System.out.println(multi(4));

    }
    //计算数组和
    public static int sum(int[] arr){
        int sum = 0;
        //循环数组
        for(int i=0;i<arr.length;i++){
            //开始累加
            sum = sum + arr[i];
        }
        return sum;
    }
    //计算阶乘
    public static int multi(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        return result;
    }
}
