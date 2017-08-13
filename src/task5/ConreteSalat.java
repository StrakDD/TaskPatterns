package task5;

import java.util.Arrays;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class ConreteSalat implements SalatBuilder {
    private Salad salat;


    public ConreteSalat() {
        this.salat = new Salad();
    }


    @Override
    public Salad getSalad() {
        return salat;
    }

    @Override
    public boolean checkPossibility() {
        System.out.println("Checking opportunity to create a salad.");
        return true;
    }

    @Override
    public void buildName() {
        System.out.println("Some name.");
        salat.setName("Name");
    }

    @Override
    public void buildPepper() {
        System.out.println("Some pepper.");
        salat.setPepper(true);
    }

    @Override
    public void buildSalt() {
        System.out.println("Some salt.");
        salat.setCount(Salt.LITTLE);
    }

    @Override
    public void buildIngredients() {
        System.out.println("Some ingredients.");
        salat.setIngredientList(Arrays.asList(Cabbage.NO, Lettuca.GREEN));
    }
}
