package pamięć_maszyny_wirtualnej6;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Jan";
        employee.lastName = "Kowalski";
        employee.salary = 5000;
        employee.bonus = 500;
        employee.printTotalSalary();
    }
}
