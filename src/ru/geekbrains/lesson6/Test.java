package ru.geekbrains.lesson6;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("Remus", 3, "White", 200, 0, 2, 3, false);
        Animal dog = new Dog("Shuma",4 , "Black-white", 500, 10, 0.5, 10, false);
        Animal cat1 = new Cat("Pushistik", 6, "Grey", 200, 0, 2, 2, false);

        cat1.jump(5);
        cat.swim(400);
        dog.run(500);
        dog.swim(11);

        System.out.println();

        Plate catPlate = new Plate("cat's plate", 5);
        Plate dogPlate = new Plate("dog's plate", 5);

        catPlate.info();
        cat.eat(catPlate);
        catPlate.info();
        cat.printSatiety();

        System.out.println();

        dogPlate.info();
        dog.eat(dogPlate);
        dogPlate.info();
        dog.printSatiety();

    }
}
