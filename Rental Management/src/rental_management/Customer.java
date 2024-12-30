package rental_management;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<RentalTransaction> rentalHistory;
    private List<Vehicle> currentRentals;
    private int loyaltyPoints;

    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
        this.currentRentals = new ArrayList<>();
        this.loyaltyPoints = 0;
    }

    public String getName() {
        return name;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }
    public List<Vehicle> getCurrentRentals() {
        return currentRentals;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
        loyaltyPoints += transaction.getDays();
    }
    public void addCurrentRental(Vehicle vehicle) {
        currentRentals.add(vehicle);
    }
    public void removeCurrentRental(Vehicle vehicle) {
        currentRentals.remove(vehicle);
    }
    public boolean isEligibleForRental() {
        return currentRentals.size() < 3;
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addRental(Vehicle vehicle) {
    }
}
