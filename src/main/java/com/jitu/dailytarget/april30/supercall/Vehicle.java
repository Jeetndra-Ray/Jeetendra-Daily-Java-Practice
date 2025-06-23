package com.jitu.dailytarget.april30.supercall;

public class Vehicle {
    String vehicletype;
    String vehiclename;

    public Vehicle(String vehicletype, String vehiclename){
        this.vehiclename=vehiclename;
        this.vehicletype=vehicletype;
    }


    public void display(){
        System.out.println("Vehicle Name is: "+ vehiclename);
        System.out.println("Vehicle Type is: "+ vehicletype);
    }

}
