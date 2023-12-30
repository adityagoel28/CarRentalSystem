package CarRentalSystem;

import java.util.*;

public class Customer {
    private String name;
    private String contactInfo;
    private List<Rental> rentalHistory;

    public Customer(String name, String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
        this.rentalHistory = new ArrayList<>();
    }

    public void addRental(Rental rental){
        rentalHistory.add(rental);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Rental> getRentalHistory(){
        return rentalHistory;
    }

    public void setRentalHistory(List<Rental> rentalHistory){
        this.rentalHistory = rentalHistory;
    }


}
