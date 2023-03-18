package exercise4_pubsub_strategy;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubscriberGalicianPort implements WeatherSubscriber {

    private List<String> events;

    public WeatherSubscriberGalicianPort() {
        this.events = new ArrayList<>();
    }

    @Override
    public void update(String data) {
        System.out.println("SENDING DATA TO THE GALICIAN PORT AUTHORITY: " + data);
        events.add(data);
    }
}
