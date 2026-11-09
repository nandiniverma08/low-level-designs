package ElevatorSystem;

public class Floor {

    private int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public ElevatorRequest pressUpButton() {
        return new ElevatorRequest(
                floorNumber,
                -1,
                Direction.UP,
                RequestType.HALL
        );
    }

    public ElevatorRequest pressDownButton() {
        return new ElevatorRequest(
                floorNumber,
                -1,
                Direction.DOWN,
                RequestType.HALL
        );
    }
}
