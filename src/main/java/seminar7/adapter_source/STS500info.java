package seminar7.adapter_source;

import java.time.LocalDateTime;

public class STS500info {
    public SensorTemperature get(){
        return new SensorTemperature() {
            @Override
            public int identifier() {
                return 100;
            }

            @Override
            public double temperature() {
                return 22.0;
            }

            @Override
            public int year() {
                return LocalDateTime.now().getYear();
            }

            @Override
            public int day() {
                return LocalDateTime.now().getDayOfYear();
            }

            @Override
            public int second() {
                LocalDateTime now =LocalDateTime.now();
                return now.getHour()*3600+now.getMinute()*60+now.getSecond();
            }
        };
    }
}
