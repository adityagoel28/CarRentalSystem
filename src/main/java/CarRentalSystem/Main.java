package CarRentalSystem;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car Rental System!");

        Scanner sc = new Scanner(System.in);
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        while(true){
            System.out.println("1. Add a car");
            System.out.println("2. Add a customer");
            System.out.println("3. Update a customer");
            System.out.println("4. Delete a customer");
            System.out.println("5. Rent a car");
            System.out.println("6. Return a car");
            System.out.println("7. View Rental History");
            System.out.println("8. Update Car");
            System.out.println("9. Delete Car");
            System.out.println("10. View Rental History By Customer");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter the car details - Registration, make, model, year, color, price: ");
                    String regNoAdd = sc.nextLine();
                    String make = sc.nextLine();
                    String model = sc.nextLine();
                    int year = sc.nextInt();
                    sc.nextLine();
                    String color = sc.nextLine();
                    double price = sc.nextDouble();
                    sc.nextLine();
                    Car car = new Car(regNoAdd, make, model, year, color, price);
                    carRentalSystem.addCar(car);
                    System.out.println("Car Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter customer details: ");
                    String name = sc.nextLine();
                    String contactInfo = sc.nextLine();
                    Customer customer = new Customer(name, contactInfo);
                    carRentalSystem.addCustomer(customer);
                    break;
                case 3:
                    System.out.println("Enter customer details: ");
                    String nameUpdate = sc.nextLine();
                    String contactInfoUpdate = sc.nextLine();
                    Customer customerUpdate = new Customer(nameUpdate, contactInfoUpdate);
                    carRentalSystem.updateCustomer(customerUpdate);
                    break;
                case 4:
                    System.out.println("Enter customer name to delete: ");
                    String nameDelete = sc.nextLine();
                    carRentalSystem.deleteCustomer(nameDelete);
                    break;
                case 5:
                    System.out.println("Enter rental details - car registration, customer name, rental date, return date: ");
                    String carReg = sc.nextLine();
                    String custName = sc.nextLine();
                    LocalDate rentalDate = LocalDate.parse(sc.nextLine());
                    LocalDate returnDate = LocalDate.parse(sc.nextLine());
                    carRentalSystem.rentCar(carReg, custName, rentalDate, returnDate);
                    break;
                case 6:
                    System.out.println("Enter the car registration number to return: ");
                    String regNoReturn = sc.nextLine();
                    carRentalSystem.returnCar(regNoReturn);
                    System.out.println("Car returned successfully");
                    break;
                case 7:
                    System.out.println("Viewing Rental History");
                    carRentalSystem.displayRentalHistory();
                    break;
                case 8:
                    System.out.println("Enter the car details - Registration, make, model, year, color, price: ");
                    String regNoUpdate = sc.nextLine();
                    String makeUpdate = sc.nextLine();
                    String modelUpdate = sc.nextLine();
                    int yearUpdate = sc.nextInt();
                    sc.nextLine();
                    String colorUpdate = sc.nextLine();
                    double priceUpdate = sc.nextDouble();
                    sc.nextLine();
                    Car carUpdate = new Car(regNoUpdate, makeUpdate, modelUpdate, yearUpdate, colorUpdate, priceUpdate);
                    carRentalSystem.updateCar(regNoUpdate, carUpdate);
                    break;
                case 9:
                    System.out.println("Enter the car registration number to delete: ");
                    String regNoDelete = sc.nextLine();
                    carRentalSystem.deleteCar(regNoDelete);
                    break;
                case 10:
                    System.out.println("Enter the customer name to view rental history: ");
                    String custNameHistory = sc.nextLine();
                    carRentalSystem.displayRentalHistoryByCustomer(custNameHistory);
                    break;
                case 11:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice, please enter correct one");
            }

        }
    }
}