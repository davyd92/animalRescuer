package org.fasttrackit;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Rescuer extends Entity{
    private double money=1400;

    private int mood;
    private int rescuerHealtCondition;
    private int animalMedicatTreatment;
    private double FoodQuantity=0;

    Scanner in = new Scanner(System.in);
    Game game;

    public Rescuer(String name,int age){
        this.setName(name);
        this.setAge(age);;
    }




    public void feeding(Animal animal, AnimalFood food){
        if(getFoodQuantity()>=1){System.out.println(getName()+" just gave some "+ food.getName() + " food to "+animal.getName()+".");
        animal.setHungerLevel(animal.getHungerLevel()+food.getHungerLevel());
        animal.setMood(animal.getMood()+food.getIncreaseMood());
        if(animal.getFavoriteFood()==food.getName()){animal.setMood(animal.getMood()/**+food.getIncreaseMood()**/+1);}
        if(food.isMedicalTreatment()) animal.setHealthCondition(animal.getHealthCondition()+1);
        setFoodQuantity(getFoodQuantity()-2);
        System.out.println(animal.getName()+"'s hunger level: "+animal.getHungerLevel());
        }
    }

    public void recreationTime(Animal animal, RecreationalActivity recreationalActivity){
        System.out.println(getName()+" just have some "+ recreationalActivity.getName() + " activity with "+animal.getName()+".");
        if(animal.getFavoriteRecreationActivity()==recreationalActivity.getName()){
            animal.setMood(animal.getMood()+recreationalActivity.getMoodIncrease()+1);
        }
            else animal.setMood(animal.getMood()+recreationalActivity.getMoodIncrease());
        System.out.println(animal.getName()+"'s mood: "+animal.getMood());
    }

    public void buyTreatment(PetMedicalTratment med){
        setAnimalMedicatTreatment(getAnimalMedicatTreatment()+1);
        setMoney(getMood()-med.getPrice());
    }

    public void treat(Animal animal, PetMedicalTratment med){
        setAnimalMedicatTreatment(getAnimalMedicatTreatment()-1);
        animal.setHealthCondition(animal.getHealthCondition()+2);
    }

    public void buyPetHouse(Animal animal, AnimalHouse house){
        setMoney(getMoney()-house.getPrice());
        animal.setHouse(house.getName());

    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public int getMood() {return mood;}
    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getRescuerHealtCondition() {return rescuerHealtCondition;}
    public void setRescuerHealtCondition(int rescuerHealtCondition) {this.rescuerHealtCondition = rescuerHealtCondition;}

    public int getAnimalMedicatTreatment() {return animalMedicatTreatment;}
    public void setAnimalMedicatTreatment(int animalMedicatTreatment) {this.animalMedicatTreatment = animalMedicatTreatment;}

    public double getFoodQuantity() {return FoodQuantity;}
    public void setFoodQuantity(double foodQuantity) {FoodQuantity = foodQuantity;}
}
