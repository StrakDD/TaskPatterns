package task6;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Manager extends Employee {

    public Manager(Assistant assistant) {
        super(assistant);
    }

    @Override
    public void notify(String message) {
        System.out.println("Manager gets message: " + message);
    }
}
