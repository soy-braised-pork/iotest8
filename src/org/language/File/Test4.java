package org.language.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-30
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\demo.txt");
        FileWriter fileWriter = new FileWriter(file,true); //只追加，不覆盖；默认false
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars=str.toCharArray();
        //一个一个添加
//        for (int i = 0; i < str.length(); i++) {
//            fileWriter.write(str.charAt(i));
//        }
        fileWriter.write(chars);
        fileWriter.close();
    }
}
