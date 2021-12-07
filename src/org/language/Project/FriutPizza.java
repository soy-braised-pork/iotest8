package org.language.Project;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class FriutPizza extends Pizza{

    String fruit;


    public FriutPizza(){
        
    }
    
    public FriutPizza(String name,int size, int price, String fruit){
        super(name,size, price);
        this.fruit=fruit;
    }



    @Override
    public String showPizza() {
        return super.showPizza()+"添加的水果是"+fruit;
    }
}
