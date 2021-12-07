package org.language.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        while (true){
            Date date = new Date();
            System.out.println(simpleDateFormat.format(date));
            Thread.sleep(1000);
        }
    }
}
