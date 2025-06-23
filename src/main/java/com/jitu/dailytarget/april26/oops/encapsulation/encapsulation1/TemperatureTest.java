package com.jitu.dailytarget.april26.oops.encapsulation.encapsulation1;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        temperature.setTemperature(34);
        System.out.println(temperature.getTemperatureCelsius());
        System.out.println(temperature.getTemperatureFahrenheit());
        System.out.println(temperature.getTemperatureKelvin());


    }
}
