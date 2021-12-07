package org.language.Project;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class Pizza {
    int size;
    int price;
    String name;

    public Pizza(String name,int size, int price) {
        this.name=name;
        this.price = price;
        this.size = size;
    }

    public Pizza() {

    }

    public String showPizza() {
        return "披萨的种类" + name + "\n披萨的大小" + size + "\n披萨的价格" + price;
    }
}
