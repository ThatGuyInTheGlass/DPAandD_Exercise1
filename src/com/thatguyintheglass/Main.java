package com.thatguyintheglass;

public class Main {

    public static void main(String[] args) {
        Labrador myDog = new Labrador("black");
        System.out.println("I'm a big " + myDog.Color + " " + myDog.Type);
        myDog.MakeSound();


    }
}
