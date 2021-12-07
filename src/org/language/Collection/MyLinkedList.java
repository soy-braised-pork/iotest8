package org.language.Collection;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-27
 */
public class MyLinkedList {
    private int code = 0;
    Node first;
    Node last;

    public MyLinkedList() {
    }

    //添加元素方法
    public void add(Object o) {
        Node node = new Node();
        node.setPre(null);
        node.setObj(node);
        node.setNext(null);
    }
}


class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        Iterable<String> it= (Iterable<String>) arrayList.iterator();
    }
}