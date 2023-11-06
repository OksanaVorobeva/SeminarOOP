package seminar5Kostik.presenter;

import seminar5Kostik.model.Service;
import seminar5Kostik.view.View;

public class Presenter {
    private seminar5Kostik.view.View view;
    private Service service;

    public Presenter(seminar5Kostik.view.View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addRecord(String record) {
        this.service.addNote(record);
    }

    public void getRecords() {
        String answer = this.service.getNotes();
        this.view.print(answer);
    }


}
