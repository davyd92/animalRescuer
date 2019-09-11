package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        Rescuer alex = new Rescuer("Alex", 19);
            alex.setMoney(1400);

        Dog daisy = new Dog("Daisy ");
            daisy.setAge(6);
            daisy.setFavoriteFood("Royal Canin");
            daisy.setFavoriteRecreationActivity("ForestWalks");
            daisy.setHealthCondition(10);
            daisy.setHungerSensation(3);
            daisy.setMood (8);
            daisy.setBreed("labrador");

        Veterinarian veterinarian = new Veterinarian("Andrei");
          veterinarian.setSpecialization("dogsConsultation");

        AnimalFood dogFood = new AnimalFood("Royal Canin", 80, 2);
            dogFood.setQuantity(2);
            dogFood.setAvailabilityInStock(true);
//            dogFood.expirationDate = 12, 12, 2020;

        RecreationalActivity forestWalks = new RecreationalActivity("ForestWalks");

        Game game = new Game();
        game.setRescuer("Alex");
        game.setDog("Daisy");
        game.setDoctor("Andrei");

//        System.out.println("Numele propritarului este " + alex.getName() + ", iar prietenul sau este " + daisy.getName() + ".");
//        System.out.println(alex.getName() + " are " +alex.getAge() + " ani, iar mancarea preferata a lui "+ daisy.getName() + " este "+ dogFood.getName()+". :)");
//        alex.feeding(daisy, dogFood);
//        alex.recreationTime(forestWalks,daisy);

        Turtle turlteRaphael = new Turtle("Raphael");
        Parrot parrotRita = new Parrot("Rita");
        Cat catTirmus = new Cat("Tirmus");
        Fish fishNemo = new Fish("Nemo");
        Animal animal = new Animal("Caleb");

        System.out.println(daisy.toString());
        System.out.println(turlteRaphael.toString());
        System.out.println(catTirmus.toString());
        System.out.println(fishNemo.toString());
        System.out.println(parrotRita.toString());
        System.out.println(animal.toString());


    }
}
