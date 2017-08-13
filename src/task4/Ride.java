package task4;

/**
 * Created by Denis Starovoitenko on 11.08.2017.
 */
public class Ride implements State {
    @Override
    public void actionShoot(ShootingPlane plane) {
        System.out.println("Cant shoot! Plane is on ground.");
    }
}
