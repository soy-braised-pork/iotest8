package org.language.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-30
 */
public class Test2 {
    private static Logger logger = Logger.getLogger("src.org.language.File.Test2.java");

    public static void main(String[] args) throws IOException {
        //1、创建一个file对象
        File file = new File("e:\\test1.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        // 2、将“管道”怼到源文件
        FileReader fileReader = new FileReader(file);
        //3、读取
        int n = fileReader.read();
//        System.out.println(n);
        while (n != -1) {
            System.out.println(n);
            n = fileReader.read();
        }
        System.out.println("----------------------------");
        int n1;
        while ((n1 = fileReader.read()) != -1) {
            System.out.println(n);
        }

        //4、关闭流；流，数据库、网络资源，靠JVM本身没有办法帮忙关闭，必须手动关闭
        fileReader.close();
    }

}
