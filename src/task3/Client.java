package task3;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        TourBuilder tourBuilder = new VipTour();
        Tour tour = tourBuilder.getTour();

        System.out.println(tour);
    }
}
