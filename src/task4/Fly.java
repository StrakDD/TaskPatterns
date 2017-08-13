package task4;

/**
 * Created by Denis Starovoitenko on 11.08.2017.
 */
public class Fly implements State {
    @Override
    public void actionShoot(ShootingPlane plane) {
        if (plane.getArming() > 0){
            System.out.println("Plane can shouting with " + plane.getSpecificArming());
        }
        else {
            System.out.println("No arming! Cant shooting.");
        }
    }
}
