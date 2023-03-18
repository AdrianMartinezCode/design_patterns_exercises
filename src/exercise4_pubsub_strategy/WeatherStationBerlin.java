package exercise4_pubsub_strategy;

public class WeatherStationBerlin extends WeatherStation {


    public WeatherStationBerlin(WeatherPublisher weatherPublisher) {
        super(weatherPublisher);
    }


    public void sendEvents() {
        weatherPublisher.publishAlert(new WeatherDataAlertObject("SUNNY", "LOW"));
        weatherPublisher.publishUpdate(new WeatherDataUpdateObject(32.0, 5));
    }
}
