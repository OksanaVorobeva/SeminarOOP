package seminar6.solid_3;

public class Circle implements  Shape{
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*3.14*radius;
    }

    @Override
    public double volime() {
        throw  new UnsupportedOperationException(){}
    }


}
