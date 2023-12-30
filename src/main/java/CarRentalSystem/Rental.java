package CarRentalSystem;

import java.time.LocalDate;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class Rental {
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private Customer customer;
    private Car car;
    private long rentalDuration;


    public Rental(LocalDate rentalDate, LocalDate returnDate, Customer customer, Car car){
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDuration = DAYS.between(rentalDate, returnDate);
        this.customer = customer;
        this.car = car;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public long getRentalDuration() {
        return rentalDuration;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }
}
