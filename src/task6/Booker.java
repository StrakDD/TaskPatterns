package task6;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Booker extends Employee {

    public Booker(Assistant assistant) {
        super(assistant);
    }

    @Override
    public void notify(String message) {
        System.out.println("Booker gets message: " + message);
    }
}
