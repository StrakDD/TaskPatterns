package task9;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
