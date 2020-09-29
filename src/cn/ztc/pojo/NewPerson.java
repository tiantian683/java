package cn.ztc.pojo;

public class NewPerson  {
    public PayInterface p;
   /* @Override
    public void pay() {

        System.out.println("人脸识别");
        super.pay();

        System.out.println("短信验证");
    */
  // public  PERSON p;

   public void  pay(){
       System.out.println("短信验证");
       p.pay();
       System.out.println("短信发送");
    }

}
