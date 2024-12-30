package rental_management;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        if (vehicleId == null || model == null || baseRentalRate < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    public String getModel() {
        return model;
    }
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model + ", Base Rate: " + baseRentalRate;
    }
}
