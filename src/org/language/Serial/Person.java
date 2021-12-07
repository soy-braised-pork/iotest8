package org.language.Serial;

import java.io.Serializable;

public class Person implements Serializable {
    //实现序列化类的内部所有属性，必须是可序列化的（基本数据类型都是可序列化的）
//static\transient修饰的属性，不能呗序列化
    private static final long serialVersionUID=123L;
    int id;
    int age;
    transient String name;

    public Person(){

    }


    public Person(int id){

    }

    public Person(int id,String name){
        this(id);
        this.name=name;
    }

    public Person(int id,int age,String name){
        this(id,name);
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void sleep(){
        System.out.println("Person  ---  sleep");
    }

    private void eat(){
        System.out.println("Person  ---  eat");
    }
}
