package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> list = new ArrayList<>();

    public void addBook(Book book) {
        list.add(book);
    }

    public List<Book> getBookList() {
        return list;
    }

    //tính tổng giá (mỗi loại sách 1 cuốn)
    public double getTotalPrice() {
        double total = 0;
        for (Book book : list) {
            total += book.getPrice();
        }
        return total;
    }

    public void clear() {
        list.clear();
    }
}
