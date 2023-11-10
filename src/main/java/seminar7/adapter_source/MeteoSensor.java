package seminar7.adapter_source;

import java.time.LocalDateTime;

public interface MeteoSensor {
    int getId();
    LocalDateTime getDateTime();
    Float getTemperature();
    Float getHumidity();
    Float gePressure();

}
