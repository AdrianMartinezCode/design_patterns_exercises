package exercise4_pubsub_strategy;

public abstract class WeatherStation {

    protected WeatherPublisher weatherPublisher;

    public WeatherStation(WeatherPublisher weatherPublisher) {
        this.weatherPublisher = weatherPublisher;
    }
}
