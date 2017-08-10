package task3;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class VipTour extends TourBuilder {
    @Override
    public void buildName() {
        tour.setName("VIP");
    }

    @Override
    public void buildTransfer() {
        tour.setTransfer(true);
    }

    @Override
    public void buildFlight() {
        tour.setBothSides(true);
    }

    @Override
    public void buildBooking() {
        tour.setBookHotel(true);
    }

    @Override
    public void buildInsurance() {
        tour.setInsurance(true);
    }
}
