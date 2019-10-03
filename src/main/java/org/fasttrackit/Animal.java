package org.fasttrackit;


public abstract class Animal extends Entity {
    private int healthCondition;
    private int hungerLevel;
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
    public Animal() {}

    public String pozitiveMood(){
        return "The animal is happy.";
    }

    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
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

    @Override
    public String toString() {
        return "Animal{" +
                "healthCondition=" + healthCondition +
                ", hungerLevel=" + hungerLevel +
                ", mood=" + mood +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteRecreationActivity='" + favoriteRecreationActivity + '\'' +
                ", breed='" + breed + '\'' +
                ", friendly=" + friendly +
                ", colour='" + colour + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
