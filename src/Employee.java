public class Employee extends Person {

    private double salary;

    public Employee(String firstName, String lastName, Addres addres, double salary) {
        super(firstName, lastName, addres);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    String printInfo() {
        return getFirstName() + ", " + getLastName() + ", " + getAddres().getFullInfo();
    }
}
