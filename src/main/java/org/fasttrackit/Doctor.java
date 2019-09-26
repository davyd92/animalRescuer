package org.fasttrackit;

/**
 * Created by admin on 9/3/2019.
 */
public class Doctor extends Entity{
    private String specialization;

    private int rescuerMedicalTreatment;
    private double consultationPrice;
    private String suggestRescuerMedicalTreatment;
    private int increaseRescuerHealthCondition;

    public int getIncreaseRescuerHealthCondition() {return increaseRescuerHealthCondition;}
    public void setIncreaseRescuerHealthCondition(int increaseRescuerHealthCondition) {this.increaseRescuerHealthCondition = increaseRescuerHealthCondition;}

    public String getSuggestRescuerMedicalTreatment() {return suggestRescuerMedicalTreatment;}
    public void setSuggestRescuerMedicalTreatment(String suggestRescuerMedicalTreatment) {this.suggestRescuerMedicalTreatment = suggestRescuerMedicalTreatment;}

    public double getConsultationPrice() {return consultationPrice;}
    public void setConsultationPrice(double consultationPrice) {
        this.consultationPrice = consultationPrice;
    }

    public int getRescuerMedicalTreatment() {return rescuerMedicalTreatment;}
    public void setRescuerMedicalTreatment(int rescuerMedicalTreatment) {this.rescuerMedicalTreatment = rescuerMedicalTreatment;}

    public String getSpecialization() {return specialization;}
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
