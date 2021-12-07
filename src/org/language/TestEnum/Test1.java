package org.language.TestEnum;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-07
 */
public class Test1 {
    public static void main(String[] args) {
        GenderEnum sex = GenderEnum.男;
        switch (sex){
            case 女:
                System.out.println("女");
                break;
            case 男:
                System.out.println("男");
                break;
        }

    }
}
