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
            rescuer.money = 1400;
        }
        Animal dog = new Animal("Daisy");
        {
//            dog.name = "Daisy";
            dog.age = 6;
            dog.favoriteFood = "Royal Canin";
            dog.favoriteRecreationActivity = "ForestWalks";
            dog.healthCondition=10;
            dog.hungerSensation=3;
            dog.mood = 8;
            dog.breed = "labrador";
        }
        Veterinarian veterinarian = new Veterinarian("Andrei");{
//            veterinarian.name = "Andrei";
            veterinarian.specialization = "dogsConsultation";
        }
        AnimalFood dogFood = new AnimalFood("Royal Canin", 80);
        {
//            dogFood.name = "Royal Canin";
//            dogFood.price = 80;
            dogFood.quantity = 2;
            dogFood.availabilityInStock = true;
//            dogFood.expirationDate = 12, 12, 2020;
        }
        RecreationalActivity recreationalActivity = new RecreationalActivity("ForestWalks");
        {
//            recreationalActivity.name ="ForestWalks";
        }
        Game game = new Game();
        game.rescuer = "Alex";
        game.dog = "Daisy";
        game.doctor = "Andrei";

        System.out.println("Numele propritarului este " + rescuer.name + ", iar prietenul sau este " + dog.name + ".");
        System.out.println(rescuer.name + " are " +rescuer.age + " ani, iar mancarea preferata a lui "+ dog.name + " este "+ dogFood.name+". :)");

    }
}
