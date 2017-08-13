package task9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 13.08.2017.
 */
public class NewspaperPrinting implements Observed {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent();
        }
    }

    public void makeRelease(){
        System.out.println("Make some count of newspapers.");
        notifyObservers();
    }
}
