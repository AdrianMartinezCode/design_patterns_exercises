package exercise4_pubsub_strategy;

public class WeatherDataUpdateJSON implements WeatherDataUpdateStrategy {

    @Override
    public String getDataFromObject(WeatherDataUpdateObject object) {
        return String.format(
                "{weatherData:{degrees:%s,kmh:%s}}",
                String.valueOf(object.getDegrees()),
                String.valueOf(object.getKmh())
        );
    }
}
