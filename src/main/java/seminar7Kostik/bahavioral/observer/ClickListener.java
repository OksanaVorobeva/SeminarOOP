package seminar7Kostik.bahavioral.observer;

public class ClickListener implements  Observer{
    @Override
    public void update(Button button) {
        System.out.println("Была нажата кнопка"+button.getId());
    }
}
