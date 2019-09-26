package org.fasttrackit;



public class Veterinarian extends Entity{
    private String specialization;

    private int animalMedicalTreatment;
    private double consultationPrice;
    private String suggestMedicalTreatment;

    public Veterinarian(String name){
        this.setName(name);
    }

    public String getSuggestMedicalTreatment() {return suggestMedicalTreatment;}
    public void setSuggestMedicalTreatment(String suggestMedicalTreatment) {this.suggestMedicalTreatment = suggestMedicalTreatment;}

    public int getAnimalMedicalTreatment() {return animalMedicalTreatment;}
    public void setAnimalMedicalTreatment(int animalMedicalTreatment) {this.animalMedicalTreatment = animalMedicalTreatment;}

    public double getConsultationPrice() {return consultationPrice;}
    public void setConsultationPrice(double consultationPrice) {
        this.consultationPrice = consultationPrice;
    }

    public String getSpecialization() {return specialization;}
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
