package ru.geekbrains.lesson6;

public class Plate {
    private String name;
    private int food;

    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public void info() {
        System.out.println("In the " + this.name + " is " + this.food + " of food.");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        this.food -= appetite;
    }
}
