package org.language.TimeTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-18
 */
public class Test2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder("afg");
        stringBuilder1.delete(1,2);
        System.out.println(stringBuilder1);
        stringBuilder.append("asd");
        stringBuilder.append("zxcv");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.append("asd") == stringBuilder.append("zxcv"));


        Collection<Object> lists = new ArrayList<>();
        lists.add(12);
        lists.add(12);
        Iterator it=lists.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        List list=new ArrayList();
        arrayList.add(2);
        arrayList.add(Integer.valueOf("as"));
        list.add(2);

        //子类父类
        Object o = new Object();
        String s = new String();
        o=s;

        ArrayList<Object> arrayList1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
//        arrayList1 =strings;   //泛型没有子类父类继承关系，并列的

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("123");
        list1.add(1,"233");
        list1.add(1,"1234");
        System.out.println(list1);
        list1.clear();

        list.equals(list1);
    }
}
