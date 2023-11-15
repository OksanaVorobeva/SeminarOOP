package seminar6.solid_3;

public class Cube implements VolemShare {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }


    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volime() {
        return edge * edge * edge;
    }
}
