package task10;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class AdapterDVI extends SVGA implements DVI {
    @Override
    public void connectDVI() {
        connectSVGA();
        System.out.println("DVI connected.");
    }
}
