package task12;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        Pen pen = new Pen("black");
        Human human = new Human();

        human.write(pen, "Good day Sir!");
    }
}
