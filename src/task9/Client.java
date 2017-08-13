package task9;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        NewspaperPrinting newspaperPrinting = new NewspaperPrinting();

        newspaperPrinting.addObserver(new Subscriber("Valera"));
        newspaperPrinting.addObserver(new Subscriber("Kuzia"));
        newspaperPrinting.addObserver(new Subscriber("Vasia"));

        newspaperPrinting.makeRelease();
    }
}
