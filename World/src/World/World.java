package World;

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

import WashingMachine.ModificationsOfTheWashingMachine.WashingMachineWithSpinAndIroningMode;

public class World {

    // Writing data to a file
    private static FileWriter getFileWriter(int position, WashingMachineWithSpinAndIroningMode[] washingMachines) throws IOException {

        FileWriter writer = new FileWriter("Data.txt");

        for (int i = 0; i < position; i++) {
            writer.write(washingMachines[i].getWashingMode()       + "\n");
            writer.write(washingMachines[i].getTypeOfPowder()      + "\n");
            writer.write(washingMachines[i].getTypeOfConditioner() + "\n");
            writer.write(washingMachines[i].getSpinMode()          + "\n");
            writer.write(washingMachines[i].getIroningMode()       + "\n");
        }
        return writer;
    }

    public static void main(String[] argv) throws IOException {

        // Temporary storage for 100 objects with a counter[POSITION]
        WashingMachineWithSpinAndIroningMode[] washingMachines = new WashingMachineWithSpinAndIroningMode[100];
        int position = 0;

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

                    washingMachineLoad.loadWashingMachineWithSpinAndIroningModeAutomatically(washingMachineLoad);

                    System.out.print("\nWashing machine [AFTER] filling via load method:\n");
                    washingMachineLoad.outputWashingMachineWithSpinAndIroningModeInformation(washingMachineLoad);

                    washingMachines[position] = washingMachineLoad;
                    position++;

                    break;
                }

                // We implement manual loading of the washing machine.
                case 3: {

                    WashingMachineWithSpinAndIroningMode washingMachineManuallyLoad = new WashingMachineWithSpinAndIroningMode();

                    // We display information about the user's location in the washing mode selection menu.
                    System.out.print("\nYou are in the washing mode selection mode.\n");

                    // We display all modes on the screen.
                    System.out.print("     [1] - Sport.\n");
                    System.out.print("     [2] - Short.\n");
                    System.out.print("     [3] - Cotton.\n");
                    System.out.print("     [4] - Standard.\n");

                    // We show a message about the request to enter the mode number.
                    System.out.print("Select the washing mode: ");

                    // Enter the number of the washing mode.
                    int mode = scanner.nextInt();

                    // We implement the choice of washing mode.
                    switch (mode) {

                        // Sport.
                        case 1: {

                            // We display information about the user's location in the washing mode selection menu.
                            System.out.print("\nYou are in the washing mode selection mode.\n");

                            // We display all modes on the screen.
                            System.out.print("          [1] - Sport intensive 30 degrees.\n");
                            System.out.print("          [2] - Sport 30 degrees.\n");
                            System.out.print("          [3] - Sports shoes 30 degrees .\n");

                            // We show a message about the request to enter the mode number.
                            System.out.print("Select the washing mode: ");

                            // Enter the number of the washing mode.
                            mode = scanner.nextInt();

                            // Sport.
                            switch (mode) {

                                // Sport intensive 30 degrees.
                                case 1: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSportIntensive(), washingMachineManuallyLoad.getDefaultThirty());

                                    break;
                                }

                                // Sport 30 degrees.
                                case 2: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSport(), washingMachineManuallyLoad.getDefaultThirty());

                                    break;
                                }

                                // Sports shoes 30 degrees.
                                case 3: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSportShoes(), washingMachineManuallyLoad.getDefaultThirty());

                                    break;
                                }
                            }
                            break;
                        }

                        // Short.
                        case 2: {

                            // We display information about the user's location in the washing mode selection menu.
                            System.out.print("\nYou are in the washing mode selection mode.\n");

                            // We display all modes on the screen.
                            System.out.print("          [1] - Spin.\n");
                            System.out.print("          [2] - Rinsing.\n");
                            System.out.print("          [3] - Draining without pressing.\n");

                            // We show a message about the request to enter the mode number.
                            System.out.print("Select the washing mode: ");

                            // Enter the number of the washing mode.
                            mode = scanner.nextInt();

                            // Sport.
                            switch (mode) {

                                // Spin.
                                case 1: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSpin(), washingMachineManuallyLoad.getDefaultZero());

                                    break;
                                }

                                // Rinsing.
                                case 2: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getRinsing(), washingMachineManuallyLoad.getDefaultZero());

                                    break;
                                }

                                // Draining without pressing.
                                case 3: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getDrainingPressing(), washingMachineManuallyLoad.getDefaultZero());

                                    break;
                                }
                            }
                            break;
                        }

                        // Cotton.
                        case 3: {

                            // We display information about the user's location in the washing mode selection menu.
                            System.out.print("\nYou are in the washing mode selection mode.\n");

                            // We display all modes on the screen.
                            System.out.print("          [1] - Cotton: washing with soaking 90 degrees.\n");
                            System.out.print("          [2] - Cotton: intensive washing 90 degrees.\n");
                            System.out.print("          [3] - Cotton: 60 degrees.\n");
                            System.out.print("          [4] - Cotton: gentle washing 60 degrees.\n");
                            System.out.print("          [5] - Synthetic: intensive washing 60 degrees.\n");
                            System.out.print("          [6] - Synthetic: gentle washing 40 degrees.\n");

                            // We show a message about the request to enter the mode number.
                            System.out.print("Select the washing mode: ");

                            // Enter the number of the washing mode.
                            mode = scanner.nextInt();

                            // Cotton.
                            switch (mode) {

                                // Cotton: washing with soaking 90 degrees.
                                case 1: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonWashingSoaking(), washingMachineManuallyLoad.getDefaultNinety());

                                    break;
                                }

                                // Cotton: intensive washing 90 degrees.
                                case 2: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonIntensiveWashing(), washingMachineManuallyLoad.getDefaultNinety());

                                    break;
                                }

                                // Cotton: 60 degrees.
                                case 3: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonSixty(), washingMachineManuallyLoad.getDefaultSixty());

                                    break;
                                }

                                // Cotton: gentle washing 60 degrees.
                                case 4: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonGentleWashing(), washingMachineManuallyLoad.getDefaultSixty());

                                    break;
                                }

                                // Synthetic: intensive washing 60 degrees.
                                case 5: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSyntheticIntensiveWashing(), washingMachineManuallyLoad.getDefaultSixty());

                                    break;
                                }

                                // Synthetic: gentle washing 40 degrees.
                                case 6: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSyntheticGentleWashing(), washingMachineManuallyLoad.getDefaultForty());

                                    break;
                                }
                            } break;
                        }

                        // Special.
                        case 4: {

                            // We display information about the user's location in the washing mode selection menu.
                            System.out.print("\nYou are in the washing mode selection mode.\n");

                            // We display all modes on the screen.
                            System.out.print("          [1] - Wool 40 degrees.\n");
                            System.out.print("          [2] - Silk 30 degrees.\n");
                            System.out.print("          [3] - Jeans 40 degrees.\n");
                            System.out.print("          [4] - Express 15 degrees.\n");

                            // We show a message about the request to enter the mode number.
                            System.out.print("Select the washing mode: ");

                            // Enter the number of the washing mode.
                            mode = scanner.nextInt();

                            // Special.
                            switch(mode) {

                                // Wool 40 degrees.
                                case 1: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getWool(), washingMachineManuallyLoad.getDefaultForty());

                                    break;
                                }

                                // Silk 30 degrees.
                                case 2: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSilk(), washingMachineManuallyLoad.getDefaultThirty());

                                    break;
                                }

                                // Jeans 40 degrees.
                                case 3: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getJeans(), washingMachineManuallyLoad.getDefaultForty());

                                    break;
                                }

                                // Express 15 degrees.
                                case 4: {

                                    washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getExpress(), washingMachineManuallyLoad.getDefaultFifteen());

                                    break;
                                }
                            } break;
                        }
                    } washingMachines[position] = washingMachineManuallyLoad; position++; break;
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

                    FileWriter writer = getFileWriter(position, washingMachines);

                    writer.close();

                    System.out.print("Data recording complete\n");

                    break;
                }
            }
        } scanner.close();
    }
}
