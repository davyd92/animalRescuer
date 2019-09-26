package org.fasttrackit;


public class FoodPetShop {
    private String name;
    private boolean dogFood;
    private boolean catFood;
    private boolean turtleFood;
    private boolean reptileFood;
    private boolean fishFood;


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public boolean isDogFood() {return dogFood;}
    public void setDogFood(boolean dogFood) {this.dogFood = dogFood;}

    public boolean isFishFood() {return fishFood;}
    public void setFishFood(boolean fishFood) {this.fishFood = fishFood;}

    public boolean isReptileFood() {return reptileFood;}
    public void setReptileFood(boolean reptileFood) {this.reptileFood = reptileFood;}

    public boolean isTurtleFood() {return turtleFood;}
    public void setTurtleFood(boolean turtleFood) {this.turtleFood = turtleFood;}

    public boolean isCatFood() {return catFood;}
    public void setCatFood(boolean catFood) {this.catFood = catFood;}
}
