package com.jitu.dailytarget.april27.abstraction.appliance;

public class ApplianceTest {
    public static void main(String[] args) {
      Appliance appliance = new Fan();
      Light light = new Light();

      appliance.turnOn();
      appliance.turnOff();
      light.turnOn();
      light.turnOff();

    }
}
