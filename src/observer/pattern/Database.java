package observer.pattern;

import java.util.List;
import java.util.Vector;

public class Database implements Subject {

    List <Observer> observers;
    String operation;
    String record;

    public Database(){
        observers = new Vector<>();
    }

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
        for(Observer observer : observers){
            observer.update(operation, record);
        }
    }

    public void editRecord(String operation, String record){
        this.operation = operation;
        this.record = record;
        notifyObservers();
    }
}
