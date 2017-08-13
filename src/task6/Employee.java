package task6;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public abstract class Employee {
    protected Assistant assistant;

    public Employee(Assistant assistant) {
        this.assistant = assistant;
    }

    public void send(Employee toEmployee){
        assistant.send(toEmployee, this);
    }

    public abstract void notify(String message);
}
