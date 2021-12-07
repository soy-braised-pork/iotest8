package org.language.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-30
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\test1.txt");
        FileReader fileReader = new FileReader(file);
        //做一个一次5个的容器
        char[] chars = new char[5];  //缓冲数组
        int len = fileReader.read(chars);
//        System.out.println(len);
        while (len != -1) {
            for (int i = 0; i < len; i++) {
                System.out.println(chars[i]);
            }
            fileReader.close();
        }
    }
}
