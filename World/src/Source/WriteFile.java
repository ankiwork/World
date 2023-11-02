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
}