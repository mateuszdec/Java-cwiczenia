package lekcja19_polimorfizm.zad1;

class Nurse extends Person {

    private double overtime;

    public Nurse(String firstName, String lastName, double salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", Nadgodzimy: " + overtime;
    }
}
