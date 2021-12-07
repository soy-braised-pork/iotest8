package org.language.Project;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class BaconPizza extends Pizza{

    int weight;

    public BaconPizza(){

    }



    public BaconPizza(String name,int size, int price, int weight) {
        super(name,size, price);
        this.weight=weight;
    }

    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根的克数是"+weight;
    }
}
