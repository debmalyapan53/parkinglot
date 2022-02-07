package parkinglot;

import java.util.Map;

public class NearestAvailableSlotStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot getAvailableSpot(ParkingLot parkingLot, Vehicle vehicle) {
        for (Map.Entry<Integer, ParkingFloor> entry : parkingLot.getFloorMap().entrySet()) {
            ParkingFloor floor = entry.getValue();
            if (floor.canPark(vehicle)) {
                return floor.getParkingSpot(vehicle);
            }
        }
        return null;
    }
}
