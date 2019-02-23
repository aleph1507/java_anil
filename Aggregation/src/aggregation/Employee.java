package aggregation;

public class Employee {

    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("id: " + id + "\nname:" + name + "\nCity: " + address.getCity() + "\nstreet: " + address.getStreet());
    }

    public static void main(String[] args) {
        Address a = new Address("Delhi", "Khrishna 3");
        Employee e = new Employee(1, "Anil", a);

        e.display();
    }
}
