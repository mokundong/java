package com.mkd.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by MKD on 2017/4/3.
 */
public class TreeSetDemo {
    public static void main(String[] args){
        /*
        *自定义比较器，实现对象大小的比较
        * 按照年龄判断大小
         */
        Comparator<Person> comp = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                if(o1 == null){
                    if(o2 == null){
                        return 0;
                    }else{
                        return -1;
                    }
                }
                //o1 != null
                else{
                    if(o2 == null){
                        return 1;
                    }
                    else{
                        return o1.getAge() - o2.getAge();
                    }
                }
            }
        };
        //通过比较器构造TreeSet集合
        TreeSet<Person> ts = new TreeSet<Person>(comp);
        ts.add(null);
        ts.add(new Person("p1",10));
        ts.add(new Person("p5",15));
        ts.add(new Person("p2",12));
        ts.add(new Person("p3",13));
        ts.add(new Person("p4",14));

        //System.out.println(ts.size());
        //迭代器
        for(Iterator<Person> it = ts.iterator();it.hasNext();){
            Person p = it.next();
            System.out.println(p!=null?p.getName():"Nobody");
        }
    }
}
