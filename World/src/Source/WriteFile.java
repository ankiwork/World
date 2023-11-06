package Source;

import World.WashingMachine.WashingMachineWithSpinAndIroningMode;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    // Writing data washing machine to a file
    public static FileWriter getFileWriter(WashingMachineWithSpinAndIroningMode[] washingMachines, int position) throws IOException {

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

    // Starting the program
    public static FileWriter getStartingTheProgram() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Starting the program\n");

        return writer;
    }

    // Quit the application
    public static FileWriter getQuitTheApplication() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": End the program\n");

        return writer;
    }

    // Testing the Load method
    public static FileWriter getTestingTheLoadMethod() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Testing the Load method\n");

        return writer;
    }

    // We implement manual loading of the washing machine
    public static FileWriter getImplementManualLoadingOfTheWashingMachine() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Implement manual loading of the washing machine\n");

        return writer;
    }

    // We display all objects on the screen to the user
    public static FileWriter getDisplayAllObjectsOnTheScreenToTheUser() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Display all objects on the screen to the user\n");

        return writer;
    }

    // Read data from file
    public static FileWriter getReadDataFromFile() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Read data from file\n");

        return writer;
    }

    // Writing data to a file
    public static FileWriter getWritingDataToAFile() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Writing data to a file\n");

        return writer;
    }

    // Select debug mode
    public static FileWriter getSelectDebugMode() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Select debug mode\n");

        return writer;
    }

    // Select autotest mode
    public static FileWriter getSelectAutotestMode() throws IOException {

        FileWriter writer = new FileWriter("Logs.txt", true);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        writer.write(currentDateTime + ": Select autotest mode\n");

        return writer;
    }
}