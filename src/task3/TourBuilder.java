package task3;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public abstract class TourBuilder {
    protected Tour tour;

    public void createTour(){
        this.tour = new Tour();
    }

    public Tour getTour() {
        createTour();
        buildName();
        buildTransfer();
        buildFlight();
        buildBooking();
        buildInsurance();
        return tour;
    }

    public abstract void buildName();
    public abstract void buildTransfer();
    public abstract void buildFlight();
    public abstract void buildBooking();
    public abstract void buildInsurance();

}
