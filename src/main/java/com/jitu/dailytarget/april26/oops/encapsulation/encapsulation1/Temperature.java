package com.jitu.dailytarget.april26.oops.encapsulation.encapsulation1;

// Implement a class Temperature that stores temperature in Celsius. Add methods to get it in Fahrenheit and Kelvin.

public class Temperature {
    private float temperature;


    public float getTemperatureCelsius() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperatureKelvin(){
        float temperatureKelvin = (float) (this.temperature+273.15);
        return temperatureKelvin;
    }

    public float getTemperatureFahrenheit(){
        float temperatureFahrenheit = (float) ((this.temperature*9/5)+32);
        return temperatureFahrenheit;
    }
}
