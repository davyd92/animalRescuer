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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getMood() {

        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getRescuerHealtCondition() {

        return rescuerHealtCondition;
    }

    public void setRescuerHealtCondition(int rescuerHealtCondition) {
        this.rescuerHealtCondition = rescuerHealtCondition;
    }

    public int getAnimalMedicatTreatment() {

        return animalMedicatTreatment;
    }

    public void setAnimalMedicatTreatment(int animalMedicatTreatment) {
        this.animalMedicatTreatment = animalMedicatTreatment;
    }
}
