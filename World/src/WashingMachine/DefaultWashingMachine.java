package WashingMachine;

import World.World;

public abstract class DefaultWashingMachine extends World {

    // Default [STRING] value
    public static final String DEFAULT_STRING = "Default";

    // Washing mode
    private String washingMode;
    public String getWashingMode() {
        return washingMode;
    }
    public void setWashingMode(String washingMode) {
        this.washingMode = washingMode;
    }

    // Washing temperature
    private String washingTemperature;
    public String getWashingTemperature() {
        return washingTemperature;
    }
    public void setWashingTemperature(String washingTemperature) {
        this.washingTemperature = washingTemperature;
    }

    // Type of powder
    private String typeOfPowder;
    public String getTypeOfPowder() {
        return typeOfPowder;
    }
    public void setTypeOfPowder(String typeOfPowder) {
        this.typeOfPowder = typeOfPowder;
    }

    // Type of conditioner
    private String typeOfConditioner;
    public String getTypeOfConditioner() {
        return typeOfConditioner;
    }
    public void setTypeOfConditioner(String typeOfConditioner) {
        this.typeOfConditioner = typeOfConditioner;
    }

    // Default constructor
    public DefaultWashingMachine() {
        washingMode        = DEFAULT_STRING;
        washingTemperature = DEFAULT_STRING;
        typeOfPowder       = DEFAULT_STRING;
        typeOfConditioner  = DEFAULT_STRING;
    }

    // Construct with parameters
    public DefaultWashingMachine(String washingMode, String washingTemperature, String typeOfPowder, String typeOfConditioner) {
        this.washingMode        = washingMode;
        this.washingTemperature = washingTemperature;
        this.typeOfPowder       = typeOfPowder;
        this.typeOfConditioner  = typeOfConditioner;
    }

    // Loading the washing machine with default settings
    public void loadDefaultWashingMachineAutomatically(DefaultWashingMachine defaultWashingMachine) {
        defaultWashingMachine.washingMode        = getCottonWashingSoaking();
        defaultWashingMachine.washingTemperature = getDefaultNinety();
        defaultWashingMachine.typeOfPowder       = getHypoallergenic();
        defaultWashingMachine.typeOfConditioner  = getThickening();
    }

    // We display information about the object in a convenient format
    public void outputDefaultWashingMachineInformation(DefaultWashingMachine defaultWashingMachine) {
        System.out.println("     Washing mode        | " + defaultWashingMachine.getWashingMode());
        System.out.println("     Washing temperature | " + defaultWashingMachine.getWashingTemperature());
        System.out.println("     Type of powder      | " + defaultWashingMachine.getTypeOfPowder());
        System.out.println("     Type of conditioner | " + defaultWashingMachine.getTypeOfConditioner());
    }

    // We display information about the object in a convenient format
    public void outputDefaultWashingMachineInformationAll(DefaultWashingMachine[] defaultWashingMachine, int position) {
        System.out.println("     Washing mode        | " + defaultWashingMachine[position].getWashingMode());
        System.out.println("     Washing temperature | " + defaultWashingMachine[position].getWashingTemperature());
        System.out.println("     Type of powder      | " + defaultWashingMachine[position].getTypeOfPowder());
        System.out.println("     Type of conditioner | " + defaultWashingMachine[position].getTypeOfConditioner());
    }

    // Creating a default variable for all washing modes using a temperature of 0 degrees.
    public final String getDefaultZero() {
        return "0";
    }

    // Creating a default variable for all washing modes using a temperature of 15 degrees.
    public final String getDefaultFifteen() {
        return "15";
    }

    // Creating a default variable for all washing modes using a temperature of 30 degrees.
    public final String getDefaultThirty() {
        return "30";
    }

    // Creating a default variable for all washing modes using a temperature of 40 degrees.
    public final String getDefaultForty() {
        return "40";
    }

    // Creating a default variable for all washing modes using a temperature of 60 degrees.
    public final String getDefaultSixty() {
        return "60";
    }

    // Creating a default variable for all washing modes using a temperature of 90 degrees.
    public final String getDefaultNinety() {
        return "90";
    }

    // Washing mode
    // =========================================================================================================================
    // | Standard                                | Special            | Sport                      | Short                     |
    // =========================================================================================================================
    // | Cotton: washing with soaking 90 degrees | Wool 40 degrees    | Sport intensive 30 degrees | Rinsing                   |
    // =========================================================================================================================
    // | Cotton: intensive washing 90 degrees    | Silk 30 degrees    | Sport 30 degrees           | Spin                      |
    // =========================================================================================================================
    // | Cotton: 60 degrees                      | Jeans 40 degrees   | Sports shoes 30 degrees    | Draining without pressing |
    // =========================================================================================================================
    // | Cotton: gentle washing 60 degrees       | Express 15 degrees |                            |                           |
    // =========================================================================================================================
    // | Synthetic: intensive washing 60 degrees |                    |                            |                           |
    // =========================================================================================================================
    // | Synthetics: gentle washing 40 degrees   |                    |                            |                           |
    // =========================================================================================================================

    // Cotton: washing with soaking 90 degrees.
    public String getCottonWashingSoaking() {
        return "Cotton: Washing with soaking";
    }

    // Cotton: intensive washing 90 degrees.
    public String getCottonIntensiveWashing() {
        return "Cotton: Intensive washing";
    }

    // Cotton: 60 degrees.
    public String getCottonSixty() {
        return "Cotton";
    }

    // Cotton: gentle washing 60 degrees.
    public String getCottonGentleWashing() {
        return "Cotton: gentle washing";
    }

    // Synthetic: intensive washing 60 degrees.
    public String getSyntheticIntensiveWashing() {
        return "Synthetic: intensive washing";
    }

    // Synthetics: gentle washing 40 degrees.
    public String getSyntheticGentleWashing() {
        return "Synthetics: gentle washing";
    }

    // Wool 40 degrees.
    public String getWool() {
        return "Wool";
    }

    // Silk 30 degrees.
    public String getSilk() {
        return "Silk";
    }

    // Jeans 40 degrees.
    public String getJeans() {
        return "Jeans";
    }

    // Express 15 degrees.
    public String getExpress() {
        return "Express";
    }

    // Sport intensive 30 degrees.
    public String getSportIntensive() {
        return "Sport intensive";
    }

    // Sport 30 degrees.
    public String getSport() {
        return "Sport";
    }

    // Sports shoes 30 degrees.
    public String getSportShoes() {
        return "Sport shoes";
    }

    // Rinsing.
    public String getRinsing() {
        return "Rinsing";
    }

    // Spin.
    public String getSpin() {
        return "Spin";
    }

    // Draining without pressing.
    public String getDrainingPressing() {
        return "Draining without pressing";
    }

    // We create a function so as not to repeat the logic of the code 100 times, from the principles of don't repeat yourself.
    public void setWashingModeDRY(DefaultWashingMachine washingMachine, String defaultWashingMachineMode, String defaultWashingMachineTemperature) {

        // We set the final washing mode.
        this.washingMode = defaultWashingMachineMode;

        // We set the final washing temperature.
        this.washingTemperature = defaultWashingMachineTemperature;
    }

    // Type of powder
    // ==================
    // | Hypoallergenic |
    // ==================
    // | Powdered       |
    // ==================
    // | Gels           |
    // ==================
    // | Capsules       |
    // ==================
    // | Plates         |
    // ==================

    // Hypoallergenic
    public final String getHypoallergenic() {
        return "Hypoallergenic";
    }

    // Powdered
    public final String getPowdered() {
        return "Powdered";
    }

    // Gels
    public final String getGels() {
        return "Gels";
    }

    // Capsules
    public final String getCapsules() {
        return "Capsules";
    }

    // Plates
    public final String getPlates() {
        return "Plates";
    }

    // Type of conditioner
    // ==================
    // | Thickening     |
    // ==================
    // | Deep           |
    // ==================
    // | Cream          |
    // ==================
    // | Protein        |
    // ==================
    // | Moisturizing   |
    // ==================

    // Thickening
    public final String getThickening() {
        return "Thickening";
    }

    // Deep
    public final String getDeep() {
        return "Deep";
    }

    // Cream
    public final String getCream() {
        return "Cream";
    }

    // Protein
    public final String getProtein() {
        return "Protein";
    }

    // Moisturizing
    public final String getMoisturizing() {
        return "Moisturizing";
    }
}
