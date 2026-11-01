package ParkingLotSystem;

public class ParkingSpot {

    private int spotId;
    private VehicleType spotType;
    private Vehicle vehicle;

    public ParkingSpot(int spotId, VehicleType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.vehicle = null;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isAvailable()) {
            return false;
        }

        if (vehicle.getVehicleType() != spotType) {
            return false;
        }

        this.vehicle = vehicle;
        return true;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }
}
