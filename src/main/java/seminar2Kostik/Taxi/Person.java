package seminar2Kostik.Taxi;

import java.io.Serializable;

public class Person implements Serializable {
    public void callTaxi(Driver driver){
        driver.drive("ул. Ленина 37");
    }
}
