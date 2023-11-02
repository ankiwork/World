package World;

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;

import WashingMachine.ModificationsOfTheWashingMachine.WashingMachineWithSpinAndIroningMode;

public class World {

    // Writing data to a file
    private static FileWriter getFileWriter(WashingMachineWithSpinAndIroningMode[] washingMachines, int position) throws IOException {

        FileWriter writer = new FileWriter("Data.txt");

        for (int i = 0; i < position; i++) {
            writer.write(washingMachines[i].getWashingMode()        + "\n");
            writer.write(washingMachines[i].getWashingTemperature() + "\n");
            writer.write(washingMachines[i].getTypeOfPowder()       + "\n");
            writer.write(washingMachines[i].getTypeOfConditioner()  + "\n");
            writer.write(washingMachines[i].getSpinMode()           + "\n");
            writer.write(washingMachines[i].getIroningMode()        + "\n");
        }
        return writer;
    }

    public static void main(String[] argv) throws IOException {

        File settings = new File("Settings.txt");

        // Checking for the presence of a file and creating it otherwise
        if (settings.createNewFile()) { System.out.print("\nThe file was not in the system and was created automatically, fill it with settings\n"); }
        else { System.out.println("\nThe file has been successfully opened, checking for non-emptiness has begun"); }

        // Checking for the presence of a settings file
        if (settings.length() == 0) {

            System.out.println("Settings not found, fill the settings file with parameters");
        } else {

            System.out.println("Data detected, reading complete");

            // Reading parameters and applying to code
            BufferedReader settingsReader = new BufferedReader(new FileReader("Settings.txt"));
            String settingsLine = settingsReader.readLine();



            // Считать файл




            settingsReader.close();






            // Применить настройки, скорее всего через свитч, думаю проще будет





            // Temporary storage for 100 objects with a counter[POSITION]
            WashingMachineWithSpinAndIroningMode[] washingMachines = new WashingMachineWithSpinAndIroningMode[100];
            WashingMachineWithSpinAndIroningMode washingMachine = new WashingMachineWithSpinAndIroningMode();
            int position = 0;

            Scanner scanner = new Scanner(System.in);

            boolean application = true;

            while (application) {

                System.out.print("You are in the main menu, select the operation number:\n");
                System.out.print("[1] - Quit the application.\n");
                System.out.print("[2] - Testing the Load method.\n");
                System.out.print("[3] - Load the washing machine manually.\n");
                System.out.print("[4] - Output all position.\n");
                System.out.print("[5] - Read data from file.\n");
                System.out.print("[6] - Write data to file.\n");
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

                        System.out.print("\n     Washing machine [BEFORE] filling via load method:\n");
                        washingMachineLoad.outputWashingMachineWithSpinAndIroningModeInformation(washingMachineLoad);

                        washingMachineLoad.loadWashingMachineWithSpinAndIroningModeAutomatically(washingMachineLoad);

                        System.out.print("\n     Washing machine [AFTER] filling via load method:\n");
                        washingMachineLoad.outputWashingMachineWithSpinAndIroningModeInformation(washingMachineLoad);

                        washingMachines[position] = washingMachineLoad;
                        position++;

                        System.out.println();

                        break;
                    }

                    // We implement manual loading of the washing machine
                    case 3: {

                        WashingMachineWithSpinAndIroningMode washingMachineManuallyLoad = new WashingMachineWithSpinAndIroningMode();

                        // We display information about the user's location in the washing mode selection menu
                        System.out.print("\n     You are in the washing mode selection mode.\n");

                        // We display all modes on the screen
                        System.out.print("     [1] - Sport.\n");
                        System.out.print("     [2] - Short.\n");
                        System.out.print("     [3] - Standard.\n");
                        System.out.print("     [4] - Special.\n");

                        // We show a message about the request to enter the mode number
                        System.out.print("     Select the washing mode: ");

                        // Enter the number of the washing mode
                        operation = scanner.nextInt();

                        // We implement the choice of washing mode
                        switch (operation) {

                            // Sport
                            case 1: {

                                // We display information about the user's location in the washing mode selection menu
                                System.out.print("\n          You are in the washing mode selection mode.\n");

                                // We display all modes on the screen
                                System.out.print("          [1] - Sport intensive 30 degrees.\n");
                                System.out.print("          [2] - Sport 30 degrees.\n");
                                System.out.print("          [3] - Sports shoes 30 degrees .\n");

                                // We show a message about the request to enter the mode number
                                System.out.print("          Select the washing mode: ");

                                // Enter the number of the washing mode
                                operation = scanner.nextInt();

                                // Sport
                                switch (operation) {

                                    // Sport intensive 30 degrees
                                    case 1: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSportIntensive(), washingMachineManuallyLoad.getDefaultThirty());

                                        break;
                                    }

                                    // Sport 30 degrees
                                    case 2: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSport(), washingMachineManuallyLoad.getDefaultThirty());

                                        break;
                                    }

                                    // Sports shoes 30 degrees
                                    case 3: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSportShoes(), washingMachineManuallyLoad.getDefaultThirty());

                                        break;
                                    }
                                }
                                break;
                            }

                            // Short
                            case 2: {

                                // We display information about the user's location in the washing mode selection menu
                                System.out.print("\n          You are in the washing mode selection mode.\n");

                                // We display all modes on the screen
                                System.out.print("          [1] - Spin.\n");
                                System.out.print("          [2] - Rinsing.\n");
                                System.out.print("          [3] - Draining without pressing.\n");

                                // We show a message about the request to enter the mode number.
                                System.out.print("          Select the washing mode: ");

                                // Enter the number of the washing mode
                                operation = scanner.nextInt();

                                // Sport.
                                switch (operation) {

                                    // Spin
                                    case 1: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSpin(), washingMachineManuallyLoad.getDefaultZero());

                                        break;
                                    }

                                    // Rinsing
                                    case 2: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getRinsing(), washingMachineManuallyLoad.getDefaultZero());

                                        break;
                                    }

                                    // Draining without pressing
                                    case 3: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getDrainingPressing(), washingMachineManuallyLoad.getDefaultZero());

                                        break;
                                    }
                                }
                                break;
                            }

                            // Standard
                            case 3: {

                                // We display information about the user's location in the washing mode selection menu
                                System.out.print("\n          You are in the washing mode selection mode.\n");

                                // We display all modes on the screen
                                System.out.print("          [1] - Cotton: washing with soaking 90 degrees.\n");
                                System.out.print("          [2] - Cotton: intensive washing 90 degrees.\n");
                                System.out.print("          [3] - Cotton: 60 degrees.\n");
                                System.out.print("          [4] - Cotton: gentle washing 60 degrees.\n");
                                System.out.print("          [5] - Synthetic: intensive washing 60 degrees.\n");
                                System.out.print("          [6] - Synthetic: gentle washing 40 degrees.\n");

                                // We show a message about the request to enter the mode number
                                System.out.print("          Select the washing mode: ");

                                // Enter the number of the washing mode
                                operation = scanner.nextInt();

                                // Standard
                                switch (operation) {

                                    // Cotton: washing with soaking 90 degrees
                                    case 1: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonWashingSoaking(), washingMachineManuallyLoad.getDefaultNinety());

                                        break;
                                    }

                                    // Cotton: intensive washing 90 degrees
                                    case 2: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonIntensiveWashing(), washingMachineManuallyLoad.getDefaultNinety());

                                        break;
                                    }

                                    // Cotton: 60 degrees
                                    case 3: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonSixty(), washingMachineManuallyLoad.getDefaultSixty());

                                        break;
                                    }

                                    // Cotton: gentle washing 60 degrees
                                    case 4: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getCottonGentleWashing(), washingMachineManuallyLoad.getDefaultSixty());

                                        break;
                                    }

                                    // Synthetic: intensive washing 60 degrees
                                    case 5: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSyntheticIntensiveWashing(), washingMachineManuallyLoad.getDefaultSixty());

                                        break;
                                    }

                                    // Synthetic: gentle washing 40 degrees
                                    case 6: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSyntheticGentleWashing(), washingMachineManuallyLoad.getDefaultForty());

                                        break;
                                    }
                                } break;
                            }

                            // Special
                            case 4: {

                                // We display information about the user's location in the washing mode selection menu
                                System.out.print("\n          You are in the washing mode selection mode.\n");

                                // We display all modes on the screen
                                System.out.print("          [1] - Wool 40 degrees.\n");
                                System.out.print("          [2] - Silk 30 degrees.\n");
                                System.out.print("          [3] - Jeans 40 degrees.\n");
                                System.out.print("          [4] - Express 15 degrees.\n");

                                // We show a message about the request to enter the mode number
                                System.out.print("          Select the washing mode: ");

                                // Enter the number of the washing mode
                                operation = scanner.nextInt();

                                // Special
                                switch(operation) {

                                    // Wool 40 degrees
                                    case 1: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getWool(), washingMachineManuallyLoad.getDefaultForty());

                                        break;
                                    }

                                    // Silk 30 degrees
                                    case 2: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getSilk(), washingMachineManuallyLoad.getDefaultThirty());

                                        break;
                                    }

                                    // Jeans 40 degrees
                                    case 3: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getJeans(), washingMachineManuallyLoad.getDefaultForty());

                                        break;
                                    }

                                    // Express 15 degrees
                                    case 4: {

                                        washingMachineManuallyLoad.setWashingModeDRY(washingMachineManuallyLoad, washingMachineManuallyLoad.getExpress(), washingMachineManuallyLoad.getDefaultFifteen());

                                        break;
                                    }
                                } break;
                            }
                        }

                        // We display information about the user's location in the type of powder menu selection
                        System.out.print("\n     You are in the type of powder menu selection.\n");

                        // We display all types of powder on the screen
                        System.out.print("     [1] - Hypoallergenic.\n");
                        System.out.print("     [2] - Powdered.\n");
                        System.out.print("     [3] - Gels.\n");
                        System.out.print("     [4] - Capsules.\n");
                        System.out.print("     [5] - Plates.\n");

                        // We show a message about the request to enter the type of powder number
                        System.out.print("     Select the type of powder: ");

                        // Enter the number of the type of powder
                        operation = scanner.nextInt();

                        // Type of powder
                        switch (operation) {

                            // Hypoallergenic
                            case 1: {

                                washingMachineManuallyLoad.setTypeOfPowder(washingMachineManuallyLoad.getHypoallergenic());

                                break;
                            }

                            // Powdered
                            case 2: {

                                washingMachineManuallyLoad.setTypeOfPowder(washingMachineManuallyLoad.getPowdered());

                                break;
                            }

                            // Gels
                            case 3: {

                                washingMachineManuallyLoad.setTypeOfPowder(washingMachineManuallyLoad.getGels());

                                break;
                            }

                            // Capsules
                            case 4: {

                                washingMachineManuallyLoad.setTypeOfPowder(washingMachineManuallyLoad.getCapsules());

                                break;
                            }

                            // Plates
                            case 5: {

                                washingMachineManuallyLoad.setTypeOfPowder(washingMachineManuallyLoad.getPlates());

                                break;
                            }
                        }

                        // We display information about the user's location in the type of conditioner menu selection
                        System.out.print("\n     You are in the type of conditioner menu selection.\n");

                        // We display all types of conditioner on the screen
                        System.out.print("     [1] - Thickening.\n");
                        System.out.print("     [2] - Deep.\n");
                        System.out.print("     [3] - Cream.\n");
                        System.out.print("     [4] - Protein.\n");
                        System.out.print("     [5] - Moisturizing.\n");

                        // We show a message about the request to enter the type of conditioner number
                        System.out.print("     Select the type of conditioner: ");

                        // Enter the number of the type of conditioner
                        operation = scanner.nextInt();

                        // Type of conditioner
                        switch (operation) {

                            // Thickening
                            case 1: {

                                washingMachineManuallyLoad.setTypeOfConditioner(washingMachineManuallyLoad.getThickening());

                                break;
                            }

                            // Deep
                            case 2: {

                                washingMachineManuallyLoad.setTypeOfConditioner(washingMachineManuallyLoad.getDeep());

                                break;
                            }

                            // Cream
                            case 3: {

                                washingMachineManuallyLoad.setTypeOfConditioner(washingMachineManuallyLoad.getCream());

                                break;
                            }

                            // Protein
                            case 4: {

                                washingMachineManuallyLoad.setTypeOfConditioner(washingMachineManuallyLoad.getProtein());

                                break;
                            }

                            // Moisturizing
                            case 5: {

                                washingMachineManuallyLoad.setTypeOfConditioner(washingMachineManuallyLoad.getMoisturizing());

                                break;
                            }
                        }

                        // We display information about the user's location in spin mode menu selection
                        System.out.print("\n     You are in spin mode menu selection.\n");

                        // We display all types of conditioner on the screen
                        System.out.print("     [1] - Enabled.\n");
                        System.out.print("     [2] - Disabled.\n");

                        // We show a message about the request to enter the type of conditioner number
                        System.out.print("     Select the spin mode: ");

                        // Enter the number of spin mode
                        operation = scanner.nextInt();

                        // Spin mode
                        switch(operation) {

                            // Enabled
                            case 1: {

                                washingMachineManuallyLoad.setSpinMode(washingMachineManuallyLoad.getEnabled());

                                break;
                            }

                            // Disabled
                            case 2: {

                                washingMachineManuallyLoad.setSpinMode(washingMachineManuallyLoad.getDisabled());

                                break;
                            }
                        }

                        // We display information about the user's location in spin mode menu selection
                        System.out.print("\n     You are in ironing mode menu selection.\n");

                        // We display all types of conditioner on the screen
                        System.out.print("     [1] - Enabled.\n");
                        System.out.print("     [2] - Disabled.\n");

                        // We show a message about the request to enter the type of conditioner number
                        System.out.print("     Select the ironing mode: ");

                        // Enter the number of spin mode
                        operation = scanner.nextInt();

                        // Spin mode
                        switch(operation) {

                            // Enabled
                            case 1: {

                                washingMachineManuallyLoad.setIroningMode(washingMachineManuallyLoad.getEnabled());

                                break;
                            }

                            // Disabled
                            case 2: {

                                washingMachineManuallyLoad.setIroningMode(washingMachineManuallyLoad.getDisabled());

                                break;
                            }
                        } washingMachines[position] = washingMachineManuallyLoad; position++; System.out.println(); break;
                    }

                    // We display all objects on the screen to the user.
                    case 4: {

                        if (position < 1) {

                            System.out.println("\nNo objects have been added yet\n");
                        } else {

                            System.out.println();

                            // We go through all the created objects
                            for (int i = 0; i < position; i++) {

                                // Displaying information about the object
                                washingMachine.outputWashingMachineWithSpinAndIroningModeInformationAll(washingMachines, i);
                                System.out.println();
                            }
                        } break;
                    }

                    // Read data from file
                    case 5: {

                        BufferedReader dataReader = new BufferedReader(new FileReader("Data.txt"));
                        String dataLine = dataReader.readLine();

                        // Display a message to the user about the start of data reading
                        System.out.println("\nData reading initiated");

                        // Reading data to a file, while not null
                        while (dataLine != null) {

                            WashingMachineWithSpinAndIroningMode washingMachineDataRead = new WashingMachineWithSpinAndIroningMode();

                            // Loop for one object
                            for (int i = 0; i < 6; i++) {

                                // Washing machine
                                switch (i) {

                                    // Washing mode
                                    case 0: {

                                        washingMachineDataRead.setWashingMode(dataLine);

                                        break;
                                    }

                                    // Washing temperature
                                    case 1: {

                                        washingMachineDataRead.setWashingTemperature(dataLine);

                                        break;
                                    }

                                    // Type of powder
                                    case 2: {

                                        washingMachineDataRead.setTypeOfPowder(dataLine);

                                        break;
                                    }

                                    // Type of conditioner
                                    case 3: {

                                        washingMachineDataRead.setTypeOfConditioner(dataLine);

                                        break;
                                    }

                                    // Spin mode
                                    case 4: {

                                        washingMachineDataRead.setSpinMode(dataLine);

                                        break;
                                    }

                                    // Ironing mode
                                    case 5: {

                                        washingMachineDataRead.setIroningMode(dataLine);

                                        break;
                                    }
                                } dataLine = dataReader.readLine();
                            }


                            washingMachines[position] = washingMachineDataRead; position++;
                        } dataReader.close();

                        // Display a message to the user when data reading is complete
                        System.out.println("Reading data completed");

                        System.out.println();

                        break;
                    }

                    // Writing data to a file
                    case 6: {

                        File file = new File("Data.txt");

                        if (file.createNewFile()) { System.out.print("\nThe file was not in the system, the creation of a new one was initialized\n"); }
                        else { System.out.print("\nThe initialized data recording operation was initialized\n"); }

                        FileWriter writer = getFileWriter(washingMachines, position);
                        writer.close();

                        System.out.print("Data recording complete\n\n");

                        break;
                    }
                }
            } scanner.close();
        }
    }
}
