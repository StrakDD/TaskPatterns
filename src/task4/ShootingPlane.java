package task4;

/**
 * Created by Denis Starovoitenko on 11.08.2017.
 */
public class ShootingPlane{
    private int arming;
    private String specificArming;
    private State state;



    public ShootingPlane(int arming, String specificArming) {
        this.arming = arming;
        this.specificArming = specificArming;
    }

    public int getArming() {
        return arming;
    }

    public void setArming(int arming) {
        this.arming = arming;
    }

    public String getSpecificArming() {
        return specificArming;
    }

    public void setSpecificArming(String specificArming) {
        this.specificArming = specificArming;
    }

    public void doAction(State state) {
        this.state = state;
        state.actionShoot(this);
    }
}
