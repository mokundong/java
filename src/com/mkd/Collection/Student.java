package com.mkd.Collection;

/**
 * 学生类，标准javabean
 */
public class Student {
    private String name;
    private int age;
    private char sex;
    //构造函数
    public Student(String s, int i){}
    //重载构造函数
    public Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }public char getSex(){
        return sex;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    /*
    *重写equals方法
    */
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        //判断内存地址
        if(this == obj){
            return true;
        }
        //判断类型是否是student
        boolean nameEqu = false;
        if(obj.getClass() == Student.class){
            Student s = (Student)obj;
            //名字为空
            if(s.name == null ){
                if(s.name == null){
                    nameEqu = true;
                }
                else {
                    nameEqu = false;
                }
            }
            //名字不为空
            else{
                nameEqu = this.name.equals(s.name);
            }
            //处理年龄
            boolean ageEqu = (this.age == s.age);
            //
            return nameEqu && ageEqu;
        }
        return false;
    }
}

