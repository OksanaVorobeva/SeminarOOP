package seminar5.model;

public class Teacher extends Person{
    private String item;
    private int idTeacher;

    public Teacher(String name, String surname, int age,String item,int idTeacher) {
        super(name, surname, age);
        this.item=item;
        this.idTeacher=idTeacher;
    }

    public String getItem() {
        return item;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ item+idTeacher;
    }
}
