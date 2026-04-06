public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(
                "John Doe",
                "123 Main St",
                "johndoe@example.com",
                10.0,
                2);

        OrderService orderService = new OrderService(
                new SimpleOrderCalculator(),
                new ConsoleOrderRepository(),
                new PdfInvoiceGenerator(),
                new EmailNotificationService());

        orderService.placeOrder(order);

        // Optional behavior can be used only when needed
        orderService.generateInvoice(order, "order_123.pdf");
        orderService.notifyCustomer(order);
    }
}
