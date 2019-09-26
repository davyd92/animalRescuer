package org.fasttrackit;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
    private String rescuer;
    private String dog;
    private String doctor;


    private ArrayList<AnimalFood> availableFood= new ArrayList<AnimalFood>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[3];

    public void initFood(AnimalFood animalFood1, AnimalFood animalFood2){
        availableFood.add(animalFood1);
        availableFood.add(animalFood2);}

    public void availableFood(){
        for(AnimalFood availFood: availableFood){
            if(availFood.getName()!=null){
                System.out.println(availFood.getName());}}}


    /**private**/ void initRecreationalActivity(RecreationalActivity recreationalActivity1, RecreationalActivity recreationalActivity2) {
            availableActivities[0]=recreationalActivity1;
            availableActivities[1]=recreationalActivity2;}

    public void availableActivities(){
        for(int i=0; i<availableActivities.length;i++){
            if(availableActivities[i]!=null){
                System.out.println(availableActivities[i].getName());
            }
        }
    }

//    private void initRecreationalActivity() {
//        int x=1;
//        System.out.print("Dati numele activitatii de recreere: ");
//        Scanner in = new Scanner(System.in);
//            //BufferedReader flux_in = new BufferedReader(new
//               //     InputStreamReader(System.in));
//            //RecreationalActivity recreationalActivity = flux_in.readLine();
//        for (int i = 0; x==1 ; i++) {
//            RecreationalActivity recreationalActivity = in.nextRecreationalActivity();
//            if(recreationalActivity!=null){availableActivities[i] = recreationalActivity;}
//            System.out.println("Mai adaugati o Acivitate de recreere? 1 Adaugare   2 Skip");
//            x = in.nextInt();
//        }
//    }

    public String getRescuer() {
        return rescuer;
    }
    public void setRescuer(String rescuer) {
        this.rescuer = rescuer;
    }

    public String getDog() {return dog;}
    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getDoctor() {return doctor;}
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }


    public void start(){
//        initFood();
        availableFood();
//        initRecreationalActivity();
        availableActivities();
    }
}