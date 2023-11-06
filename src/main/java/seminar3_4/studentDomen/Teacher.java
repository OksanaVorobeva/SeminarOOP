package seminar3_4.studentDomen;

public class Teacher extends User{
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

    public void setItem(String item) {
        this.item = item;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                '}'+item+idTeacher;
    }
}
