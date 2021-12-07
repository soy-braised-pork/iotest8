package org.language.File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-30
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\test1.txt");
        File file1 = new File("e:\\demo1.txt");
        FileWriter fileWriter = new FileWriter(file1);
        FileReader fileReader = new FileReader(file);
        //一个字符一个字符复制
        int n=fileReader.read();
        while (n!=-1){
            fileWriter.write(n);
            n=fileReader.read();
        }

        //利用缓冲数组
        char[] chars = new char[5];
        int len=fileReader.read(chars);
        while (len!=-1){
            fileWriter.write(chars,0,len);
            len=fileReader.read(chars);
        }

        //关闭流（倒着关闭，后用先关闭）
        fileWriter.close();
        fileReader.close();

        System.out.println("操作成功");
    }
}
