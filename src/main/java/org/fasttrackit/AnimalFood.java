package org.fasttrackit;
import java.util.Date;


public class AnimalFood {
    private String name;
    private double price;
    private double quantity;
    private String expirationDate;
    private boolean availabilityInStock;

    private boolean medicalTreatment;
    private int HungerLevel;
    private int increaseMood;

    public AnimalFood(String name, double price, int HungerLevel) {
        this.name = name;
        this.price=price;
        this.HungerLevel = HungerLevel;
    }

    public AnimalFood(String name, double price, double quantity, boolean medicalTreatment, int hungerLevel, int increaseMood) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.medicalTreatment = medicalTreatment;
        HungerLevel = hungerLevel;
        this.increaseMood = increaseMood;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getIncreaseMood() {return increaseMood;}
    public void setIncreaseMood(int increaseMood) {this.increaseMood = increaseMood;}

    public double getQuantity() {return quantity;}
    public void setQuantity(double quantity) {this.quantity = quantity;}

    public String getExpirationDate() {return expirationDate;}
    public void setExpirationDate(String expirationDate) {this.expirationDate = expirationDate;}

    public boolean isAvailabilityInStock() {return availabilityInStock;}
    public void setAvailabilityInStock(boolean availabilityInStock) {this.availabilityInStock = availabilityInStock;}

    public int getHungerLevel() {return HungerLevel;}
    public void setHungerLevel(int hungerLevel) {this.HungerLevel = hungerLevel;}

    public boolean isMedicalTreatment() {return medicalTreatment;}
    public void setMedicalTreatment(boolean medicalTreatment) {this.medicalTreatment = medicalTreatment;}
}
