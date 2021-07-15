package ru.geekbrains.Animal.Privte;

public class Cat extends Animal {
    private static int count;

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, "Cat", maxRun,maxSwim);
        count++;
    }
  public Cat(String name) {
        super(name, "Cat", 200,0);
        count++;
  }

  public static int getCount() {return count;}
}
