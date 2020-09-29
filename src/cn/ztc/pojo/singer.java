package cn.ztc.pojo;


    public class singer {
    //类中属性使用全局变量表示
    public String id;
    public  String name;
    public  String height;
    public  String sex;
    public  String hobby;

    public void setsex(String sex) {

            if (sex != "男" && sex != "女") {
                System.out.println("请正确赋值");
            } else {
                this.sex = sex;
            }
        }
    public String getSex() {
        return sex;
    }
        public void setId(String id) {

            if (id != "1") {
                System.out.println("请正确赋值");
            } else {
                this.id = id;
            }
        }
        public String getId() {
            return id;
        }
        public void setName(String name) {

            if (name != "ztc") {
                System.out.println("请正确赋值");
            } else {
                this.name = name;
            }
        }
        public String getName() {
            return name;
        }
    //类中行为使用方法表示

    public void eat(){
        System.out.println("吃包子");
    }
    public void sing(){
        System.out.println("歌唱");
    }


    public  singer(String mId,String mName,String mHeight ){
        this.id = mId;//this 表示当前目录下的类，用于区分其他变量
        this.name = mName;
        this.height = mHeight;

        System.out.println("我创造了");
        //alt + insert 自动创建选择列表
    }
    public singer(){
        System.out.println("我创造了");
    }


        public void getgjc(singer obj) {
        }
    }
