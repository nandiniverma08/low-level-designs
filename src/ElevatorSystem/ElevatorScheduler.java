package ElevatorSystem;

import java.util.List;

public class ElevatorScheduler {

    public Elevator selectElevator(
            List<Elevator> elevators,
            ElevatorRequest request) {

        Elevator selectedElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {

            if (!elevator.isAvailable()) {
                continue;
            }

            if (!elevator.hasCapacity()) {
                continue;
            }

            int distance = Math.abs(
                    elevator.getCurrentFloor()
                            - request.getSourceFloor()
            );

            if (distance < minDistance) {
                minDistance = distance;
                selectedElevator = elevator;
            }
        }

        return selectedElevator;
    }
}
