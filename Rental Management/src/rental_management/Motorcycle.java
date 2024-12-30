package rental_management;

public class Motorcycle extends Vehicle {
    private static final double HELMET_COST = 15;

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRentalRate() * days) + HELMET_COST;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Motorcycle: " + super.toString();
    }
}