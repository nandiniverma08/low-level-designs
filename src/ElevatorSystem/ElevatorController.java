package ElevatorSystem;

import java.util.List;

public class ElevatorController {

    private List<Elevator> elevators;
    private ElevatorScheduler scheduler;

    public ElevatorController(
            List<Elevator> elevators,
            ElevatorScheduler scheduler) {

        this.elevators = elevators;
        this.scheduler = scheduler;
    }

    public void submitRequest(ElevatorRequest request) {

        Elevator selectedElevator =
                scheduler.selectElevator(elevators, request);

        if (selectedElevator == null) {
            System.out.println("No suitable elevator available");
            return;
        }

        selectedElevator.addStop(request.getSourceFloor());

        System.out.println(
                "Elevator " + selectedElevator.getElevatorId()
                        + " assigned to floor "
                        + request.getSourceFloor()
        );
    }

    public List<Elevator> getElevators() {
        return elevators;
    }
}
