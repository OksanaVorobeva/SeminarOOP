package seminar7.adapter_source;

import java.time.LocalDateTime;

public class MS200 implements MeteoSensor{
    int id;

    public MS200(int id) {
        this.id = id;
    }

    @Override
    public Float gePressure() {
        return (float) 752.4;
    }

    public int getId() {
        return id;
    }

    public Float getTemperature(){
        return (float) 20;
    }

    public  Float getHumidity(){
        return (float) 60;
    }



    public LocalDateTime getDateTime(){
        return LocalDateTime.now();
    }


}
