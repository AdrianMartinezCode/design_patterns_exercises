package exercise4_pubsub_strategy;

public class WeatherDataUpdateXML implements WeatherDataUpdateStrategy {

    @Override
    public String getDataFromObject(WeatherDataUpdateObject object) {
        return String.format(
                "<weatherData><degrees>%s</degrees><kmh>%s</kmh></weatherData>",
                String.valueOf(object.getDegrees()),
                String.valueOf(object.getKmh())
        );
    }
}
