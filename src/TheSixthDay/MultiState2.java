package TheSixthDay;

/**
 * Created by MKD on 2017/3/17.
 */
class Father {
    //定义资产
    private int asset = 10000;
    //get
    public int getAsset(){
        return asset;
    }
    //set
    public void setAsset(int asset){
        this.asset = asset;
    }
}
class Son extends Father{
    public int asset = 100;
    public void setAsset(int asset) {
        this.asset = asset;
    }
    public int getAsset(){
        return asset;
    }
    public int getFatherAsset(){
        return super.getAsset();
    }

}
class MutliState2{
    public static void main(String[] args){
/*        Son s = new Son();
        s.setAsset(500);
        System.out.println(s.getAsset());
        System.out.println(s.asset);*/
        System.out.println("-----------");
        Son ss = new Son();
        Father ff = ss;
        ff.setAsset(800);
        System.out.println(ss.asset);//方法被覆盖

        ss.setAsset(900);
        System.out.println(ff.getAsset());//方法被覆盖
        //得到父类的asset
        System.out.println(ss.getFatherAsset());
    }
}
