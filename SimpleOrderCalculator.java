public class SimpleOrderCalculator implements OrderCalculator {
    @Override
    public double calculateTotal(Order order) {
        return order.getPrice() * order.getQuantity();
    }
}
