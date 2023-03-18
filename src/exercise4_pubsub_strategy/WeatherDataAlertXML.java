package exercise4_pubsub_strategy;

public class WeatherDataAlertXML implements WeatherDataAlertStrategy {

    @Override
    public String getDataFromObject(WeatherDataAlertObject object) {
        return String.format(
                "<weatherAlert><alert>%s</alert><severity>%s</severity></weatherData>",
                object.getAlertMessage(),
                object.getSeverity()
        );
    }
}
