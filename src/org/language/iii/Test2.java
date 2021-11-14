package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-11
 */
public class Test2 {


    int age;
    static int id=111;


    static public void a() {
//        b();
//        System.out.println(this.age);
        Test2 test2 = new Test2();
        System.out.println(test2.age);
        System.out.println(id);
    }


    public void b() {
        a();
        System.out.println();
    }

    public static void main(String[] args) {
        //非静态方法可以运用对象名.方法名调用
        Test2 t=new Test2();
        t.b();

        //静态方法调用 对象名.方法名   类名.方法名
        t.a();
        Test2.a();
        //在同一个类中可以直接调用
        a();
    }
}
