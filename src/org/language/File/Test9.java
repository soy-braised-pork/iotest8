package org.language.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-01
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        //文件----》程序
        //1、源文件
        File file = new File("e:\\test1.txt");
        //2、需要一个输入的字节流接触文件
        FileInputStream fileInputStream = new FileInputStream(file);
        //3、加入一个转换流，将字节流转换为字符流：（转换流属于一个处理流）
        //将字节转换为字符时，需要指定一个编码，这个编码跟文件本身的编码格式统一
        //如果编码格式不统一的话，那么在控制台上展示的效果就会出现乱码
        //获取程序本身编码
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream /*,"utf-8"*/);
        //开始动作，将文件中的内容显示在控制台
        char[] chars = new char[20];
        int len=inputStreamReader.read(chars);
        while (len!=-1){
            //将缓冲数组转为字符串在控制台
            System.out.print(new String(chars,0,len));
            len=inputStreamReader.read(chars);
        }


        //5、关闭流
        inputStreamReader.close();

    }
}
