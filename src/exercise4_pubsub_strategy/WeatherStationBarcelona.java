package exercise4_pubsub_strategy;

public class WeatherStationBarcelona extends WeatherStation {

    public WeatherStationBarcelona(WeatherPublisher weatherPublisher) {
        super(weatherPublisher);
    }


    public void sendEvents() {
        weatherPublisher.publishAlert(new WeatherDataAlertObject("SNOWING", "CRITICAL"));
        weatherPublisher.publishUpdate(new WeatherDataUpdateObject(-40.0, 125));
    }
}
