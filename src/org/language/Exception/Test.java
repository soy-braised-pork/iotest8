package org.language.Exception;

import java.util.Scanner;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class Test {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数");
//            if (scanner.hasNextInt()) {
                int num1 = scanner.nextInt();
                System.out.println("请输入一个数");
//                if (scanner.hasNextInt()) {
                    int num2 = scanner.nextInt();
                    System.exit(0);  //终止当前虚拟机
                    System.out.println("商为：" + num1 / num2);
//                }else {
//                    System.out.println("不合法");
//                }
//            }else {
//                System.out.println("不合法");
//            }
            return;
        }catch (Exception e){
            //啥也不做

            //自定义
            System.out.println("输入格式不合法\n");
            //显示异常类名（全限定路径）
            //显示异常描述信息对应的字符串，没有就是null
            System.out.println(e.toString()+"\n"+e.getMessage());
            //！！！！显示异常堆栈信息，打印详细异常信息
            e.printStackTrace();
            //抛出异常,后面代码不执行
            throw e;
        }finally {
            //无论如何，finally里面的东西一定会被执行
            //先执行finally，再执行return
            System.out.println("谢谢使用");
        }
    }
}
