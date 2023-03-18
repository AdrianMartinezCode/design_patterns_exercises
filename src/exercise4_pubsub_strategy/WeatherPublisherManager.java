package exercise4_pubsub_strategy;

import java.util.ArrayList;

public class WeatherPublisherManager implements WeatherPublisher {

    private ArrayList<WeatherSubscriber> alertSubscribers;
    private ArrayList<WeatherDataAlertStrategy> alertSubscribersStrategies;
    private ArrayList<WeatherSubscriber> updateSubscribers;
    private ArrayList<WeatherDataUpdateStrategy> updateSubscribersStrategies;


    public void subscribeToAlert(WeatherSubscriber s, WeatherDataAlertStrategy str) {
        alertSubscribers.add(s);
        alertSubscribersStrategies.add(str);
    }
    public void subscribeToData(WeatherSubscriber s, WeatherDataUpdateStrategy str) {
        updateSubscribers.add(s);
        updateSubscribersStrategies.add(str);
    }

    public void publishAlert(WeatherDataAlertObject o) {
        int i = 0;
        while(i < alertSubscribers.size()) {
            alertSubscribers.get(i).update(alertSubscribersStrategies.get(i).getDataFromObject(o));
            i++;
        }
    }

    public void publishUpdate(WeatherDataUpdateObject o) {
        int i = 0;
        while(i < updateSubscribers.size()) {
            updateSubscribers.get(i).update(updateSubscribersStrategies.get(i).getDataFromObject(o));
        }
    }
}
