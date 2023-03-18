package exercise4_pubsub_strategy;

public interface WeatherPublisher {

    void publishAlert(WeatherDataAlertObject o);

    void publishUpdate(WeatherDataUpdateObject o);
}
