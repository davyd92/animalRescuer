package org.fasttrackit;

import java.util.Date;


public class AnimalFood {
    String name;
    double price;
    double quantity;
    Date expirationDate;
    boolean availabilityInStock;

    boolean medicalTreatment;
    int increaseHealthCondition;
    int increaseHungerSensation;
    int increaseMood;

    public AnimalFood(String name, double price, int increaseHungerSensation) {
        this.name = name;
        this.price=price;
        this.increaseHungerSensation=increaseHungerSensation;
    }


}
