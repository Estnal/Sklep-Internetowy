public class Customer extends Person {

    private double totalPayments;

    public Customer(String firstName, String lastName, Addres addres, double totalPayments) {
        super(firstName, lastName, addres);
        this.totalPayments = totalPayments;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }
    @Override
    String printInfo(){
        return getFirstName() + ", " + getLastName() + ", " + getAddres().getFullInfo();
    }
}
