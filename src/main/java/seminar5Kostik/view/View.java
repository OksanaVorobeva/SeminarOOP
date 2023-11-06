package seminar5Kostik.view;

import seminar5Kostik.presenter.Presenter;

public interface View {
    void print(String var1);

    void start();

    void setPresenter(Presenter var1);
}
