package org.fasttrackit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private Rescuer rescuer;
    private Animal animal;
    private Doctor doctor;
    private AnimalFood chosenFood;

    Scanner in = new Scanner(System.in);


    private List<AnimalFood> availableFood= new ArrayList<AnimalFood>();
    //private RecreationalActivity[] availableActivities = new RecreationalActivity[3];
    private List<RecreationalActivity> availableActivities = new ArrayList<>();

    public void initFood(AnimalFood animalFood1, AnimalFood animalFood2){
        availableFood.add(animalFood1);
        availableFood.add(animalFood2);}

    public void availableFood(){
        System.out.println("Available foods are:");
        for(AnimalFood availFood: availableFood){
            if(availFood.getName()!=null){
                System.out.println(availFood.getName());}}}



    private void initRecreationalActivity(RecreationalActivity recreationalActivity) {
                availableActivities.add(recreationalActivity);}

    public void availableActivities() {
        System.out.println("Available Activities are:");
        for (int i = 0; i < availableActivities.size(); i++) {
            if (availableActivities.get(i) != null) {
                System.out.println(availableActivities.get(i).getName());
            }
        }
    }

    private void initRescuer(){
        String name=null;
        int age=0;
        try{System.out.print("Give your character a name: ");
        name = in.nextLine();}
        catch(InputMismatchException exception){
            System.out.println("Please submit a valid name.");
            initRescuer();
        }
        try{System.out.print("Give your character an age: ");
        age = in.nextInt();}
        catch(InputMismatchException exception){
            System.out.println("Please submit a valid number.");
            initRescuer();
        }
        rescuer = new Rescuer(name,age);
    }

    private void nameAnimal(){
        String name=null;
        try {System.out.print("Give your animal a name:");
            name = in.nextLine();
        }catch(InputMismatchException Exception){
            System.out.println("Please submit a valid name.");
            nameAnimal();}
        animal.setName(name);}



    public void buyFood(){
        int foodChoice=0;
        System.out.println("Choose a food to buy:");
        for (int i = 0; i<availableFood.size(); i++){
            System.out.println((i+1)+". "+availableFood.get(i).getName()+": "+availableFood.get(i).getPrice());}
        System.out.println((availableFood.size()+1)+". None of.");
        try{System.out.println("Choose a food:");
            foodChoice=in.nextInt()-1;
        }catch (InputMismatchException Exception){
            System.out.println("Please submit a valid food.");
            buyFood();
        }
        if(foodChoice<availableFood.size()){System.out.println("Your food choice is "+availableFood.get(foodChoice).getName()+", price: "+availableFood.get(foodChoice).getPrice());
            System.out.println("Your budget: "+rescuer.getMoney());
            System.out.println("Do you buy it?       1.YES   2.Choose another   3.NO");
            int buyFood = in.nextInt();
            if(buyFood==1) {
                if ((rescuer.getMoney()-availableFood.get(foodChoice).getPrice()) > 0) {
                    rescuer.setFoodQuantity(rescuer.getFoodQuantity()+availableFood.get(foodChoice).getQuantity());
                    rescuer.setMoney(rescuer.getMoney() - availableFood.get(foodChoice).getPrice());
                    chosenFood=availableFood.get(foodChoice);
                    System.out.println("You bought "+ availableFood.get(foodChoice).getName());
                    System.out.println("Your new budget: " + rescuer.getMoney());
                } else {System.out.println("Sorry. You don't have enough money.");
                    System.out.println("Want to choose another?  1.Yes   2.No");
                    int chooseAnother = in.nextInt();
                    if(chooseAnother==1) buyFood();
                    else System.out.println("Thank you!");
                }}
            else if(buyFood==2)buyFood();
            else System.out.println("You have chosen not to buy food. Thank you!");
        }
    }




    private void requireFeeding(){
        System.out.println("Feed "+animal.getName()+".");
        if(chosenFood==null || rescuer.getFoodQuantity()<1){
            System.out.println("You don't have enough food to feed "+animal.getName()+".");
            System.out.println("Do you want to buy food?   1.Yes   2.No");
            int buyFood = in.nextInt();
            if(buyFood==1) {buyFood();
                System.out.println("Feed "+animal.getName()+"?      1.Yes    2.No");
                int feedAnimal = in.nextInt();
                if(feedAnimal==1) requireFeeding();}
            else {System.out.println("You have chosen not to buy food.");}
        }
        else {System.out.println("Your available food is "+chosenFood.getName()+", quantity: "+rescuer.getFoodQuantity());
            System.out.println("Do you feed "+animal.getName()+"? 1.YES   2.NO");
            int feedAnimal = in.nextInt();
            if(feedAnimal==1){rescuer.feeding(animal, chosenFood);}
            else System.out.println("You have chosen not to feed "+animal.getName()+".");}
    }



    private void requireRecreationalActivity(){
        int activityChoice=0;
        System.out.println("Play with your animal.");
        for (int i = 0; i<availableActivities.size(); i++){
            System.out.println((i+1)+". "+availableActivities.get(i).getName());
        }
        System.out.println((availableActivities.size()+1)+". None of.");
        int notChoice = availableActivities.size();
        try{System.out.println("Choose an activity:");
            activityChoice=in.nextInt()-1;
        }catch (InputMismatchException Exception){
            System.out.println("Please submit a valid number.");
            requireRecreationalActivity();
        }
        if(activityChoice<availableActivities.size()){System.out.println("Your activity choice is "+availableActivities.get(activityChoice).getName());
            rescuer.recreationTime(animal,availableActivities.get(activityChoice));}
        else System.out.println("Your choice is to not play with your animal.");
    }

    private void initAnimal() {
        int animalChoise = 0;
        int favActivity = ThreadLocalRandom.current().nextInt(1, 3);
        int favFood = ThreadLocalRandom.current().nextInt(1, 2);
        // while(animalChoise<1 && animalChoise>5){
        System.out.println("Choose your animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Parrot");
        System.out.println("4. Fish");
        System.out.println("5. Turtle");
        System.out.println("Taste your choose and press Enter.");
        animalChoise = in.nextInt();
        if (animalChoise == 1) {
            animal = new Dog();
        } else if (animalChoise == 2) {
            animal = new Cat();
        } else if (animalChoise == 3) {
            animal = new Parrot();
        } else if (animalChoise == 4) {
            animal = new Fish();
        } else {
            animal = new Turtle();
        }

        if (animalChoise==1) animal.setBreed("Dog");
        else if (animalChoise==2) animal.setBreed("Cat");
        else if (animalChoise==3) animal.setBreed("Parrot");
        else if (animalChoise==4) animal.setBreed("Fish");
        else animal.setBreed("Turtle");
        System.out.println("Your animal's breed: "+animal.getBreed());


        System.out.print("Animals's colour: ");
        animal.setColour(in.nextLine());
        animal.setColour(in.nextLine());


        if (animalChoise == 1) {//dog
            AnimalFood food1 = new AnimalFood("Royal Canin", 125,7,true, -1, 0);
            AnimalFood food2 = new AnimalFood("NutriBest", 120,15,false, -1, 0);
            initFood(food1,food2);
            if (favFood == 1) {animal.setFavoriteFood(food1.getName());}
            if (favFood == 2) {animal.setFavoriteFood(food2.getName());}
        }
        if (animalChoise == 2) {//cat
            AnimalFood food1 = new AnimalFood("Bavery", 125,7,true, -2, 1);
            AnimalFood food2 = new AnimalFood("NutriBest", 120,15,false, -2, 1);
            initFood(food1,food2);
            if (favFood == 1) {animal.setFavoriteFood(food1.getName());}
            if (favFood == 2) {animal.setFavoriteFood(food2.getName());}
        }
        if (animalChoise == 3) {//parrot
            AnimalFood food1 = new AnimalFood("Vogel", 120,15,false, -2, 1);
            AnimalFood food2 = new AnimalFood("Vitakraft", 125,7,true, -2, 1);
            initFood(food1,food2);
            if (favFood == 1) {animal.setFavoriteFood(food1.getName());}
            if (favFood == 2) {animal.setFavoriteFood(food2.getName());}
        }
        if (animalChoise == 4) {//fish
            AnimalFood food1 = new AnimalFood("TeraMin", 120,15,false, -2, 1);
            AnimalFood food2 = new AnimalFood("NovoPearl", 123,7,true, -2, 1);
            initFood(food1,food2);
            if (favFood == 1) {animal.setFavoriteFood(food1.getName());}
            if (favFood == 2) {animal.setFavoriteFood(food2.getName());}
        }
        if (animalChoise>= 5) {//turtle
            AnimalFood food1 = new AnimalFood("Gammarus", 125,7,true, -2, 1);
            AnimalFood food2 = new AnimalFood("Shrimp", 120,15,false, -2, 1);
            initFood(food1,food2);
            if (favFood == 1) {animal.setFavoriteFood(food1.getName());}
            if (favFood == 2) {animal.setFavoriteFood(food2.getName());}
        }



        if (animalChoise == 1) {//dog
            RecreationalActivity recrActiv1 = new RecreationalActivity("Forest Walks", 1);
            RecreationalActivity recrActiv2 = new RecreationalActivity("Park Walks", 1);
            RecreationalActivity recrActiv3 = new RecreationalActivity("Ball Game", 1);
            initRecreationalActivity(recrActiv1);
            initRecreationalActivity(recrActiv2);
            initRecreationalActivity(recrActiv3);
            if (favActivity == 1) {animal.setFavoriteRecreationActivity(recrActiv1.getName());}
            if (favActivity == 2) {animal.setFavoriteRecreationActivity(recrActiv2.getName());}
            if (favActivity == 3) {animal.setFavoriteRecreationActivity(recrActiv3.getName());}}
        if (animalChoise == 2) {//cat
            RecreationalActivity recrActiv1 = new RecreationalActivity("Walk Outside", 2);
            RecreationalActivity recrActiv2 = new RecreationalActivity("Watch TV", 2);
            RecreationalActivity recrActiv3 = new RecreationalActivity("Ball Game", 2);
            initRecreationalActivity(recrActiv1);
            initRecreationalActivity(recrActiv2);
            initRecreationalActivity(recrActiv3);
            if (favActivity == 1) {animal.setFavoriteRecreationActivity(recrActiv1.getName());}
            if (favActivity == 2) {animal.setFavoriteRecreationActivity(recrActiv2.getName());}
            if (favActivity == 3) { animal.setFavoriteRecreationActivity(recrActiv3.getName());}}
        if (animalChoise == 3) {//parrot
            favActivity = ThreadLocalRandom.current().nextInt(1, 2);
            RecreationalActivity recrActiv1 = new RecreationalActivity("Sing", 2);
            RecreationalActivity recrActiv2 = new RecreationalActivity("Watch TV", 2);
            initRecreationalActivity(recrActiv1);
            initRecreationalActivity(recrActiv2);
            if (favActivity == 1) {animal.setFavoriteRecreationActivity(recrActiv1.getName());}
            if (favActivity == 2) {animal.setFavoriteRecreationActivity(recrActiv2.getName());} }
        if (animalChoise == 4) {//fish
            RecreationalActivity recrActiv1 = new RecreationalActivity("Play with boats", 2);
            initRecreationalActivity(recrActiv1);
                animal.setFavoriteRecreationActivity(recrActiv1.getName());}
        if (animalChoise>= 5) {//turtle
            favActivity = ThreadLocalRandom.current().nextInt(1, 2);
            RecreationalActivity recrActiv1 = new RecreationalActivity("Walk Outside", 2);
            RecreationalActivity recrActiv2 = new RecreationalActivity("Laziness in the sunlight", 2);
            initRecreationalActivity(recrActiv1);
            initRecreationalActivity(recrActiv2);
            if (favActivity == 1) {animal.setFavoriteRecreationActivity(recrActiv1.getName());}
            if (favActivity == 2) {animal.setFavoriteRecreationActivity(recrActiv2.getName());}        }



        if(animalChoise>=5) animal.setAge(ThreadLocalRandom.current().nextInt(1,50));
        else animal.setAge(ThreadLocalRandom.current().nextInt(1,10));
        animal.setMood(1);
        animal.setFriendly(ThreadLocalRandom.current().nextBoolean());
        animal.setHungerLevel(10);
        animal.setHealthCondition(2);

        System.out.println(animal.toString());
    }

    public void intro(){
        System.out.println("Hello!");
    }


    public void start(){
        intro();
        initRescuer();
        initAnimal();
        nameAnimal();
        int x = 0;
        boolean win=true;
        while(animal.getMood()<20 && animal.getHungerLevel()>0 && x<20){
            requireFeeding();
            requireRecreationalActivity();
            if(rescuer.getMoney()<1 || x>=20){ System.out.println("You lost! :(");
            win=false;
            break;}
            else win = true;
             x++;}
        if(win) System.out.println("Congratulations! You won!!");
    }
}
