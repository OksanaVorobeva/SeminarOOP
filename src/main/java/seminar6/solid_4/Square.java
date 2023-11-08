package seminar6.solid_4;

public class Square extends  Rectangle{
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void setWidth(int width) {
       super.width=width;
       super.height=width;
    }

    @Override
    public void setHeight(int height) {
        super.width=height;
        super.height=height;
    }
}
