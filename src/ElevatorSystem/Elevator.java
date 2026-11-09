package ElevatorSystem;

import java.util.TreeSet;

public class Elevator {

    private int elevatorId;
    private int currentFloor;
    private Direction direction;
    private ElevatorStatus status;

    private int maxCapacity;
    private int currentPassengers;

    private TreeSet<Integer> pendingStops;

    public Elevator(int elevatorId, int currentFloor, int maxCapacity) {
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
        this.maxCapacity = maxCapacity;

        this.direction = Direction.IDLE;
        this.status = ElevatorStatus.IDLE;
        this.currentPassengers = 0;

        this.pendingStops = new TreeSet<>();
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public ElevatorStatus getStatus() {
        return status;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public boolean isAvailable() {
        return status == ElevatorStatus.IDLE
                || status == ElevatorStatus.MOVING;
    }

    public boolean hasCapacity() {
        return currentPassengers < maxCapacity;
    }

    public void addStop(int floor) {
        pendingStops.add(floor);
    }
}
