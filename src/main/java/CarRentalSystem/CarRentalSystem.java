package CarRentalSystem;

import java.time.LocalDate;
import java.util.*;

public class CarRentalSystem {
    private Map<String, Car> cars = new HashMap<>();
    private Map<String, Customer> customers = new HashMap<>();
    private List<Rental> rentals = new ArrayList<>();

    public void addCar(Car car){
        cars.put(car.getRegistrationNumber(), car);
    }

    public void updateCar(String regNo, Car updatedCar){
        if(cars.containsKey(regNo)){
            cars.put(regNo, updatedCar);
            System.out.println("Car updated");
        }
        else {
            System.out.println("Car not found");
        }
    }

    public void deleteCar(String regNo){
        if(cars.containsKey(regNo)){
            cars.remove(regNo);
            System.out.println("Car deleted");
        }
        else {
            System.out.println("Car not found");
        }
    }

    public void addCustomer(Customer customer){
        customers.put(customer.getName(), customer);
    }

    public void updateCustomer(Customer customer){
        if(customers.containsKey(customer.getName())){
            customers.put(customer.getName(), customer);
        }
        else {
            System.out.println("Customer not found");
        }
    }

    public void deleteCustomer(String name){
        if(customers.containsKey(name)){
            customers.remove(name);
        }
        else {
            System.out.println("Customer not found");
        }
    }

    public boolean rentCar(String regNo, String customerName, LocalDate rentalDate, LocalDate returnDate){
        Car car = cars.get(regNo);
        Customer customer = customers.get(customerName);
        if(customer == null){
            System.out.println("Customer not found");
            return false;
        }
        else if(car == null){
            System.out.println("Car not found");
            return false;
        }
        if(car.isAvailable()){
            Rental rental = new Rental(rentalDate, returnDate, customer, car);
            rentals.add(rental);
            System.out.println("Car rented successfully");
            car.setAvailable(false);
            return true;
        }
        return false;
    }

    public void displayRentalHistory(){
        System.out.println("Rentals:");
        for(Rental rental : rentals){
            System.out.println("Car reg no: " + rental.getCar().getRegistrationNumber());
            System.out.println("Customer Name: " + rental.getCustomer().getName());
            System.out.println("Rental Date: " + rental.getRentalDate());
            System.out.println("Return Date: " + rental.getReturnDate());
            System.out.println("Rental duration: " + rental.getRentalDuration());
        }
    }

    public void returnCar(String regNo){
        Car car = cars.get(regNo);
        if(car != null){
            car.setAvailable(true);
        }
    }

    public void displayRentalHistoryByCustomer(String customerName){
        System.out.println("Rentals for the given customer:");
        boolean found = false;
        for(Rental rental : rentals){
            if(rental.getCustomer().getName().equals(customerName)){
                System.out.println("Car reg no: " + rental.getCar().getRegistrationNumber());
                System.out.println("Customer Name: " + rental.getCustomer().getName());
                System.out.println("Rental Date: " + rental.getRentalDate());
                System.out.println("Return Date: " + rental.getReturnDate());
                System.out.println("Rental duration: " + rental.getRentalDuration());
                found = true;
            }
        }
        if(!found){
            System.out.println("No rentals found for the given customer");
        }
    }

//    public void displayAvailableCars(){
//        System.out.println("Available cars:");
//        boolean anyCar = false;
//        for(Map.Entry<String, Boolean> entry : cars.entrySet()){
//            if(entry.getValue()){
//                System.out.println(entry.getKey());
//                anyCar = true;
//            }
//        }
//        if(!anyCar){
//            System.out.println("No Cars available at the moment");
//        }
//    }
}
