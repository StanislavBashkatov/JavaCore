package ru.geekbrains.Animal;

import ru.geekbrains.Animal.Privte.Cat;
import ru.geekbrains.Animal.Privte.Dog;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Pusik ", "grey", 5);

        cat.info();
        cat.jnmp();
        cat.swim();
        cat.voice();

        Dog dog = new Dog("Rex ", "black", 3);

        dog.info();
        dog.jnmp();
        dog.swim();

    }
}
