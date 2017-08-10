package task1;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class SpecificHuman {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction(){
        state.getActivity();
    }
}
