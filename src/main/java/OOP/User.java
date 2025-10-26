package OOP;

public class User {
    String username;
    String email;
    int age;

    public User(){
        this.username = "Not provided.";
        this.email = "Not provided.";
        this.age = 0;
    }

    public User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
    public User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    public User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
