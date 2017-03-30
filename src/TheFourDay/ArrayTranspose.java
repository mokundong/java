package TheFourDay;

/**
 * Created by MKD on 2017/3/13.
 */
public class ArrayTranspose {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        out(arr);
        System.out.println("*****************");
        arr = trans(arr);
        out(arr);
        int[][][] arrr = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};
        outHor(arrr);
    }
    public static int[][] trans(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }
    public static void out(int[][] arr){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //横向输出三维数组
    public static void outHor(int [][][] arr){
        //循环行数，每个二维数组的长度
        for (int i=0;i<arr[0].length;i++){
            //输出所有列
            for(int j=0;j<arr.length;j++){
                //输出每个层上的第i行的元素
                for(int k=0;k<arr[j][i].length;k++){
                    System.out.print(arr[j][i][k] + "\t");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
