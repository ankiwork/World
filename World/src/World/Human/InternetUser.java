package World.Human;

public class InternetUser extends DefaultHuman {

    // User password
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // User internet status
    private String status;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    // Default constructor
    public InternetUser() {
        password = DEFAULT_STRING;
        status = DEFAULT_STRING;
    }

    // Constructor with parameters
    public InternetUser(String name, String password, String status) {
        super(name);
        this.password = password;
        this.status = status;
    }
}
