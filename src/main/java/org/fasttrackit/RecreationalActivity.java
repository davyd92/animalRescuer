package org.fasttrackit;



public class RecreationalActivity {
    private String name;

   private String place;
    private double price;
    private boolean petAcces;
    private int moodIncrease;

    public RecreationalActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPetAcces() {

        return petAcces;
    }

    public void setPetAcces(boolean petAcces) {
        this.petAcces = petAcces;
    }

    public int getMoodIncrease() {

        return moodIncrease;
    }

    public void setMoodIncrease(int moodIncrease) {
        this.moodIncrease = moodIncrease;
    }
}
