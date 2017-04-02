package com.mkd.Collection;

import java.util.*;

/**
 * Created by MKD on 2017/4/2.
 */
public class App {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("1234");
        list.add(100);
        list.add(new Integer(200));
        list.add(new Long(1));
        System.out.print(list.size());

        //遍历集合
        for (int i=0;i<list.size();i++){
            Object obj = (Object) list.get(i);
            System.out.println(obj);

        }
        System.out.println("- - - - - - - - - - ");
        //迭代器
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("- - - - - - - - - - ");
        Iterator it0 = list.iterator();
        for(;it0.hasNext();){
            System.out.println(it0.next());
        }
        System.out.println("- - - - - 22222- - - - - ");
        for(;it0.hasNext();){
            System.out.println(it0.next());
        }
        System.out.println("- - - - - 集合- - - - - ");
        //强制类型转换
        for(int i=0;i<list.size();i++){
            Object obj = list.get(i);
            if(obj instanceof String){
                System.out.println("hello" + (String)obj);
            }
            else if(obj instanceof Integer){
                System.out.println(100 + (Integer)obj);

            }
        }
        System.out.println("- - - - - sutdent- - - - - ");
        /**
         * 创建集合，存放String[tom,tomas,tomsLee]
         *          存放Integer[100,200,300]
         *          存放Student{name,age,sex,标准javabean}[tom,tomas,tomsLee]
         * */
        List list2 = new ArrayList();
        //添加String
        list2.add("tom");
        list2.add("tomas");
        list2.add("tomasLee");
        //添加Integer
        list2.add(100);
        list2.add(200);
        list2.add(300);
        //添加student(Student中添加构造器)
        list2.add(new Student("stu-2",30,'F'));
        list2.add(new Student("stu-3",22,'M'));
        //System.out.println(list2);
        //
        Object o = null; //new Object();
        for(int i=0;i<list2.size();i++){
            o = list2.get(i);
            if(o instanceof String){
                System.out.println("hello" + (String)o);
            }
            else if(o instanceof Integer){
                System.out.println(((Integer) o).intValue() + 100);
            }
            else if(o instanceof Student){
                Student s = ((Student) o);
                System.out.println(s.getName()+":"+s.getAge()+":"+s.getSex());

            }
        }
        System.out.println("****************************");
        //使用泛型
        List<Student> list3 = new ArrayList<Student>();
        list3.add(new Student("s-1",10,'F'));
        list3.add(new Student("s-2",11,'M'));
        list3.add(new Student("s-3",12,'M'));

        System.out.println("*************遍历泛型集合***************");
        //遍历泛型集合
        for(int i=0;i<list3.size();i++){
            Student ss = list3.get(i);
            System.out.println(ss.getName());
        }

        System.out.println("*************增强for循环***************");
        //增强for循环
        for(Student tmp : list3){
            System.out.println(tmp.getName());
        }
        System.out.println("*************LinkedList***************");
        Deque<String> dq = new LinkedList<String>();
        dq.add("Tom");
        dq.add("Tomas");
        dq.add("TomasLee");

        //迭代器
        Iterator<String> itt = dq.iterator();
        while(itt.hasNext()){
            System.out.println(itt.next());
        }
        String lastElemt = dq.getLast();

        System.out.println(dq.contains(new String("tomas")));

        System.out.println("+++++++++++++++++++++++++++");
        /*
        *创建ArrayList集合，存放100个Student对象。名字tom0~tom99,age从0~99
        * 给出对象s = new Student("tom9",9);
        * 判断s在集合中是否存在
        */
        List<Student> list100 = new ArrayList<Student>();
        for(int i=0;i<100;i++){
            list100.add(new Student("tom" + i, i));
        }
        Student s0 = new Student("tom9",9);
        System.out.println(list100.contains(s0));
    }
}
