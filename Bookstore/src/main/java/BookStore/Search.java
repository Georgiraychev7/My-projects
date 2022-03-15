package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Search {

    private static List<Book> books = new ArrayList<>();

    public Search(List<Book> books) {
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks(List<Book> books) {
        Search.books = books;
    }

    public Book findBookWithFewestWordsInTitle(List<Book> books) {
        int min = Integer.MAX_VALUE;
        Book result = null;
        for (Book book : books) {
            int length = book.getTitle().length();
            if (length < min) {
                min = length;
                result = book;
            }
        }
        return result;
    }

    public Book searchBookByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookWithCheapestPrice(List<Book>books){
        Book book = books.stream().min((b1, b2) -> Double.compare(b1.getDiscountedPrice(), b2.getDiscountedPrice()))
                .orElse(null);
        return book;
    }

    public Book findThirdCheapestBook(List<Book> books) {
        Book book = books.stream()
                .sorted((b1, b2) -> Double.compare(b1.getDiscountedPrice(), b2.getDiscountedPrice()))
                .skip(2)
                .findFirst()
                .orElseThrow();
        return book;
    }

    public Book findBookWithHighestPrice(List<Book> books) {
        double max = Double.MIN_VALUE;
        Book result = null;
        for (Book book : books) {
            if (book.getPrice() > max) {
                max = book.getPrice();
                result = book;
            }
        }
        return result;
    }

    public Book findBookWithHighestDiscountPrice(List<Book> books) {
        double max = Double.MIN_VALUE;
        Book result = null;
        for (Book book : books) {
            if (book.getDiscountedPrice() > max) {
                max = book.getDiscountedPrice();
                result = book;
            }
        }
        return result;
    }

    public Book findBookWithTheFewestSymbols(List<Book> books) {
        int min = Integer.MAX_VALUE;
        Book result = null;
        for (Book book : books) {
            int length = book.getTitle().toCharArray().length;
            if (length < min) {
                min = length;
                result = book;
            }
        }
        return result;
    }

    public Book searchBookByPrice(List<Book> books, double price) {
        for (Book book : books) {
            if (book.getPrice() == price) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookByDiscountPrice(List<Book> books, double discountPrice) {
        for (Book book : books) {
            if (book.getPrice() == discountPrice) {
                return book;
            }
        }
        return null;
    }

}
