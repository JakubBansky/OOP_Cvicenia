package org.example.Fourth;

public class Dog extends Animal{

    public Dog(){
        this.numOfLegs = 4;
    }
    @Override
    public void sound(){
        System.out.println("Bark bark");
    }
}
