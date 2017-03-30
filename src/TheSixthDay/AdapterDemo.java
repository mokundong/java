package TheSixthDay;

/**
 * Created by MKD on 2017/3/16.
 */
//按钮鉴定器接口
interface ButtonListener {
    public void onClick();     //单击事件
    public void onDBClick();   //双击事件
    public void onKeydown();     //键盘按下
    public void onKeyup();   //键盘抬起
}
//按钮
class Button{
    //按钮的监听器
    private ButtonListener listenser;
    //添加监听器
    public void addListener(ButtonListener lsn){
        this.listenser = lsn;
    }
    //单击一下按钮
    public void click(){
        listenser.onClick();
    }
    //双击一下按钮
    public void bdclick(){
        listenser.onDBClick();
    }
}
//监听器实现类
class MyListener implements ButtonListener{
    public void onClick(){System.out.println("one click");}
    public void onDBClick(){System.out.println("double click");}
    public void onKeydown(){System.out.println("key down");}
    public void onKeyup(){System.out.println("key up");}
}
class AdapterDemo{
    public static void main(String[] args){
        Button button1 = new Button();
        MyListener ml = new MyListener();
        button1.addListener(ml);
        button1.click();
    }
}
