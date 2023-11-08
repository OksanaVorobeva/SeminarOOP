package seminar6.solid_5;

public class Car {
    private PetrolEngine engine;

    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start(){
        this.engine.start();
    }
}
