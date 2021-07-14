package ru.geekbrains.Animal;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Pusik ", "grey", 5);

        cat.info();
        cat.jnmp();
        cat.swim();

        Dog dog = new Dog("Rex ", "black", 3);

        cat.info();
        cat.jnmp();
        cat.swim();

    }
}
