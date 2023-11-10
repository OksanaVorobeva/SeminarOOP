package seminar7.decorator_source;

public interface ICalculable {
    ICalculable sum(int arg);
    ICalculable multi(int arg);
    int getResult();

}
