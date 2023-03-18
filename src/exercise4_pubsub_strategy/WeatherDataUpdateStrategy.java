package exercise4_pubsub_strategy;

public interface WeatherDataUpdateStrategy {
    String getDataFromObject(WeatherDataUpdateObject object);
}
