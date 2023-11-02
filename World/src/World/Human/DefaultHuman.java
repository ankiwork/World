package World.Human;

abstract class DefaultHuman {

    // Default [STRING] value
    public static final String DEFAULT_STRING = "Default";

    // Human name
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Default constructor
    public DefaultHuman() {
        name = DEFAULT_STRING;
    }

    // Constructor with parameters
    public DefaultHuman(String name) {
        this.name = name;
    }
}