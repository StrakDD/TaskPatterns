package task5;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public interface SalatBuilder {
     boolean checkPossibility();

     void buildName();
     void buildPepper();
     void buildSalt();
     void buildIngredients();

     Salad getSalad();
}
