package org.language.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-02
 */
public class Test11 {
    public static void main(String[] args) throws IOException {
        //1、准备输入方向
        //键盘录入
        InputStream in=System.in; //属于字节流
        //字节流----》字符流
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        //在isr外面再套一个缓冲流
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //2、准备输出方向
        //准备目标文件
        File file = new File("e:\\tsdt1.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //3、开始动作
        String s=bufferedReader.readLine();
        while (!s.equals("exit")){
            bufferedWriter.write(s);
            bufferedWriter.newLine();//在文件中换行
            s=bufferedReader.readLine();
        }

        bufferedWriter.close();
        bufferedReader.close();
    }
}
