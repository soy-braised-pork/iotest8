package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-11
 */
public class Student extends Person {

    int id;
    int Sid;
    int name;

    public void eat() {
        this.id = super.id;
        int id = super.id;
        int age1 = age;
        sleep();
        super.sleep();
        System.out.println("Student ----> eat" + Sid + id + age + name + super.name);
    }

    public static void sleep(){
        System.out.println(/*"student ------  sleep"*/);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
//        super.sleep();
    }
}
