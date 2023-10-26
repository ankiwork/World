package WashingMachine;

import World.World;

public abstract class DefaultWashingMachine extends World {

    // Default [STRING] value
    public static final String DEFAULT_STRING = "Default";

    // Washing mode
    private String washingMode;
    public String getWashingMode() { return washingMode; }

    // Type of powder
    private String typeOfPowder;
    public String getTypeOfPowder() { return typeOfPowder; }

    // Type of conditioner
    private String typeOfConditioner;
    public String getTypeOfConditioner() { return typeOfConditioner; }

    // Default constructor
    public DefaultWashingMachine() {
        washingMode       = DEFAULT_STRING;
        typeOfPowder      = DEFAULT_STRING;
        typeOfConditioner = DEFAULT_STRING;
    }

    // Construct with parameters
    public DefaultWashingMachine(String washingMode, String typeOfPowder, String typeOfConditioner) {
        this.washingMode       = washingMode;
        this.typeOfPowder      = typeOfPowder;
        this.typeOfConditioner = typeOfConditioner;
    }

    // Loading the washing machine with default settings
    public void loadDefaultWashingMachineAutomatically(DefaultWashingMachine defaultWashingMachine) {
        defaultWashingMachine.washingMode       = "Washing with soaking 90 degrees";
        defaultWashingMachine.typeOfPowder      = "Eco powder";
        defaultWashingMachine.typeOfConditioner = "Ammonia free";
    }

    // Load the washing machine manually
    public void loadDefaultWashingMachineManually(DefaultWashingMachine washingMachine) {

    }

    // We display information about the object in a convenient format
    public void outputDefaultWashingMachineInformation(DefaultWashingMachine defaultWashingMachine) {
        System.out.println("     Washing mode        | " + defaultWashingMachine.getWashingMode());
        System.out.println("     Type of powder      | " + defaultWashingMachine.getTypeOfPowder());
        System.out.println("     Type of conditioner | " + defaultWashingMachine.getTypeOfConditioner());
    }
}
