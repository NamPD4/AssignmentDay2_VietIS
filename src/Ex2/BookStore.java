package Ex2;

public class BookStore {
    private BookService bookService;

    public BookStore(BookService bookService) {
        this.bookService = bookService;
    }

    public void processOrder(Customer customer, Cart cart) {

        for (Book book : cart.getBookList()) {
            book.calStock(1);
        }

        Order order = new Order(customer, cart.getBookList());

        //xử lý thanh toán đơn hàng
        if (processPayment(customer, order.getTotalPrice())) {
            System.out.println("Payment successful for customer: " + customer.getName());
        } else {
            System.out.println("Payment failed for customer: " + customer.getName());
            return;
        }

        //gửi mail xác nhận thanh toán thành công
        System.out.println("Sending confirmation email to: " + customer.getEmail());

        //clear giỏ hàng sau khi thanh toán
        cart.clear();
    }

    private boolean processPayment(Customer customer, double totalPrice) {
        System.out.println("Processing payment of $" + totalPrice + " for customer: " + customer.getName());
        return true;
    }

}
