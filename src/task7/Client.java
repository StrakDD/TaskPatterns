package task7;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        Watch watch = new DigitalFactory().createWatch();
        Watch watch1 = new ClassicFactory().createWatch();

        watch.makeWatch();

    }
}
