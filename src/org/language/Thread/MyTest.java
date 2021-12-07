package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class MyTest extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(this.setName() +i);
        }
    }

    public String setName() {
        return "子线程----->";
    }

    public MyTest(){

    }

    public MyTest(String name){
        super(name);  //调用父类的有参构造器
    }
}
