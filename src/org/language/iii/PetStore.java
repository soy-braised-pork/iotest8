package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-15
 */
public class PetStore {

    public static Animal getAnimal(String petName) {
        Animal an = null;
//        if ("猫".equals(petName))
//        if (petName.equals("猫"))  空指针
        switch (petName) {
            case "猫":
                an = new Cat();
                break;
            case "狗":
                an = new Dog();
                break;
        }
        return an;
    }
}
