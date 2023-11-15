package seminar6.solid_5;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        this.engine.start();
    }
}
