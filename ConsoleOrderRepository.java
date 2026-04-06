public class ConsoleOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        System.out.println("Order saved for " + order.getCustomerName() +
                " at " + order.getAddress() +
                " with total $" + order.getTotal());
    }
}
