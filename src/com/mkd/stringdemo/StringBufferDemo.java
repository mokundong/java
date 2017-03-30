package com.mkd.stringdemo;

/**
 * Created by MKD on 2017/3/28.
 * 字符串是常量
 */
public class StringBufferDemo {
    public static void main(String[] args){
        //线程安全的
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc");
        buffer.append("bcd");
        //方法链编程
        buffer.append("cde")
            .append("cde")
            .append("cde")
            .append("cde");

        System.out.println(buffer.toString());
        System.out.println(buffer.reverse());
        System.out.println(buffer.deleteCharAt(1));
        //不是线程安全的（速度更快）
        StringBuilder builder = new StringBuilder();
        builder.append("abc");

        System.out.println(builder.length());
        System.out.println(builder.capacity());
    }
}
