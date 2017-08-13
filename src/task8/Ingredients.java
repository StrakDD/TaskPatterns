package task8;


import java.util.Random;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public enum  Ingredients {
    CHICKEN(100, "Chicken"),
    MUSHROOM(30, "Mushroom"),
    SOUCE(15, "Sauce"),
    CHEESE(60, "Cheese"),
    BACON(44, "Bacon"),
    SEAFOOD(150, "Seafood");

    private final int price;
    private final String name;

    Ingredients(int price, String name){
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void cook(){
        System.out.println(name + " is cooking.");
    }
}
