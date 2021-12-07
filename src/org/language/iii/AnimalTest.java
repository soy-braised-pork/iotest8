package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-15
 */
public class  AnimalTest {
    public static void main(String[] args) {
        Girl girl = new Girl();
//        Dog dog = new Dog();
//        Animal animal=dog;
        Animal animal = PetStore.getAnimal("狗");
        girl.play(animal);
    }
}
