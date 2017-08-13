package task12;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Human implements Writer {
    @Override
    public void write(Pen pen, String message) {
        System.out.println("Writing message with pen: " + message);
    }
}
