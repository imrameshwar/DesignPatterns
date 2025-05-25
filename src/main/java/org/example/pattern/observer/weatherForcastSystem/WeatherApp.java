package org.example.pattern.observer.weatherForcastSystem;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statsDisplay = new StatisticsDisplay();

        station.registerObserver(currentDisplay);
        station.registerObserver(statsDisplay);

        station.setMeasurements(25.0f, 65.0f, 1013.1f);
        station.setMeasurements(27.3f, 70.0f, 1012.5f);
        station.setMeasurements(22.8f, 90.0f, 1011.0f);
    }
}
