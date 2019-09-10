package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        Rescuer rescuer = new Rescuer("Alex", 19);
        {
//            rescuer.name = "Alex";
            rescuer.setMoney(1400);
        }
        Animal dog = new Animal("Daisy");
        {
//            dog.name = "Daisy";
            dog.setAge(6);
            dog.setFavoriteFood("Royal Canin");
            dog.setFavoriteRecreationActivity("ForestWalks");
            dog.setHealthCondition(10);
            dog.setHungerSensation(3);
            dog.setMood (8);
            dog.setBreed("labrador");
        }
        Veterinarian veterinarian = new Veterinarian("Andrei");{
//            veterinarian.name = "Andrei";
            veterinarian.setSpecialization("dogsConsultation");
        }
        AnimalFood dogFood = new AnimalFood("Royal Canin", 80, 2);
        {
//            dogFood.name = "Royal Canin";
//            dogFood.price = 80;
            dogFood.setQuantity(2);
            dogFood.setAvailabilityInStock(true);
//            dogFood.expirationDate = 12, 12, 2020;
        }
        RecreationalActivity recreationalActivity = new RecreationalActivity("ForestWalks");
        {
//            recreationalActivity.name ="ForestWalks";
        }
        Game game = new Game();
        game.setRescuer("Alex");
        game.setDog("Daisy");
        game.setDoctor("Andrei");

        System.out.println("Numele propritarului este " + rescuer.getName() + ", iar prietenul sau este " + dog.getName() + ".");
        System.out.println(rescuer.getName() + " are " +rescuer.getAge() + " ani, iar mancarea preferata a lui "+ dog.getName() + " este "+ dogFood.getName()+". :)");

    }
}
