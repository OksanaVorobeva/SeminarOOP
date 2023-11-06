package seminar1Kostik;

public class Bottle extends Product{
    private  double volume;

    public Bottle(double cost, String name,double volume) {
        super(cost, name);
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+" "+volume;
    }
}
