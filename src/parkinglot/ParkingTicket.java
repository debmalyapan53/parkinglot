package parkinglot;

public class ParkingTicket {
    private final String ticketId;
    private final Integer floorId;
    private final Integer spotId;

    public ParkingTicket(String ticketId, Integer floorId, Integer spotId) {
        this.ticketId = ticketId;
        this.floorId = floorId;
        this.spotId = spotId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public Integer getSpotId() {
        return spotId;
    }
}
