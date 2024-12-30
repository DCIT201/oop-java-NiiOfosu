package rental_management;

public class Truck extends Vehicle {
    private static final double LOAD_SURCHARGE = 50;

    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRentalRate() * days) + LOAD_SURCHARGE;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString();
    }
}
