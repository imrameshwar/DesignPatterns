package org.example.pattern.observer.weatherForcastSystem;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
