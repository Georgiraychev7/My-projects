package BookStore;

import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private ShoppingBasket shoppingBasket;

    public User(String name, String surname,ShoppingBasket shoppingBasket) {
        this.name = name;
        this.surname = surname;
        this.shoppingBasket = shoppingBasket;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ShoppingBasket getShoppingCart() {
        return shoppingBasket;
    }

    public void setShoppingCart(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public void addBookToShoppingCart(Book book) {
        shoppingBasket.addBook(book);
    }

    public void printUserInformation(ShoppingBasket shoppingBasket){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(getShoppingCart());
        System.out.println(shoppingBasket.getFullPriceOfTheBooks());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(shoppingBasket, user.shoppingBasket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, shoppingBasket);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", shoppingCart=" + shoppingBasket +
                '}';
    }
}
