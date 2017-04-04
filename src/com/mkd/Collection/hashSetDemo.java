package com.mkd.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by MKD on 2017/4/3.
 */
public class hashSetDemo {
    public static void main(String[] args){
        //创建hashset集合
        Set<Person> set = new HashSet<Person>();
        System.out.println("------1.相同物理地址--------");
        Person p = new Person("tom",10);
        //set元素不能添加重复元素
        set.add(p);
        set.add(p);
        set.add(p);
        System.out.println("------2.不同物理地址，hashcode = 1,equals=false--------");
        set = new HashSet<Person>();
        Person p1 = new Person("tom",12);
        Person p2 = new Person("tom",12);
        set.add(p1);
        set.add(p2);
        System.out.println("------3.不同物理地址，hashcode = 1,equals=true ==>不可以添加--------");
        set = new HashSet<Person>();
        p1 = new Person("tom",12);
        p2 = new Person("tom",12);
        set.add(p1);
        set.add(p2);
        System.out.println("------4.不同物理地址，hashcode = 不同,equals=false ==>可以添加--------");
        set = new HashSet<Person>();
        p1 = new Person("tom",12);
        p2 = new Person("tom",12);
        set.add(p1);
        set.add(p2);
        System.out.println("------5.不同物理地址，hashcode = 不同,equals=ture ==>可以添加--------");
        set = new HashSet<Person>();
        p1 = new Person("tom",12);
        p2 = new Person("tom",12);
        set.add(p1);
        set.add(p2);

        System.out.println(p1 == p2);
        System.out.println(p1.hashCode() == p1.hashCode());
        System.out.println("------判断hashset集合是否存在指定对象--------");
        set = new HashSet<Person>();
        p1 = new Person("tom",12);
        p2 = new Person("tom",12);
        set.add(p1);
        set.add(p2);
    }
}
