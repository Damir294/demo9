package src.main.java.com.example.demo;
public class User {
    private String login;
    private String mail;

    public User(String login, String mail) {
        this.login = login;
        this.mail = mail;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getMail() {
        return mail;
    }


}