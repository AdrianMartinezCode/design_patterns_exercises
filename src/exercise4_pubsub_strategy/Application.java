package exercise4_pubsub_strategy;

public class Application {

    public static void main(String[] args) {
        WeatherPublisherManager manager = new WeatherPublisherManager();

        WeatherStationBarcelona stationBarcelona = new WeatherStationBarcelona(manager);
        WeatherStationBerlin stationBerlin = new WeatherStationBerlin(manager);


        manager.subscribeToAlert(
                new WeatherSubscriberCar(), new WeatherDataAlertJSON()
        );
        manager.subscribeToAlert(
                new WeatherSubscriberGalicianPort(), new WeatherDataAlertXML()
        );
        manager.subscribeToData(
                new WeatherSubscriberCar(), new WeatherDataUpdateJSON()
        );
        manager.subscribeToData(
                new WeatherSubscriberGalicianPort(), new WeatherDataUpdateXML()
        );


        stationBarcelona.sendEvents();
        stationBerlin.sendEvents();


    }

}
