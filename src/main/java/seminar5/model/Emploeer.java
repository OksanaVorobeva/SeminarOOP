package seminar5.model;

public class Emploeer extends Person{
    private String special;

    public Emploeer(String name, String surname, int age,String special) {
        super(name, surname, age);
        this.special=special;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ special;
    }
}
