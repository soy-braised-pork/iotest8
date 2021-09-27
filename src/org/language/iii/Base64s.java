package org.language.iii;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64s {
    public static void main(String[] args) {
        final String text="Base64 finally in Java 8!";

        final String encoded= Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        final String decoded=new String(Base64.getDecoder().decode(encoded),StandardCharsets.UTF_8);
        System.out.println(decoded);

        byte[] b={0,0,3,3,0,1,-122,-24};
        final String encoded1=Base64.getEncoder().encodeToString(b);
        System.out.println(encoded1);

        String str="AAADAwABhug";  //+/=
        byte[] b1=Base64.getDecoder().decode(str);
        for (int i=0;i<b1.length;i++){
            System.out.println(b1[i]);
        }
    }
}
