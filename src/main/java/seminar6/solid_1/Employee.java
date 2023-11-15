package seminar6.solid_1;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmplInfo(){
        return "name-"+name+", dob-"+dob.toString();
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
