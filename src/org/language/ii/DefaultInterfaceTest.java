package org.language.ii;


interface A{
    default void foo(){
        System.out.println("Calling A.foo()");
    }

    default void foo2(){
        System.out.println("calling A.foo2()");
    }
}

public class DefaultInterfaceTest implements A{
    public static void main(String[] args) {
        DefaultInterfaceTest t=new DefaultInterfaceTest();
        t.foo();  //调用A.foo()
        t.foo2();
    }
}
