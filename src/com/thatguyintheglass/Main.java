package com.thatguyintheglass;

public class Main {

    public static void main(String[] args) {
        Dog myDog = new Dog("black","labrador");
        System.out.println("I'm a big " + myDog.Color + " " + myDog.Type);
        myDog.MakeSound();


    }
}
