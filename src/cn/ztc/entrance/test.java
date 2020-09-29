package cn.ztc.entrance;

import cn.ztc.contriler.QuerUserImol;
import cn.ztc.contriler.QueryUser;
import cn.ztc.pojo.Doctor;
import cn.ztc.pojo.PERSON;
import cn.ztc.pojo.singer;
import cn.ztc.pojo.gongjiaoka;
import cn.ztc.pojo.NewPerson;
   class Hello {
    public static void main(String[] args) {
        /*singer obj = new singer(1,"邓紫棋","150","男","唱歌");
        singer lld = new singer();*/

        /*singer obj = new singer();
        obj.setsex("男生");
        System.out.println(obj.getSex());

        singer obj1 = new singer();
        obj.setId("1");
        System.out.println(obj.getId());

        singer obj2 = new singer();
        obj.setsex("憨憨");
        System.out.println(obj.getName());

        PERSON obj3 =  new PERSON();

        obj.getgjc(obj);
        System.out.println();

        QueryUser qu = new QuerUserImol();
        */
        /*
        gongjiaoka gong0 = Doctor.getGongjiaoka();
        gongjiaoka gong1 = Doctor.getGongjiaoka();
        gongjiaoka gong2 = Doctor.getGongjiaoka();
        System.out.println(gong0 == gong1);
        System.out.println(gong1 == gong2);
          */
        NewPerson p = new NewPerson();

        p.pay();





       /* singer dzq = new singer();
        singer wlh = new singer();
        singer lrh = new singer();

        dzq.id = 1;
        dzq.name = "邓紫棋";
        dzq.height = "160";

        /*String str = new String();
        int x = new Integer(1);

        //调用对象中高端方法
        obj.eat();
        obj.run();

        //2.给对象赋值与取值
        obj.name = "李荣浩";
        String name = obj.name;
        System.out.println("歌手的名字是:"+name);
        obj.id = 1;
        int id = obj.id;
        System.out.println("编号:"+id);
        obj.height = "180";
        String height = obj.height;
        System.out.println("歌手的身高是:"+height);*/


    }
}

//面向对象编程思想概述
/*
编程思想:
(1)面向过程,
(2)面向接口,
(3)面对对象,
(4)面向服务.
1.2,面向对象2个基本概念
(1)类class:具有相同属性与行为的事物分类
(2)对象object:万物皆对象
2,面向对象构造函数
一个类中有3个成员 属性/方法/构造函数==构造方法==构造器
如果你没有设置构造函数，默认隐式无参数构造函数
构造函数的作用:创建对象，进行属性赋值
this关键字的使用,作用：表示当前类,谁调用我，我就代表谁,用于区分变量
3,访问权限修饰符
public 公共的 范围:所有文件夹下
private 私有的 范围:当前类中只能使用
protected 受保护的 范围:子类无法使用
不写 默认 范围:当前文件路径下

可以修饰类 属性 方法 构造函数 写在结构的最前面

4,面向对象四大特性
封装 目的:保护代码的安全
继承
多态
抽象
*/
