package org.fasttrackit;

/**
 * Created by admin on 9/3/2019.
 */
public class MedicalTreatment {

    private String name;
    private int increaseRescuerHealthCondition;
    private double price;

    public MedicalTreatment(String name, int increaseRescuerHealthCondition, double price){
        this.name = name;
        this.increaseRescuerHealthCondition = increaseRescuerHealthCondition;
        this.price = price;
    }

    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {return price;}
    public void setPrice(double price) {
        this.price = price;
    }

    public int getIncreaseRescuerHealthCondition() {return increaseRescuerHealthCondition;}
    public void setIncreaseRescuerHealthCondition(int increaseRescuerHealthCondition) {this.increaseRescuerHealthCondition = increaseRescuerHealthCondition;}
}
