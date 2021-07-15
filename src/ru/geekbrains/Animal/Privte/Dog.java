package ru.geekbrains.Animal.Privte;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, "Dog", maxRun,maxSwim);
        count++;
    }
    public Dog(String name) {
        super(name, "Dog", 500,40);
        count++;
    }

    public static int getCount() {return count;}
}

