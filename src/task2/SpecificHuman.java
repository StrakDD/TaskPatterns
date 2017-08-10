package task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class SpecificHuman {
    List<State> state = new ArrayList<>();

    public void setState(List<State> state) {
        this.state = state;
    }


    public void addState(State state){
        this.state.add(state);
    }

    public void remoceState(State state){
        this.state.remove(state);
    }

    public void doAction(){
        for (State state1 : state) {
            state1.getActivity();
        }
    }
}
