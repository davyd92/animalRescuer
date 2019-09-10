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

    public AnimalFood(String name, double price) {
        this.name = name;
        this.price=price;
    }


}
