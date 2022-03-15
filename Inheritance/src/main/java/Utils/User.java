package Utils;

public class User {

    private String userName;
    private String password;
    private boolean isLoggedIn;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
    public User(){
        this.userName = "Ivan";
        this.password = "12345";
        this.isLoggedIn = false;
    }
}
