package seminar3_4.studentDomen;

public class Student extends User implements Comparable<Student>{

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
        return "User{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                '}'+idStudent;
    }

    @Override
    public int compareTo(Student o) {

       /* if (this.getIdStudent()==o.getIdStudent()){
            return 0;
        }
        if (this.getIdStudent()<o.getIdStudent()){
            return -1;
        }
        return 1;*/
       /* if (super.getAge()==o.getAge()){
            return 0;
        }
        if (super.getAge()<o.getAge()){
            return -1;
        }
        return 1;*/
        System.out.println(super.getName()+" -"+o.getName());
          if (super.getAge()==o.getAge()){
              if (this.getIdStudent()==o.getIdStudent()){
                  return 0;
              }
              if (this.getIdStudent()<o.getIdStudent()){
                  return -1;
              }
            return 0;
        }
        if (super.getAge()<o.getAge()){
            return -1;
        }
        return 1;
    }
}
