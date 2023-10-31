package WashingMachine.ModificationsOfTheWashingMachine;

import WashingMachine.DefaultWashingMachine;

public class WashingMachineWithSpinAndIroningMode extends DefaultWashingMachine {

    // Spin mode
    private String spinMode;
    public String getSpinMode() { return spinMode; }
    public void setSpinMode(String spinMode) {
        this.spinMode = spinMode;
    }

    // Ironing mode
    private String ironingMode;
    public String getIroningMode() { return ironingMode; }
    public void setIroningMode(String ironingMode) {
        this.ironingMode = ironingMode;
    }

    // Default constructor
    public  WashingMachineWithSpinAndIroningMode() {
        spinMode    = DEFAULT_STRING;
        ironingMode = DEFAULT_STRING;
    }

    // Constructor with parameters
    public WashingMachineWithSpinAndIroningMode(String washingMode, String washingTemperature, String typeOfPowder, String typeOfConditioner, String spinMode, String ironingMode) {
        super(washingMode, washingTemperature, typeOfPowder, typeOfConditioner);
        this.spinMode    = spinMode;
        this.ironingMode = ironingMode;
    }

    // Loading the washing machine with default settings
    public void loadWashingMachineWithSpinAndIroningModeAutomatically(WashingMachineWithSpinAndIroningMode washingMachineWithSpinAndIroningMode) {
        washingMachineWithSpinAndIroningMode.loadDefaultWashingMachineAutomatically(washingMachineWithSpinAndIroningMode);
        washingMachineWithSpinAndIroningMode.spinMode    = getDisabled();
        washingMachineWithSpinAndIroningMode.ironingMode = getDisabled();
    }

    // We display information about the object in a convenient format
    public void outputWashingMachineWithSpinAndIroningModeInformation(WashingMachineWithSpinAndIroningMode washingMachineWithSpinAndIroningMode) {
        outputDefaultWashingMachineInformation(washingMachineWithSpinAndIroningMode);
        System.out.println("     Spin mode           | " + washingMachineWithSpinAndIroningMode.getSpinMode());
        System.out.println("     ironing mode        | " + washingMachineWithSpinAndIroningMode.getIroningMode());
    }

    // We display information about the object in a convenient format
    public void outputWashingMachineWithSpinAndIroningModeInformationAll(WashingMachineWithSpinAndIroningMode[] washingMachineWithSpinAndIroningMode, int position) {
        outputDefaultWashingMachineInformationAll(washingMachineWithSpinAndIroningMode, position);
        System.out.println("     Spin mode           | " + washingMachineWithSpinAndIroningMode[position].getSpinMode());
        System.out.println("     ironing mode        | " + washingMachineWithSpinAndIroningMode[position].getIroningMode());
    }

    // Enabled
    public final String getEnabled() {
        return "Enabled";
    }

    // Disabled
    public final String getDisabled() {
        return "Disabled";
    }
}
