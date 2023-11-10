package seminar7.adapter_source;

public class MeteoStore {
    boolean save(MeteoSensor meteoSensor){
        System.out.println("Saving data");
        meteoSensor.getId();
        meteoSensor.getDateTime();
        meteoSensor.getTemperature();
        meteoSensor.getHumidity();
        meteoSensor.gePressure();
        return true;
    }
}
