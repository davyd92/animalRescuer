package org.fasttrackit;

/**
 * Created by admin on 9/11/2019.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    public Dog() {}

    public String pozitiveMood(){
        return "The dog wags his tail.";
    }
}
