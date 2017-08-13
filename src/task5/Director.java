package task5;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Director {
    SalatBuilder salatBuilder;

    public Director(SalatBuilder salatBuilder) {
        this.salatBuilder = salatBuilder;
    }

    public Salad greatSalad(){
        salatBuilder.checkPossibility();

        salatBuilder.buildName();
        salatBuilder.buildPepper();
        salatBuilder.buildSalt();
        salatBuilder.buildIngredients();

       return salatBuilder.getSalad();
    }
}
