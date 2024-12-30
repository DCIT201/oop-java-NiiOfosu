package rental_management;

public class RentalTransaction {
    private Vehicle vehicle;
    private int days;
    private double totalCost;

    public RentalTransaction(Vehicle vehicle, int days) {
        this.vehicle = vehicle;
        this.days = days;
        this.totalCost = vehicle.calculateRentalCost(days);
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
