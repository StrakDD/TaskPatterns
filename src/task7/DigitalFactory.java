package task7;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class DigitalFactory implements FactoryWatch {
    @Override
    public DigitalWatch createWatch() {
        return new DigitalWatch();
    }
}
