package org.language.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-01
 */
public class Test8 {
    public static void main(String[] args) throws IOException {
        //1、源文件
        File file1 = new File("e:\\test.txt");
        //2、目标文件
        File file2 = new File("e:\\demo.txt");
        //3、需要一个管 怼到 源文件
        FileReader fileReader = new FileReader(file1);
        //4、需要一个管 怼到 目标文件
        FileWriter fileWriter = new FileWriter(file2);
        //5、套一根管在输入字符流外面
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //6、套一根管在输出字符流外面
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //7、开始
        //方式1：读取一个字符，输出一个字符
        int n=bufferedReader.read();
        while (n!=-1){
            bufferedWriter.write(n);
            n=bufferedReader.read();
        }
        //方式2：利用缓冲数组
        char[] chars=new char[30];
        int len=bufferedReader.read(chars);
        while (n!=-1){
            bufferedWriter.write(chars,0,len);
            n=bufferedReader.read(chars);
        }
        //方式3：读取String
        String str=bufferedReader.readLine();// 每次读取文本文件一行，返回字符串
        while (str!=null){
            bufferedWriter.write(str);
            //在文本文件中应该再写出一个换行
            bufferedWriter.newLine();
            str=bufferedReader.readLine();//读取下一行
        }

        //8、关闭流（关闭最外面）
        bufferedWriter.close();
        bufferedReader.close();
    }
}
