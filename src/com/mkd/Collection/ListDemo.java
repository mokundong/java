package com.mkd.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MKD on 2017/4/3.
 */
public class ListDemo {
    public static void main(String[] args){
        //List可以存放重复元素
        List<Student> list = new ArrayList<Student>();
        Student s = new Student("tom",12);
        list.add(s);
        list.add(s);
        list.add(s);
        System.out.println(" ");
        //提取第一个元素，并修改///由于存在同一内存，会修改相同的
        list.get(0).setName("jerry");
        System.out.println(list.get(2).getName());
    }
}
