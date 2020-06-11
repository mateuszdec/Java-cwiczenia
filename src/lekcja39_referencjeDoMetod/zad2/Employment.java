package lekcja39_referencjeDoMetod.zad2;

enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;

    boolean checkEmployeeEmployment(Employee employee) {
        return this == employee.getEmployment();
    }
}
