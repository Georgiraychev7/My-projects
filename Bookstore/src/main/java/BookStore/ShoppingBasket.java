package BookStore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShoppingBasket {

    private Map<Book, Integer> books = new HashMap<>();

    public ShoppingBasket() {

    }

    public void setQuantity(Book book,int quantity){
        books.put(book,quantity);
    }

    public void addBook(Book book) {
        books.putIfAbsent(book,0);{
            books.put(book, books.get(book) + 1);
        }
    }

    public double getFullPriceOfTheBooks() {
        double fullPrice = 0;
        for (Book book : books.keySet()) {
            fullPrice += book.getPrice()*books.get(book);
        }
        return fullPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingBasket that = (ShoppingBasket) o;
        return Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "books=" + books +
                '}';
    }
}
