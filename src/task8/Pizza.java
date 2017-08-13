package task8;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Pizza implements Iterable {
    private List<Ingredients> ingredientsList;
    private String name;
    private int price = 0;

    public Pizza(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        PizzaIterator iterator = new PizzaIterator();

        while (iterator.hasNext()){
            price += iterator.next().getPrice();
        }
        return price;
    }


    @Override
    public Iterator getIterator() {

        return new PizzaIterator();
    }

    private class PizzaIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            if (index < ingredientsList.size()){
                return true;
            }
            return false;
        }

        @Override
        public Ingredients next() {
            return ingredientsList.get(index++);
        }
    }
}
