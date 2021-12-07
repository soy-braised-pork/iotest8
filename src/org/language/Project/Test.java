package org.language.Project;

import org.language.Project.PizzaStore;

import java.util.Scanner;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("1、培根披萨 2、水果披萨");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        Pizza pizza= PizzaStore.getPizza(sc);
        System.out.println(pizza.showPizza());
    }
}
