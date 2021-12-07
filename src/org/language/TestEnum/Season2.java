package org.language.TestEnum;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-07
 */
public enum  Season2 implements TestInterface{
    SPRING,
    SUMMER(),
    AUTUMN{
        @Override
        public Season2 show() {
            System.out.println("这是AUTUMN");
            return null;
        }
    };

    @Override
    public Season2 show() {
        System.out.println("这是Season");
        return null;
    }
}
