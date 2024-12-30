package rental_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a rental agency
        RentalAgency agency = new RentalAgency();

        Car car = new Car("CAR150", "Benz AMG", 50);
        Motorcycle motorcycle = new Motorcycle("MOTOR150", "Toyota Camry", 50);
        Truck truck = new Truck("TRUCK150", "Benz AMG", 50);


        // Add vehicles to the fleet
        agency.addNewVehicle(car);
        agency.addNewVehicle(motorcycle);
        agency.addNewVehicle(truck);

        // Create a customer
        Customer customer = new Customer("Daniel Nii Ofosu Lafia");

        // Rent a vehicle
        System.out.println("What car would you like to rent?: ");
        String rentCar = sc.nextLine();
        System.out.println("Renting a car...");

        Vehicle rentedVehicle = agency.rentVehicle("CAR150", customer, 5);
        System.out.println("Rented: " + rentedVehicle);
        System.out.println("Rental Cost: " + rentedVehicle.calculateRentalCost(5));

        // Return the vehicle
        System.out.println("\nReturning the car...");
        agency.returnVehicle(rentedVehicle);
        System.out.println("Vehicle returned: " + rentedVehicle);

        // Generate a fleet report
        System.out.println("\nFleet Report:");
        for (Vehicle vehicle : agency.generateFleetReport()) {
            System.out.println(vehicle + ", Available: " + vehicle.isAvailable());
        }
    }
}
