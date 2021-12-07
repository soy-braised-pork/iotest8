package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */


/**
 类的组成:属性、方法、构造器、代码块（普通块、静态块、构造块、同步块）
 内部类：成员内部类（静态、非静态）     局部内部类（位置：方法内、块内、构造器内）
 成员内部类：属性、方法、构造器等
           修饰符：privte,default,protect,public,final,abstract
 */


public class TestOuter {

    //非静态的成员内部类
    public class D{
        int age=20;
        String name;
        //内部类
        public void method(){
            //内部类可访问外部类内容
            age=10;
            System.out.println(age);
            int age=30;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(name);
            System.out.println(this.name);
        }
    }


    public void method1(){
        //在局部内部类中访问到的变量必须是用final修饰
        final int id=10;
        class A{
            public void a(){
//                id=20;
                System.out.println(id);
            }
        }
    }


    //如果类B在整个项目中只使用一次，那么没有必要单独创建一个B类，使用内部类
    public Comparable method2(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 100;
            }
        }
        return new B();
    }


    public Comparable method3(){
        //匿名内部类
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }


    public void test(){
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };

        comparable.compareTo("abc");
    }

}
