package ru.geekbrains.Animal;

public class Animal {

    protected String name;
    protected String color;
    protected int age;


    public void info() {
        System.out.printf("%s %s %d \n", name, color, age);
    }

    public void jnmp(){
        System.out.println(name + "jump! ");

    }

    public void swim(){
        System.out.println(name + "swim ");
    }

}

