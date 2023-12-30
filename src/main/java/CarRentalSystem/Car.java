package CarRentalSystem;

public class Car {
    private String registrationNumber;
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isAvailable;

    public Car(String registrationNumber, String make, String model, int year, String color, double price){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isAvailable = true;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
