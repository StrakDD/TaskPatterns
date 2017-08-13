package task6;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class Client {
    public static void main(String[] args) {
        DirectorAssistant directorAssistant = new DirectorAssistant();

        Manager manager = new Manager(directorAssistant);
        Director director = new Director(directorAssistant);
        Booker booker = new Booker(directorAssistant);


        directorAssistant.setDirector(director);
        directorAssistant.setBooker(booker);
        directorAssistant.setManager(manager);

        directorAssistant.send(director, manager);
        directorAssistant.send(booker, director);
        directorAssistant.send(manager, booker);

        manager.send(director);
        director.send(booker);
        booker.send(manager);

    }
}
