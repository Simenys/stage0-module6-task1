package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String furStatus = hasFur ? "a" : "no";
        String pawText = numberOfPaws == 1 ? "paw" : "paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawText + " and " + furStatus + " fur.";
    }

    public String Dog() {
        Dog dog = new Dog();
         return dog.getDescription();
    }

    public String Bird() {
        Bird bird = new Bird();
        return bird.getDescription();
    }


}
