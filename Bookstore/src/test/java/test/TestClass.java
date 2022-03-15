package test;

import BookStore.Book;
import BookStore.Search;
import BookStore.ShoppingBasket;
import BookStore.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class TestClass {

    LinkedList<Book> store = new LinkedList<>();
    Search search = new Search(store);


    @BeforeTest
    public void listWithBooks() {

        Book b1 = new Book("Lord of the Rings Fellowship of the ring", 100, 50, true);
        Book b2 = new Book("Lord of the Rings Two Towers", 50, 35, true);
        Book b3 = new Book("Lord of the Rings Return of the King", 50, 30, true);
        Book b4 = new Book("Harry Potter", 70, 60, true);
        Book b5 = new Book("Meri Popins", 50, 20, true);
        Book b6 = new Book("Game of thrones", 80, 40, true);
        Book b7 = new Book("Game of thrones Clash of Kings", 50, 10, true);
        Book b8 = new Book("Game of thrones A Storm of Swords", 50, 15, true);
        Book b9 = new Book("Game of thrones A feast of crows", 50, 25, true);
        Book b10 = new Book("Game of thrones Dance with dragons", 30, 5, true);

        store.add(b1);
        store.add(b2);
        store.add(b3);
        store.add(b4);
        store.add(b5);
        store.add(b6);
        store.add(b7);
        store.add(b8);
        store.add(b9);
        store.add(b10);
    }

    @Test
    public void test(){

        Book bookWithCheapestPrice = search.findBookWithCheapestPrice(store);
        System.out.println(bookWithCheapestPrice);

        Book thirdCheapestBook = search.findThirdCheapestBook(store);
        System.out.println(thirdCheapestBook);

        Book searchBookByTitle = search.searchBookByTitle(store,"Meri Popins");
        System.out.println(searchBookByTitle);

    }

    @Test
    public void shoppingCart() {

        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Book bookWithTheFewestSymbols = search.findBookWithTheFewestSymbols(store);
        shoppingBasket.addBook(bookWithTheFewestSymbols);
        Book bookWithHighestPrice = search.findBookWithHighestPrice(store);
        shoppingBasket.addBook(bookWithHighestPrice);
        shoppingBasket.setQuantity(bookWithHighestPrice,3);
        System.out.println(shoppingBasket.getFullPriceOfTheBooks());
    }

    @Test
    public void newUsers() {

        ShoppingBasket shoppingBasketFirstUser = new ShoppingBasket();
        User firstUser = new User("Georgi","Ivanov",shoppingBasketFirstUser);
        ShoppingBasket shoppingBasketSecondUser = new ShoppingBasket();
        User secondUser = new User("Ivan","Ivanov",shoppingBasketSecondUser);
        Book bookWithCheapestPrice = search.findBookWithCheapestPrice(store);
        Book bookWithHighestDiscountPrice = search.findBookWithHighestDiscountPrice(store);
        firstUser.addBookToShoppingCart(bookWithCheapestPrice);
        firstUser.addBookToShoppingCart(bookWithHighestDiscountPrice);
        firstUser.printUserInformation(shoppingBasketFirstUser);
        Book bookWithTheFewestSymbols = search.findBookWithTheFewestSymbols(store);
        secondUser.addBookToShoppingCart(bookWithTheFewestSymbols);
        shoppingBasketSecondUser.setQuantity(bookWithTheFewestSymbols,5);
        shoppingBasketSecondUser.getFullPriceOfTheBooks();
        secondUser.printUserInformation(shoppingBasketSecondUser);
    }
}
