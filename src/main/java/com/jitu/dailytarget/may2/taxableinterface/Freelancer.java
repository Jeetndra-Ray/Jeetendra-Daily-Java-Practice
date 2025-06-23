package com.jitu.dailytarget.may2.taxableinterface;

public class Freelancer implements Taxable{

    public float hourlyRate;
    private int hoursWorked;


    public Freelancer(float hourlyRate,int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public float calculateTax(){
        float income=hourlyRate*hoursWorked;
        return income*0.15f;
    }


}
