package aggregation;

public class Address {

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private String city;

    public String getStreet() {
        return street;
    }

    private String street;
}
