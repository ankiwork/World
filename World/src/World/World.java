package World;

import java.util.Scanner;

import WashingMachine.ModificationsOfTheWashingMachine.WashingMachineWithSpinAndIroningMode;

public class World {

    public static void main(String[] argv) {

        Scanner scanner = new Scanner(System.in);

        WashingMachineWithSpinAndIroningMode washingMachine = new WashingMachineWithSpinAndIroningMode();

        boolean application = true;

        while (application) {

            System.out.print("\nYou are in the main menu, select the operation number\n");
            System.out.print("[1] - Quit the application\n");
            System.out.print("[2] - Testing the Load method\n");
            System.out.print("[3] - Read data from file\n");
            System.out.print("[4] - Write data to file\n");
            System.out.print("Operation number : ");

            int operation = scanner.nextInt();

            switch(operation) {

                case 1: {
                    application = false;
                    break;
                }

                case 2: {

                    System.out.print("\nWashing machine [BEFORE] filling via load method:\n");
                    washingMachine.outputWashingMachineWithSpinAndIroningModeInformation(washingMachine);

                    washingMachine.loadWashingMachineWithSpinAndIroningMode(washingMachine);

                    System.out.print("\nWashing machine [AFTER] filling via load method:\n");
                    washingMachine.outputWashingMachineWithSpinAndIroningModeInformation(washingMachine);

                    break;
                }
            }
        } scanner.close();
    }
}