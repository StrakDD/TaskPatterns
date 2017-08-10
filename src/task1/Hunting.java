package task1;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class Hunting implements State {
    @Override
    public void getActivity() {
        System.out.println("Human is going hunting.");
    }
}
