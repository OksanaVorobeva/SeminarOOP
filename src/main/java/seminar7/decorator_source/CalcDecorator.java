package seminar7.decorator_source;

public class CalcDecorator implements ICalculable {
    private ICalculable oldCalc;
    private Logger log;

    public CalcDecorator(ICalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.log = log;
    }

    @Override
    public ICalculable sum(int arg) {
        int firstArg = oldCalc.getResult();
        log.log(String.format("Первое значение калькулятьра. Начало вызова мет"));
        ICalculable result = oldCalc.sum(arg);
        log.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public ICalculable multi(int arg) {
        int firstArg = oldCalc.getResult();
        log.log(String.format("Первое значение калькулятьра. Начало вызова мет"));
        ICalculable result = oldCalc.sum(arg);
        log.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public int getResult() {
        int result = oldCalc.getResult();
        log.log(String.format("Получение результата")+ result);
        return result;
    }
}
