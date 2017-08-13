package task11;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Computer {
    private Keyboard  keyboard = new Keyboard();
    private Monitor monitor = new Monitor();
    private MotherBoard motherBoard = new MotherBoard();

    public void start(){
        keyboard.addKeyboard();
        monitor.connect();
        motherBoard.createMotherboard();
    }
}
