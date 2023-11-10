package seminar7.observer_source;

import java.util.Random;

public class Company {
    IPublisher jobAgency;
    String nameCompany;
    Random rnd;
    int maxSalary;

    public Company(IPublisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.rnd = new Random();
        this.maxSalary = maxSalary;
    }

    public void needEmpoyee(){
        int salary =rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany,salary);
    }
}
