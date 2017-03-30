package com.mkd.stringdemo;

import java.nio.charset.Charset;

/**
 * Created by MKD on 2017/3/26.
 */

public class APP {
    public static void main(String[] args) throws Exception {
        String str1 = "abc中de国fgh";
        String str2 = new String("abc");
        //System.out.println("str1 == str2 ?" + (str1 == str2));
        //System.out.println("str1.equals(str2) ?" + (str1.equals(str2)));
        //System.out.println("str1.equals(null) ?" + (str1.equals(null)));

        //System.out.println("str1.charAt(2) = " + str1.charAt(2));
        for(int i = 0;i < str1.length();i++){
            //System.out.println("第"+i +"个字符是："+ str1.charAt(i));
        }
        //取出字节数:字母1/1个 汉字2/1个
        byte[] bytes = str1.getBytes();
        //System.out.println(bytes.length);
        //将字符串转换成字符数组
        char[] array = str1.toCharArray();
        //取出子串在母串中的位置
        int index = str1.indexOf("bc");
        //System.out.println(index);
        //判断是否以指定字符串开始（区分大小写）,特殊字符需要转义符 \
        //System.out.println("str1.startsWith(\"ab\") = " + str1.startsWith("ab"));
        //大小写转换
        //System.out.println(str1.toUpperCase().startsWith("AB"));
        //拆分
        String str3 = "abc,123,12,fd,567";
        /*String[] sarr = str3.split(",");
        if(sarr != null && sarr.length >0 ){
            for(int i=0;i<sarr.length;i++) {
                System.out.println(sarr[i]);
            }

        }*/
        //[a,b)
        /*System.out.println(str3.substring(1));
        System.out.println(str3.substring(0));
        //System.out.println(str3.substring(-1));
        System.out.println(str3.substring(0,str3.length()));*/
        //反转字符串
        //System.out.println(reverseStr(null));
        //System.out.println(reverseStr("abcdef"));
        //System.out.println(reverseStr("v"));

        //自定义一个函数，从某一位置开始，取固定长度的字符串
        String str4="12345678";
        System.out.println(subString(str4,1,1));
        System.out.println(subString(str4,1,2));
        System.out.println(subString(str4,1,3));
        System.out.println(subString(str4,1,10));



    }
    //反转字符串
    public static String reverseStr(String src){
        if(src == null || src.length() == 0 || src.length() == 1){
            return src;
        }
        String temp = "";
        for(int i = src.length() - 1; i >= 0 ; i --){
            temp = temp + src.charAt(i);
        }
        return temp;
    }

    //定义一个函数，从某一位置开始，取固定长度的字符串
    public static String subString(String str,int beginindex,int length) throws Exception {
        //判断str == null
        if (str == null) {
            throw new Exception("源字符串为空！！");
        }
        //判断其实索引的有效性
        if (!(beginindex > -1 && beginindex < str.length())) {
            throw new Exception("其实索引非法！！");
        }
        //判断长度时候有效
        if(!(length > 0 && length + beginindex <= str.length())){
            throw new Exception("长度无效！！");
        }
        return str.substring(beginindex,beginindex+length);
    }
}
