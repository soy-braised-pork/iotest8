package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-12
 */
public class Test1 {

   public String Test1(){
       return "Test1";
   }

    public void Test2(){
        System.out.println("Test2");
    }


    {
        System.out.println("{}");
    }


    static {
        System.out.println("static");
    }



    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1);
        System.out.println("main");
        Test2 test2 = new Test2();
        System.out.println(test2);
    }
}
