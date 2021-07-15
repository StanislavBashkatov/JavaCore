package ru.geekbrains.OOP;

public class MainOop {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Anton Antonov", "courier", "ivanov@person.com", 7775455, 30000, 20);
        persons[1] = new Person("Nickolay Bolshov", "designer", "petrov@person.com", 7775456, 100000, 31);
        persons[2] = new Person("Dmitiy Medvedev", "developer", "sidorov@person.com", 7775457, 300000, 42);
        persons[3] = new Person("Saveliy Kramorov", "project manager", "nikolaev@person.com", 7775458, 150000, 47);
        persons[4] = new Person("Anna Ivanova", "clerk", "anna@person.com", 7773359, 89000, 54);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40) {
                persons[i].printFullInfo();
            }
        }



//        for (Person person : persons) {
//            if(person.getAge()>40){
//                person.getFullInfo();
//            }
//        }
    }
}

