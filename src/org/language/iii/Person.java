package org.language.iii;

public class Person {

    int id;
    int age;
    String name;

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



    public static void sleep(){
        System.out.println("Person  ---  sleep");
    }

    private void eat(){
        System.out.println("Person  ---  eat");
    }
}
