package seminar7.adapter_source;

public class Main {
    public static void main(String[] args) {
        MeteoStore meteDB = new MeteoStore();
        MeteoSensor ms200_1 = new MS200(1);
        meteDB.save(ms200_1);

        SensorTemperature sensorTemperature = new STS500info().get();
        AdapterST500 adapterST500 = new AdapterST500(sensorTemperature);
        meteDB.save(adapterST500);
    }

}
