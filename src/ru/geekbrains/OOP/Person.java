package ru.geekbrains.OOP;

public class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printFullInfo() {
        System.out.println("fio:" + name + ", position: " + position
                + ", email: " + email + ", salary: " + salary + ", age: "
                + age);
    }

    int getAge() {
        return age;
    }
}