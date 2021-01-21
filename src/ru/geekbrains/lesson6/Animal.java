package ru.geekbrains.lesson6;

public class Animal {
    protected String name;
    protected int age;
    protected String color;
    protected double maxRunDistance;
    protected double maxSwimDistance;
    protected double maxJumpHeight;
    protected int appetite;
    protected boolean satiety;

    public Animal(String name, int age, String color, double maxRunDistance, double maxSwimDistance, double maxJumpHeight, int appetite, boolean satiety) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.appetite = appetite;
        this.satiety = satiety;

    }

    public void run(double runDistance) {
        if (runDistance <= maxRunDistance) {
            System.out.println(this.name + " run " + runDistance + " meters!");
        }
        else{
            System.out.println(this.name + " can't run more than " + maxRunDistance + " meters!");
        }
    }

    public void swim(double swimDistance) {
        if (swimDistance <= maxSwimDistance) {
            System.out.println(this.name + " swim " + swimDistance +" meters!");
        }
        else {
            System.out.println(this.name + " can't swim more than " + maxSwimDistance +" meters!");
        }
    }

    public void jump(double jumpHeight) {
        if (jumpHeight <= maxJumpHeight) {
            System.out.println(this.name + " jump " + jumpHeight +" meters!");
        }
        else {
            System.out.println(this.name + " can't jump more than " + maxJumpHeight +" meters!");
        }
    }

    public void eat(Plate plate) {
        if (this.appetite>plate.getFood()) {
            System.out.println("There's not enough food here.");
        }
        else {
            System.out.println(this.name + " is eating...");
            plate.decreaseFood(getAppetite());
            this.appetite = 0;
            this.satiety = true;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public void printSatiety() {
        if (this.satiety == true) {
            System.out.println(this.name + " is full.");
        }
        else {
            System.out.println(this.name + " is hungry.");
        }
    }

}
