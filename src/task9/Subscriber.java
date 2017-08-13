package task9;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleEvent() {
        System.out.println(name + " get newspaper.");
    }
}
