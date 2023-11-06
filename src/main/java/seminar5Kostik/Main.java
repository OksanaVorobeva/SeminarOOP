package seminar5Kostik;

import seminar5Kostik.model.Service;
import seminar5Kostik.presenter.Presenter;
import seminar5Kostik.view.Console;
import seminar5Kostik.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        Service service = new Service();
        new Presenter(view, service);
        view.start();
    }
}
