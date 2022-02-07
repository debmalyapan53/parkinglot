package parkinglot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        ParkingLot parkingLot = new ParkingLot(str[1], str[2], str[3]);
        parkingLot.initializeParkingLot();

        while (true) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "create_parking_lot":
                    break;
                case "park_vehicle":
                    Vehicle vehicle = new Vehicle(cmd[1], cmd[2], cmd[3]);
                    parkingLot.parkVehicle(vehicle);
                    break;
                case "unpark_vehicle":
                    parkingLot.vacateVehicle(cmd[1]);
                    break;
                case "display":
                    parkingLot.displayBoard(cmd[1], cmd[2]);
                    break;
                case "exit":
                    return;
            }
        }
    }
}
