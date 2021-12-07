package org.language.Exception;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("娜娜",1,"女");
        System.out.println(student);
        Student student1 = new Student("娜娜",1,"de");
        System.out.println(student1);
        Integer integer = new Integer(12);
        Integer integer1= new Integer("12");

    }
}
