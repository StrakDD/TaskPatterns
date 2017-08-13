package task6;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class DirectorAssistant implements Assistant {
    private Director director;
    private Manager manager;
    private Booker booker;

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setBooker(Booker booker) {
        this.booker = booker;
    }


    @Override
    public void send(Employee toEmployee, Employee fromEmployee) {
        if (toEmployee.equals(director)) {
            System.out.println("Send to the Director");
        } else if (toEmployee.equals(manager)){
            System.out.println("Send to the manager");
        }else {
            System.out.println("Send to the booker");
        }
    }
}
