package ru.geekbrains.lesson6;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("Remus", 3, "White", 200, 0, 2);
        Animal dog = new Dog("Shuma",4 , "Black-white", 500, 10, 0.5);
        Animal cat1 = new Cat("Pushistik", 6, "Grey", 200, 0, 2);

        cat1.jump(5);
        cat.swim(400);
        dog.run(500);
    }
}
