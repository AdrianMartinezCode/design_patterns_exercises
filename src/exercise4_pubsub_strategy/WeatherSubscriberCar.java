package exercise4_pubsub_strategy;

public class WeatherSubscriberCar implements WeatherSubscriber {
    @Override
    public void update(String data) {
        System.out.println("### MONITORING THE SECURITY SYSTEM OF THE CAR: " + data);
    }
}
