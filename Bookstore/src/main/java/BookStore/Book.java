package BookStore;

import java.util.Objects;

public class Book {

    private String title;
    private double price;
    private double discountedPrice;
    private boolean isPrime;

    public Book(String title, double price, double discountedPrice, boolean isPrime) {
        this.title = title;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.isPrime = isPrime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Double.compare(book.discountedPrice, discountedPrice) == 0 && isPrime == book.isPrime && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, discountedPrice, isPrime);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", discountedPrice=" + discountedPrice +
                ", isPrime=" + isPrime +
                '}';
    }
}
