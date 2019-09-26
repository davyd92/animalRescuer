package org.fasttrackit;
/**
 * Created by admin on 9/3/2019.
 */
public class PetMedicalTratment {

    private String name;
    private int increasePetHealthCondition;
    private double price;

    public PetMedicalTratment(String name, int increasePetHealthCondition, double price) {
        this.name = name;
        this.increasePetHealthCondition = increasePetHealthCondition;
        this.price = price;
    }

    public int getIncreasePetHealthCondition() {return increasePetHealthCondition;}
    public void setIncreasePetHealthCondition(int increasePetHealthCondition) {this.increasePetHealthCondition = increasePetHealthCondition;}

    public double getPrice() {return price;}
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
}
