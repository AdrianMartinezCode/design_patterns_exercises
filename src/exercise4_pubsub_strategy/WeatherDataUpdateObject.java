package exercise4_pubsub_strategy;

public class WeatherDataUpdateObject {

    private double degrees;
    private double kmh;

    public WeatherDataUpdateObject(double degrees, double kmh) {
        this.degrees = degrees;
        this.kmh = kmh;
    }

    public double getDegrees() {
        return degrees;
    }

    public double getKmh() {
        return kmh;
    }
}
