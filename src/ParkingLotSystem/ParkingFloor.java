package ParkingLotSystem;

import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber,
                        List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots;
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable()
                    && vehicle.getVehicleType() == spotTypeOf(spot)) {
                return spot;
            }
        }
        return null;
    }

    private VehicleType spotTypeOf(ParkingSpot spot) {
        return spot.getSpotType();
    }
}
