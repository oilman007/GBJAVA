package HM3;

public class User {
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String login = "";
    public String password = "";
    public Basket basket = new Basket();
}
