package org.fasttrackit;



public class Rescuer extends Entity{
    private double money;

    private int mood;
    private int rescuerHealtCondition;
    private int animalMedicatTreatment;


    public Rescuer(String name,int age){
        this.setName(name);
        this.setAge(age);;
    }




    public void feeding(Animal animal, AnimalFood food){
        System.out.println(getName()+" just gave some "+ food.getName() + " food to "+animal.getName()+".");
        animal.setHungerLevel(animal.getHungerLevel()-1);
        if(animal.getFavoriteFood()==food.getName()){
            animal.setMood(animal.getMood()+1);
        }
        //animal.setHungerLevel(animal.getHungerLevel()+food.getHungerLevel());
    }

    public void recreationTime(Animal animal, RecreationalActivity recreationalActivity){
        System.out.println(getName()+" just have some "+ recreationalActivity.getName() + " activity with "+animal.getName()+".");
        if(animal.getFavoriteRecreationActivity()==recreationalActivity.getName()){
            animal.setMood(animal.getMood()+recreationalActivity.getMoodIncrease()+1);
        }
            else animal.setMood(animal.getMood()+recreationalActivity.getMoodIncrease());
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
}
