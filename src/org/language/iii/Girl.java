package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-11
 */
public class Girl {
    private int age;

    int sno;

    public int getAge() {
        if (age > 30) {
            return 18;
        } else {
            return age;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }
}
