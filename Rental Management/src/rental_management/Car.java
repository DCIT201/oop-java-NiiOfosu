package rental_management;

public class Car extends Vehicle {
    private static final double INSURANCE_COST_PER_DAY = 20;

    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRentalRate() * days) + (INSURANCE_COST_PER_DAY * days);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
