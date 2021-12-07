package org.language.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-30
 */
public class Test7 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\111.png");
        File file1 = new File("e:\\222.png");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);

        //开始复制
        long start=System.currentTimeMillis();
        int n=fileInputStream.read();
        while (n!=-1){
            fileOutputStream.write(n);
            n=fileInputStream.read();
        }
        long end=System.currentTimeMillis();
        System.out.println("复制时间"+(end-start));


        //利用缓冲数组
        long startTime=System.currentTimeMillis();
        byte[] bytes = new byte[1024 * 8];
        int len=fileInputStream.read(bytes);
        while (len!=-1){
            fileOutputStream.write(bytes,0,len);
            len=fileInputStream.read(bytes);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("利用缓冲数组复制时间"+(endTime-startTime));


        //利用缓冲区

        fileOutputStream.close();
        fileInputStream.close();
    }
}
