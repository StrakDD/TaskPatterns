package task7;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class ClassicFactory implements FactoryWatch {
    @Override
    public ClassicWatch createWatch() {
        return new ClassicWatch();
    }
}
