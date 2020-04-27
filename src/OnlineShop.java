public class OnlineShop {
    public static void main(String[] args) {

        Addres addres =  new Addres("Wrocław","Podwale", "62A","316" );
        Customer customer =  new Customer("Andzrej","Kowalski",addres, 5000);
        System.out.println(customer.printInfo()+ "zakupy na kwotę: " + customer.getTotalPayments());

        Employee employee =  new Employee("Mateusz","Woźniak", addres, 7000);
        System.out.println(employee.printInfo() + "wypłata: " + employee.getSalary());

    }
}
