package task1;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        SpecificHuman specificHuman = new SpecificHuman();
        specificHuman.setState(new Fishing());
        specificHuman.doAction();

        specificHuman.setState(new Hunting());
        specificHuman.doAction();

        specificHuman.setState(new Collecting());
        specificHuman.doAction();
    }
}
