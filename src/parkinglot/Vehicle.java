package parkinglot;

public class Vehicle {
    private final String registrationNumber;
    private VehicleType type;
    private final String color;
    private ParkingTicket ticket;

    public Vehicle(String type, String registrationNumber, String color) {
        switch (type) {
            case "CAR":
                this.type = VehicleType.CAR;
                break;
            case "BIKE":
                this.type = VehicleType.BIKE;
                break;
            case "TRUCK":
                this.type = VehicleType.TRUCK;
                break;
        }
        this.color = color;
        this.registrationNumber = registrationNumber;

    }

    public String getColor() {
        return color;
    }

    public void assignTicket(ParkingTicket ticket) {
        this.ticket = ticket;
        System.out.println("Parked vehicle. Ticket ID: " + ticket.getTicketId());
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }
}
