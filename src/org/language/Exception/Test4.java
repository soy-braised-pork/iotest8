package org.language.Exception;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-28
 */
public class Test4 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        System.out.println(students.add(new Student("Li", 11, "女")));
        students.add(new Student("Li",11,"男"));
        students.add(new Student("Lu",11,"女"));
        students.add(new Student("Li",21,"女"));
        System.out.println(students.add(new Student("Li", 11, "女"))); //
        System.out.println(students.toString());
        System.out.println(students.size());

        LinkedHashSet<Object> objects = new LinkedHashSet<>();

    }
}
