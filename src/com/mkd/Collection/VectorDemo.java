package com.mkd.Collection;

import java.util.Vector;

/**
 * Created by MKD on 2017/4/3.
 */
public class VectorDemo {
    public static void main(String[] args){
        Vector<Student> vector = new Vector<Student>();
        Student s1 = new Student("tom",10);
        vector.add(s1);
        vector.add(new Student("tomas",11));
        vector.add(0,new Student("tomasLee",12));
        System.out.println("----------");
        vector.remove(0);
        System.out.println("----------");
        vector.add(10,new Student("tom10",13));
        System.out.println(" ");



    }
}
