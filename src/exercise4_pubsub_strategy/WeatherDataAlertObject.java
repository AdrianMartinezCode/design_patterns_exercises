package exercise4_pubsub_strategy;

public class WeatherDataAlertObject {

    private String alertMessage;
    private String severity;

    public WeatherDataAlertObject(String alertMessage, String severity) {
        this.alertMessage = alertMessage;
        this.severity = severity;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public String getSeverity() {
        return severity;
    }
}
