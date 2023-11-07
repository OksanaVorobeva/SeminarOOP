package seminar7Kostik.bahavioral.chain;

public class SimpleNotifier extends Notifier{
    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Пишем в логи: "+message);
    }
}
