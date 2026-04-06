public class OrderService {
    private final OrderCalculator calculator;
    private final OrderRepository repository;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationService notificationService;

    public OrderService(OrderCalculator calculator,
                        OrderRepository repository,
                        InvoiceGenerator invoiceGenerator,
                        NotificationService notificationService) {
        this.calculator = calculator;
        this.repository = repository;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationService = notificationService;
    }

    public void placeOrder(Order order) {
        double total = calculator.calculateTotal(order);
        order.setTotal(total);
        repository.save(order);
    }

    public void generateInvoice(Order order, String fileName) {
        invoiceGenerator.generateInvoice(order, fileName);
    }

    public void notifyCustomer(Order order) {
        String subject = "Your order is confirmed";
        String body = "Hi " + order.getCustomerName() +
                ", your order total is $" + order.getTotal();
        notificationService.sendEmail(order.getEmail(), subject, body);
    }
}
