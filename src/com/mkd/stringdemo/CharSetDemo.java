package com.mkd.stringdemo;

import java.util.Iterator;

/**
 * Created by MKD on 2017/3/28.
 */
public class CharSetDemo {
    public static void main(String[] args) throws Exception {
        String str = "a中b国c";
        System.out.println("----iso8859-1----");
        byte[] bytes = str.getBytes("iso8859-1");
        System.out.println(bytes.length);
        System.out.println(new String(bytes,"iso8859-1"));
        System.out.println("----gbk----");
        bytes = str.getBytes("gbk");
        System.out.println(bytes.length);
        System.out.println(new String(bytes,"gbk"));
        System.out.println("----gb2312----");
        bytes = str.getBytes("gb2312");
        System.out.println(bytes.length);
        System.out.println(new String(bytes,"gb2312"));
        System.out.println("----utf-8----");
        bytes = str.getBytes("utf-8");
        System.out.println(bytes.length);
        System.out.println(new String(bytes,"utf-8"));

        char c = 97;
        int i = 'b';
        System.out.println(c + i);

        Integer ii = 123;
        ii.intValue();//取得int值
        System.out.println(Integer.parseInt("128"));

        System.out.println(Long.parseLong("1288888888888"));

    }
}
