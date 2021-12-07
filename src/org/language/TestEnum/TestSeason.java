package org.language.TestEnum;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-07
 */
public class TestSeason {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.class);
        Season spring=Season.SPRING;
        System.out.println(spring);
        System.out.println(Season1.SPRING);

        Season2 spring2=Season2.AUTUMN;
        spring2.show();
        System.out.println(spring2);
        Season2[] values = Season2.values();
        for(Season2 s:values){
            System.out.println(s);
        }
        Season2 summer = Season2.valueOf("SUMMER");
        System.out.println(summer);

        System.out.println(Season2.class.getSuperclass().getName());
        System.out.println(Season.class.getSuperclass().getName());

    }
}
