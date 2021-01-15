package ru.geekbrains.lesson6;

public class Animal {
    protected String name;
    protected int age;
    protected String color;
    protected double maxRunDistance;
    protected double maxSwimDistance;
    protected double maxJumpHeight;

    public Animal(String name, int age, String color, double maxRunDistance, double maxSwimDistance, double maxJumpHeight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;

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

}
