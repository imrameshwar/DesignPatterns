package org.example.pattern.observer.weatherForcastSystem;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
