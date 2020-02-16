package klasy_i_obiekty2.zad1;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Jan";
        employee.lastName = "Kowalski";
        employee.birthYear = 1987;
        employee.seniority = 4;

        Employee employee1 = new Employee();
        employee1.firstName = "Maria";
        employee1.lastName = "Nowak";
        employee1.birthYear = 1992;
        employee1.seniority = 2;

        Employee employee2 = new Employee();
        employee2.firstName = "Marian";
        employee2.lastName = "Kozłowski";
        employee2.birthYear = 1999;
        employee2.seniority = 2;

        System.out.println("Pracownicy firmyL ");
        System.out.println(employee.firstName + " " + employee.lastName + ", ur. " + employee.birthYear + ", staż: "
                + employee.seniority + " lata");
        System.out.println(employee1.firstName + " " + employee1.lastName + ", ur. " + employee1.birthYear + ", staż: "
                + employee1.seniority + " lata");
        System.out.println(employee2.firstName + " " + employee2.lastName + ", ur. " + employee2.birthYear + ", staż: "
                + employee2.seniority + " lata");
    }
}
