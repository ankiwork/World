package World;

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

import WashingMachine.ModificationsOfTheWashingMachine.WashingMachineWithSpinAndIroningMode;

public class World {

    // Default [STRING] value
    public static final String DEFAULT_STRING = "Default";
    
    static int number = 0;

    public static void main(String[] argv) throws IOException {

        String washingMode       = DEFAULT_STRING;
        String typeOfPowder      = DEFAULT_STRING;
        String typeOfConditioner = DEFAULT_STRING;
        String spinMode          = DEFAULT_STRING;
        String ironingMode       = DEFAULT_STRING;

        Scanner scanner = new Scanner(System.in);

        boolean application = true;

        while (application) {

            System.out.print("\nYou are in the main menu, select the operation number\n");
            System.out.print("[1] - Quit the application\n");
            System.out.print("[2] - Testing the Load method\n");
            System.out.print("[3] - Load the washing machine manually\n");
            System.out.print("[4] - Read data from file\n");
            System.out.print("[5] - Write data to file\n");
            System.out.print("Operation number: ");

            int operation = scanner.nextInt();
            scanner.nextLine();

            switch(operation) {

                // Quit the application
                case 1: {

                    application = false;

                    break;
                }

                // Testing the Load method
                case 2: {

                    WashingMachineWithSpinAndIroningMode washingMachineLoad = new WashingMachineWithSpinAndIroningMode();

                    System.out.print("\nWashing machine [BEFORE] filling via load method:\n");
                    washingMachineLoad.outputWashingMachineWithSpinAndIroningModeInformation(washingMachineLoad);

                    washingMachineLoad.loadWashingMachineWithSpinAndIroningMode(washingMachineLoad);

                    System.out.print("\nWashing machine [AFTER] filling via load method:\n");
                    washingMachineLoad.outputWashingMachineWithSpinAndIroningModeInformation(washingMachineLoad);

                    break;
                }

                // Load the washing machine manually
                case 3: {

                    System.out.print("\nFilling the washing machine manually:\n");

                    System.out.print("     Enter washing mode:          ");
                    washingMode = scanner.nextLine();

                    System.out.print("     Enter type of powder:        ");
                    typeOfPowder = scanner.nextLine();

                    System.out.print("     Enter type of conditioner:   ");
                    typeOfConditioner = scanner.nextLine();

                    System.out.print("     Enter washing mode:          ");
                    spinMode = scanner.nextLine();

                    System.out.print("     Enter washing mode:          ");
                    ironingMode = scanner.nextLine();

                    WashingMachineWithSpinAndIroningMode washingMachineData = new WashingMachineWithSpinAndIroningMode(washingMode, typeOfPowder, typeOfConditioner, spinMode, ironingMode);

                    break;
                }

                // Read data from file
                case 4: {

                    break;
                }

                // Writing data to a file
                case 5: {

                    File file = new File("Data.txt");

                    if (file.createNewFile()) { System.out.print("\nThe file was not in the system, the creation of a new one was initialized\n"); }
                    else { System.out.print("\nThe initialized data recording operation was initialized\n"); }

                    FileWriter writer = new FileWriter("Data.txt");

                    writer.write(number            + "\n");
                    writer.write(washingMode       + "\n");
                    writer.write(typeOfPowder      + "\n");
                    writer.write(typeOfConditioner + "\n");
                    writer.write(spinMode          + "\n");
                    writer.write(ironingMode       + "\n");
                    writer.write(                    "\n");

                    writer.close();

                    System.out.print("Data recording complete\n");
                    
                    break;
                }
            }
        } scanner.close();
    }
}
