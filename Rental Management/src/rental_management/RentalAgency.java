package rental_management;

import java.util.*;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);
                customer.addRental(vehicle);
                return vehicle;
            }
        }
        throw new IllegalStateException("Vehicle not available");
    }

    public void returnVehicle(Vehicle vehicle) { vehicle.setAvailable(true); }

    public List<Vehicle> generateFleetReport() { return Collections.unmodifiableList(fleet); }
}
