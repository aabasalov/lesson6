package ru.geekbrains.lesson6;

public class Cat extends Animal {
    public Cat(String name, int age, String color, double maxRunDistance, double maxSwimDistance, double maxJumpHeight) {
        super(name, age, color, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }

    @Override
    public void swim(double swimDistance) {
        System.out.println(this.name + " can't swim!");
    }
}
