package TheSixthDay;

/**
 * Created by MKD on 2017/3/16.
 */
//定义USB接口
interface USB{
    public void work(String str);
}
class Fan implements USB{
    public void work(String str){
        System.out.println("吹风" + str);
    }
}
class Camera implements USB{
    public void work(String str){
        System.out.println("拍照" + str);
    }
}
class MP3 implements USB{
    public void work(String str){
        System.out.println("播放歌曲" + str);
    }
}
class PC{
    public void communite(USB usb,String str){
        System.out.println("传递"+ usb +"设备");
        usb.work("hahaha");
    }
}
class USBDemo {
    public static void main(String [] args){
        PC pc = new PC();
        //
        Fan fan = new Fan();
        Camera camera = new Camera();
        MP3 mp3 = new MP3();
        //
        pc.communite(fan,"cool");
        pc.communite(mp3,"love");
        pc.communite(camera,"beautiful");
    }
}
