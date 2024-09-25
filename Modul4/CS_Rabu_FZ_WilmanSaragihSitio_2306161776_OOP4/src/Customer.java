public class Customer {
    public String name;
    public String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return String.format("Customer Name: %s\nCustomer ID: %s", name, customerId);
    }
}
