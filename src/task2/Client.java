package task2;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        SpecificHuman specificHuman = new SpecificHuman();
        specificHuman.addState(new Fishing());
        specificHuman.addState(new Hunting());
        specificHuman.doAction();
    }
}
