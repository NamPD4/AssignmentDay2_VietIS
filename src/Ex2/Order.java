package Ex2;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Book> books;
    private double totalPrice;

    public Order(Customer customer, List<Book> books) {
        this.customer = customer;
        this.books = books;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }
}
