package seminar7.decorator_source;

public class Main {
    public static void main(String[] args) {
        //ICalculable calculable=new Calculator(0);
        ICalculable calculable=new CalcDecorator(new Calculator(0),new Logger());
        ViewCalculator viewCalculator=new ViewCalculator(calculable);
        viewCalculator.run();
    }
}
