package org.language.Project;

import java.util.Scanner;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class PizzaStore {

    public static Pizza getPizza(int sc){
        Scanner scanner = new Scanner(System.in);
        Pizza p=null;
        switch(sc){
            case 1: {
                System.out.println("请录入培根的克数");
                int weight = scanner.nextInt();
                System.out.println("请录入披萨的大小");
                int size = scanner.nextInt();
                System.out.println("请录入披萨的价格");
                int price = scanner.nextInt();
                BaconPizza baconPizza = new BaconPizza("培根披萨",size,price,weight);
                p=baconPizza;
            }
            break;
            case 2: {
                System.out.println("请录入需要的水果");
                String fruit = scanner.next();
                System.out.println("请录入披萨的大小");
                int size = scanner.nextInt();
                System.out.println("请录入披萨的价格");
                int price = scanner.nextInt();
                FriutPizza friutPizza = new FriutPizza("水果披萨",size,price,fruit);
                p=friutPizza;
            }
            break;
        }
        return p;
    }


}

