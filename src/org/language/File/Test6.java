package org.language.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-30
 */
public class Test6 {
    public static void main(String[] args) throws IOException {


        File file = new File("e:\\111.png");
        FileInputStream fileInputStream = new FileInputStream(file);
        int count = 0;
        //读取
        byte[] bytes = new byte[1024 * 6];
        int len=fileInputStream.read(bytes);
        while (len!=-1){
            count++;
            System.out.println(len);
            len=fileInputStream.read(bytes);
        }
        System.out.println("count"+count);
        fileInputStream.close();
    }
}

