package org.example.pattern.observer.weatherForcastSystem;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer{
    private List<Float> temperatureHistory = new ArrayList<>();


    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureHistory.add(temperature);
        display();
    }

    public void display() {
        float avg = (float) temperatureHistory.stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
        System.out.println("Average temperature: " + avg + "C");
    }
}
