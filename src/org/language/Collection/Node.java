package org.language.Collection;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-27
 */
public class Node {
    //上个元素的地址
    Node pre;
    //当前元素
    Node obj;
    //下个元素的地址
    Node next;

    public Node getNext() {
        return next;
    }

    public Node getObj() {
        return obj;
    }

    public Node getPre() {
        return pre;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setObj(Node obj) {
        this.obj = obj;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
