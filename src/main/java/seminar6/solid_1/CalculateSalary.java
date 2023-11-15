package seminar6.solid_1;

public class CalculateSalary {

    public  int calculateNetSalary(Employee employee){

        int tax=(int) (employee.getBaseSalary()*0.25); //calculate in otherway
        return employee.getBaseSalary()-tax;
    }
}
