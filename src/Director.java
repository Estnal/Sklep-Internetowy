public class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, Addres addres, double salary) {
        super(firstName, lastName, addres, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
