package task5;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConreteSalat());
        Salad salad = director.greatSalad();

        System.out.println(salad);
    }
}
