package task5;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Salad {
    private String name;
    private boolean pepper;
    private Salt count;
    private List<Ingredient> ingredientList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPepper() {
        return pepper;
    }

    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }

    public Salt getCount() {
        return count;
    }

    public void setCount(Salt count) {
        this.count = count;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    @Override
    public String toString() {
        return "Salat{" +
                "name='" + name + '\'' +
                ", pepper=" + pepper +
                ", count=" + count +
                ", ingredientList=" + ingredientList +
                '}';
    }
}
