package com.mkd.Collection;

/**
 * Created by MKD on 2017/4/3.
 * hashcode + equals
 */
public class Person {
    private String name;
    private Integer age;
    //构造器
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //hashcode
    public int hashCode(){
        return name == null?age : name.hashCode() + age;
    }
    //重写(自定义)equals
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        //精准判断
        if(obj.getClass() == Person.class){
            boolean nameEue = false;
            Person p = (Person)obj;
            //判断name是否相同
            if(this.name == null){
                if(p.name == null){
                    nameEue = true;
                }
                else{
                    nameEue = false;
                }
            }
            //name != null
            else{
                nameEue = name.equals(p.name);
            }
            //age是否相同
            boolean ageEqu = (this.age == p.age);
            return nameEue && ageEqu;
        }
        return false;
    }
}
