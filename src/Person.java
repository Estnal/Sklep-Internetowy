public class Person {
    private String firstName;
    private String lastName;
    private Addres addres;

    public Person(String firstName, String lastName, Addres addres) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addres = addres;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }

    String printInfo(){
        return getFirstName() + ", " + getLastName() + ", " + getAddres().getFullInfo();

    }
}
