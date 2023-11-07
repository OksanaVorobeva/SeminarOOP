package seminar5.model;

public class Student extends Person{
    private int idStudent;

    public Student(String name, String surname, int age,int idStudent) {
        super(name, surname, age);
        this.idStudent=idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return super.toString()+" "+idStudent;
    }
}
