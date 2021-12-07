package org.language.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数");
            int num1 = scanner.nextInt();
            System.out.println("请输入一个数");
            int num2 = scanner.nextInt();
            System.out.println("商为：" + num1 / num2);

            //多重catch
        }catch (InputMismatchException i){
            System.out.println("请输入int类型");
        }catch (ArithmeticException a){
            System.out.println("除数不能为0");
        }catch (Exception e){
            System.out.println("....");
        }finally {
            //无论如何，finally里面的东西一定会被执行
            //先执行finally，再执行return
            System.out.println("谢谢使用");
        }
    }
}
