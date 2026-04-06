public class Order {
    private final String customerName;
    private final String address;
    private final String email;
    private final double price;
    private final int quantity;
    private double total;

    public Order(String customerName, String address, String email, double price, int quantity) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
