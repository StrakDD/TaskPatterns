package task6;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Director extends Employee {
    public Director(Assistant assistant) {
        super(assistant);
    }

    @Override
    public void notify(String message) {
        System.out.println("Director gets message : " + message );
    }
}
