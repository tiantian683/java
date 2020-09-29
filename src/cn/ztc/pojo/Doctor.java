package cn.ztc.pojo;

public class Doctor extends gongjiaoka {
private  static gongjiaoka  gongjiaoka;

public static  gongjiaoka getGongjiaoka(){
    if (gongjiaoka == null){
        gongjiaoka = new Doctor();

    }
    return gongjiaoka;
}



}
