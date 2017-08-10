package task2;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class Collecting implements State {
    @Override
    public void getActivity() {
        System.out.println("Human is collecting mushrooms.");
    }
}
