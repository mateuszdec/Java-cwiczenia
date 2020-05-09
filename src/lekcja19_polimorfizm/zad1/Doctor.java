package lekcja19_polimorfizm.zad1;

class Doctor extends Person{
    private double bonus;

    public Doctor(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", Premia: " + bonus;
    }
}
