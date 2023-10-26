package WashingMachine.ModificationsOfTheWashingMachine;

import WashingMachine.DefaultWashingMachine;

public class WashingMachineWithSpinAndIroningMode extends DefaultWashingMachine {

    // Spin mode
    private String spinMode;
    public String getSpinMode() { return spinMode; }

    // Ironing mode
    private String ironingMode;
    public String getIroningMode() { return ironingMode; }

    // Default constructor
    public  WashingMachineWithSpinAndIroningMode() {
        spinMode    = DEFAULT_STRING;
        ironingMode = DEFAULT_STRING;
    }

    // Constructor with parameters
    public WashingMachineWithSpinAndIroningMode(String manufacturer, String washingMode, String typeOfPowder, String typeOfConditioner, String spinMode, String ironingMode) {
        super(manufacturer, washingMode, typeOfPowder, typeOfConditioner);
        this.spinMode    = spinMode;
        this.ironingMode = ironingMode;
    }

    // Loading the washing machine with default settings
    public void loadWashingMachineWithSpinAndIroningMode(WashingMachineWithSpinAndIroningMode washingMachineWithSpinAndIroningMode) {
        washingMachineWithSpinAndIroningMode.loadDefaultWashingMachine(washingMachineWithSpinAndIroningMode);
        washingMachineWithSpinAndIroningMode.spinMode    = "Enabled";
        washingMachineWithSpinAndIroningMode.ironingMode = "Disabled";
    }

    // We display information about the object in a convenient format
    public void outputWashingMachineWithSpinAndIroningModeInformation(WashingMachineWithSpinAndIroningMode washingMachineWithSpinAndIroningMode) {
        outputDefaultWashingMachineInformation(washingMachineWithSpinAndIroningMode);
        System.out.println("     Spin mode           | " + washingMachineWithSpinAndIroningMode.getSpinMode());
        System.out.println("     ironing mode        | " + washingMachineWithSpinAndIroningMode.getIroningMode());
    }
}