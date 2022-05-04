package code._5_designPatterns_project.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject implements Observer {
    private List<Observer> observers = new ArrayList();

    void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    void notifyAllListening() {
        Iterator var1 = this.observers.iterator();

        while(var1.hasNext()) {
            Observer observer = (Observer)var1.next();
            observer.update();
        }

    }

    public Subject() {
    }

    public void update() {
    }
}
