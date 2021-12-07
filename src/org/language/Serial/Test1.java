package org.language.Serial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-02
 */
public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //序列化：将内存中对象-》文件
        Person person=new Person(11,"lili");
        //有对象流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("e:\\test1.txt")));
        //向外写
        oos.writeObject(person);
        oos.close();
        System.out.println(person.toString());

        Class c1=Person.class;
        System.out.println("------------"+c1.getName());


        Class c2= Class.forName("org.language.Serial.Person");
        System.out.println(c2.getName());
        Field score = c2.getField("id");
        Object o = c2.newInstance();
        score.set(o,98);
        System.out.println("0------------"+o);

        ClassLoader classLoader = Test1.class.getClassLoader();
        Class aClass = classLoader.loadClass("org.language.Serial.Person");
    }
}
