package org.language.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-30
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //将文件封装为一个File类对象
        File file = new File("e:\\test1.txt", String.valueOf(123));
        File file1 = new File("e:/test1");
        File file2 = new File("e:" + File.separator + "test1");//File.separator 获取路径拼接符

        System.out.println("是否可读" + file.canRead());
        System.out.println("是否可写" + file.canWrite());
        System.out.println("路径" + file.toString());
        System.out.println("绝对路径" + file.getAbsoluteFile());
        System.out.println("相对路径" + file.getPath());
        System.out.println("上级目录" + file.getParent());
        System.out.println("文件大小" + file.length());
        System.out.println("是否隐藏" + file.isHidden());

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("是否可读" + file1.canRead());
        System.out.println("是否可写" + file1.canWrite());
        System.out.println("路径" + file1.toString());
        System.out.println("绝对路径" + file1.getAbsoluteFile());
        System.out.println("相对路径" + file1.getPath());
        System.out.println("上级目录" + file1.getParent());
        System.out.println("文件大小" + file1.length());

//        if (file1.exists()){
//            file1.delete();
//        }else {
//            file1.createNewFile();
//        }
        System.out.println(file1.exists());

        File file3 = new File("e:\\a\\b\\c");
        System.out.println("对目录的操作");
//        file3.mkdir();  对单层目录操作
        file3.mkdirs();  //多层目录操作
        file3.delete();  //删除目录只能删除一层；前提：这一层是空的，里面没有内容
        System.out.println("-------------------------------------");



        File file4 = new File("e:");
        System.out.println(Arrays.toString(file4.list()));
        String[] list = file4.list();
        System.out.println("String file4   "+file4.getName()+list.toString());
        try {
            for (String s:list){
                System.out.println(s);
            }
        }catch (NullPointerException e){
            System.out.println("NULL");
        }

    }


}
