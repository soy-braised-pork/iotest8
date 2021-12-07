package org.language.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-02
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("e:\\test1.txt");
        File file2 = new File("e:\\demo.txt");
        //输入方向
        FileInputStream fileInputStream = new FileInputStream(file1);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //输出方向
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        //开始动作
        char[] chars = new char[20];
        int len=inputStreamReader.read(chars);
        while (len!=-1){
            outputStreamWriter.write(chars,0,len);
            len=inputStreamReader.read(chars);
        }

        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
