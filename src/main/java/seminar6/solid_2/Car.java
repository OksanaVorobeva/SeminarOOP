package seminar6.solid_2;

public class Car extends Vehicle {
    private static final  double COEF=0.8;
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed*COEF;
    }
}
