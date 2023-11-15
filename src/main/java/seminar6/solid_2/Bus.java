package seminar6.solid_2;

public class Bus extends Vehicle{

    private static final  double COEF=0.6;
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed*COEF;
    }
}
