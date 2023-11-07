package seminar7Kostik.bahavioral.chain;

public class Main {
    public static void main(String[] args) {
        Notifier simplNotifier=new SimpleNotifier(1);
        Notifier emailNotifier = new EmailNotifier(2);
        Notifier smsNotifier= new SMSNotifier(3);

        simplNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simplNotifier.manage("Все в порядке",1);
        simplNotifier.manage("Что-то пошло не так",2);
        simplNotifier.manage("Все плохо",3);
    }
}
