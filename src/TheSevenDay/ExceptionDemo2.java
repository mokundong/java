package TheSevenDay;

/**
 * Created by MKD on 2017/3/26.
 */

//定义运行时异常
class ageTooBigException extends RuntimeException{
    private String info;
    public ageTooBigException(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}
class ageTooSmallException extends Exception{
    private String info;
    public ageTooSmallException(String info){
        this.info = info;
    }

    public ageTooSmallException() {

    }

    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}

class Person{
    private int age;
    //定义函数，声明异常
    public void setAge(int age) throws ageTooSmallException {
        if (age>100){
            //抛出异常
            throw new ageTooBigException("age too big");
        }
        else if(age<0){
            throw new ageTooSmallException("age too small");
        }
    }
    public int getAge(){
        return age;
    }
}
class AgeInvalidException extends ageTooSmallException{

    public AgeInvalidException(String info) {
        super(info);
    }

    public AgeInvalidException() {
        super();
    }
}
class chinese extends Person{
    public void setAge(int age) throws AgeInvalidException{
        if (age < 0 || age > 100){
            throw new AgeInvalidException();
        }
    }
}

class ExceptionDemo2 {
    public static void main(String[] args){
        Person p = new Person();
        //调用函数，对异常进行处理
        try{
            p.setAge(20);
        }
        catch(ageTooBigException e){
            System.out.println(e.getInfo());
        }
        catch(ageTooSmallException e){
            System.out.println(e.getInfo());
            System.exit(-1);
        }
        finally {
            System.out.println("finally");
        }
    }
}
