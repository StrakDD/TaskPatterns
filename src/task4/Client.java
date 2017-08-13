package task4;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        ShootingPlane plane = new ShootingPlane(100, "Specific gun");

        plane.doAction(new Ride());
    }
}
