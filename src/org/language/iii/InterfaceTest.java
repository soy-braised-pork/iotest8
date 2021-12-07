package org.language.iii;

public interface InterfaceTest {

    //常量
    public static final int NUM=10;


    //抽象方法:
    public abstract void a();


    //public default修饰的非抽象方法
    public default void b(){
        System.out.println("-------b-------");
    }

    public static void c(){
        System.out.println("-------c------");
    }

}

class Test implements InterfaceTest{


    public void c(){
        b();
//        super.b();   报错
        InterfaceTest.super.b();
    }

    @Override
    public void a() {
        System.out.println("-----a重写------");
    }

//    @Override
//    public void b() {
//
//    }
}
