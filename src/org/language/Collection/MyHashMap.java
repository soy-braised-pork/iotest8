package org.language.Collection;

import org.language.Exception.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-29
 */
public class MyHashMap {

    private final Comparator<Student> comparator;

    public MyHashMap(Comparator<Student> comparator) {
        this.comparator = comparator;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("lili",123456);
        map.put("alili",111111);
        map.put("blili",222222);
        map.put("clili",333333);
        map.put("dlili",444444);
        map.put("lili",null);
        System.out.println(map);
//        map.clear();
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        map.equals(1);
        Set<String> set=map.keySet();
        for (String s:set){
//            System.out.println(s);
            System.out.println(map.get(s));
        }
    }


}

