package com.jitu.dailytarget.may2;

public abstract class Animal {

  public String animalName;

  public Animal (String animalName){
      this.animalName=animalName;
  }

    abstract void makeSound();

    abstract void eatFood();

    public void sleep(){
        System.out.println(animalName + "is sleeping");
    }


}
