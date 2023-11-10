package seminar7.adapter_source;

import java.time.LocalDateTime;

public class AdapterST500 implements MeteoSensor{
    private SensorTemperature adapter;

    public AdapterST500(SensorTemperature adapter) {
        this.adapter = adapter;
    }

    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime=LocalDateTime.of(adapter.year(),1,1,1,1);
        dateTime=dateTime.plusDays(adapter.day()-1);
        dateTime=dateTime.plusSeconds(adapter.second());
        return dateTime;
    }

    @Override
    public Float getTemperature() {
        return (float) adapter.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float gePressure() {
        return null;
    }
}
