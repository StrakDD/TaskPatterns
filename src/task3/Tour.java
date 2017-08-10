package task3;

/**
 * Created by Denis Starovoitenko on 10.08.2017.
 */
public class Tour {
    private String name;
    private boolean transfer;
    private boolean bothSides;
    private boolean bookHotel;
    private boolean insurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public boolean isBothSides() {
        return bothSides;
    }

    public void setBothSides(boolean bothSides) {
        this.bothSides = bothSides;
    }

    public boolean isBookHotel() {
        return bookHotel;
    }

    public void setBookHotel(boolean bookHotel) {
        this.bookHotel = bookHotel;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name='" + name + '\'' +
                ", transfer=" + transfer +
                ", bothSides=" + bothSides +
                ", bookHotel=" + bookHotel +
                ", insurance=" + insurance +
                '}';
    }
}
