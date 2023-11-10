package seminar7.observer_source;

public class Main {
    public static void main(String[] args) {
        IPublisher jobAgency= new JobAgency();

        Company google = new Company(jobAgency,"Google",50);
        Company geekBrains= new Company(jobAgency,"GB",100);

        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("Sidorov");

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        for (int i = 0; i < 10; i++) {
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }

    }
}
