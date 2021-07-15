package ru.geekbrains.Animal;

import ru.geekbrains.Animal.Privte.Animal;
import ru.geekbrains.Animal.Privte.Cat;
import ru.geekbrains.Animal.Privte.Dog;

public class Main {

    public static void main(String[] args) {
/*       Animal cat = new Cat("Pusik ", "grey", 5);


        cat.info();
        cat.swim();
        cat.run();

        Animal dog = new Dog("Rex ", "black", 3);

        dog.info();
        dog.swim();
        dog.run();

    }*/

        Animal[] animals = {

            new Cat("Pusik ", 222, 5),
            new Cat("Pusik ", 700, 10),
            new Cat("Pusik ", 67, 5),
            new Dog("Pusik ", 58, 30),
            new Dog("Pusik ", 240, 20)

        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(300);
            animals[i].swim(7);

        }
        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }

}
