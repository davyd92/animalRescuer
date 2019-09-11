package org.fasttrackit;


public class Animal extends Entity {
    private int healthCondition;
    private int hungerSensation;
    private int mood;
    private String favoriteFood;
    private String favoriteRecreationActivity;

    private String breed;
    private boolean friendly;
    private String colour;
    private String house;

    public Animal(String name) {
        this.setName(name);
    }

    public String toString(){
        return "The animal is happy.";
    }

    public int getHungerSensation() {
        return hungerSensation;
    }

    public void setHungerSensation(int hungerSensation) {
        this.hungerSensation = hungerSensation;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getColour() {return colour;}

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFriendly() {return friendly;}

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public String getBreed() {return breed;}

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFavoriteRecreationActivity() {return favoriteRecreationActivity;}

    public void setFavoriteRecreationActivity(String favoriteRecreationActivity) {this.favoriteRecreationActivity = favoriteRecreationActivity;}

    public String getFavoriteFood() { return favoriteFood;}

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getMood() {return mood;}

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHealthCondition() {return healthCondition;}

    public void setHealthCondition(int healthCondition) {
        this.healthCondition = healthCondition;
    }
}
