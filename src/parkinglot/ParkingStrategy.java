package parkinglot;

public interface ParkingStrategy {
    ParkingSpot getAvailableSpot(ParkingLot parkingLot, Vehicle vehicle);
}
