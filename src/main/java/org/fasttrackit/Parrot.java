package org.fasttrackit;

/**
 * Created by admin on 9/11/2019.
 */

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    public String pozitiveMood(){
        return "The parrot is dancing.";
    }
}
