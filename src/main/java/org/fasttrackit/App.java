package org.fasttrackit;


public class App {
    public static void main( String[] args ){

        Rescuer alex = new Rescuer("Alex", 19);
            alex.setMoney(1400);

        Animal daisy = new Dog("Daisy ");
            daisy.setAge(6);
            daisy.setFavoriteFood("Royal Canin");
            daisy.setFavoriteRecreationActivity("ForestWalks");
            daisy.setHealthCondition(10);
            daisy.setHungerLevel(6);
            daisy.setMood (8);
            daisy.setBreed("labrador");
            daisy.setFriendly(true);

        Veterinarian veterinarian = new Veterinarian("Andrei");
          veterinarian.setSpecialization("dogsConsultation");

        AnimalFood dogFood = new AnimalFood("Royal Canin", 80, -2);
            dogFood.setQuantity(2);
            dogFood.setAvailabilityInStock(true);
//            dogFood.expirationDate = 12, 12, 2020;

        RecreationalActivity forestWalks = new RecreationalActivity("ForestWalks", 2);
        RecreationalActivity parkWalks = new RecreationalActivity("ParkWalks", 2);

        Game game = new Game();
        game.setRescuer("Alex");
        game.setDog("Daisy");
        game.setDoctor("Andrei");

//        System.out.println("Numele propritarului este " + alex.getName() + ", iar prietenul sau este " + daisy.getName() + ".");
//        System.out.println(alex.getName() + " are " +alex.getAge() + " ani, iar mancarea preferata a lui "+ daisy.getName() + " este "+ dogFood.getName()+". :)");
//        alex.feeding(daisy, dogFood);
//        alex.recreationTime(forestWalks,daisy);

        Animal turlteRaphael = new Turtle("Raphael");
        Animal parrotRita = new Parrot("Rita");
        Animal catTirmus = new Cat("Tirmus");
        Animal fishNemo = new Fish("Nemo");
        Animal animal = new Animal("Caleb");

        /**System.out.println(daisy.pozitiveMood());
        System.out.println(turlteRaphael.pozitiveMood());
        System.out.println(catTirmus.pozitiveMood());
        System.out.println(fishNemo.pozitiveMood());
        System.out.println(parrotRita.pozitiveMood());
        System.out.println(animal.pozitiveMood());**/

        /**System.out.println("Hunger level of "+daisy.getName()+" is "+daisy.getHungerLevel());
        alex.feeding(daisy,dogFood);
        System.out.println("Hunger level after feeding is: "+daisy.getHungerLevel());
        System.out.println("");
        System.out.println(daisy.getName()+"'s level of happines is: "+daisy.getMood());
        alex.recreationTime(daisy,forestWalks);
        System.out.println(daisy.getName()+"'s level of happines after "+forestWalks.getName()+" is: "+daisy.getMood());
         **/

     /**   System.out.println(daisy.toString());
        alex.feeding(daisy,dogFood);
        System.out.println(daisy.toString());
        alex.recreationTime(daisy,forestWalks);
        System.out.println(daisy.toString());**/

        AnimalFood catFood = new AnimalFood("Purrina", 90, -2);

        game.initFood(dogFood,catFood);
        game.initRecreationalActivity(forestWalks,parkWalks);
        game.start();

    }
}
