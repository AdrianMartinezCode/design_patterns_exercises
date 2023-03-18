package exercise4_pubsub_strategy;

public class WeatherDataAlertJSON implements WeatherDataAlertStrategy {


    @Override
    public String getDataFromObject(WeatherDataAlertObject object) {
        return String.format(
                "{weatherAlert:{alert:%s,severity:%s}}",
                object.getAlertMessage(),
                object.getSeverity()
        );
    }
}
