package ru.geekbrains.Animal.Privte;

public class Animal {

    protected String name;
    protected String type;
    public static int count;


    int maxRun;
    int maxSwim;

    public Animal(String name, String type, int maxRun, int maxSwim) {
        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

        count++;

    }

    public void run(int dist) {
        if (maxRun == 0) {
            System.out.printf("%s %s не умеет бежать\n", type, name);
            return;
        }

        if (dist < 0) {
            System.out.println("Введите положительное число");
            return;
        }

        if (dist <= maxRun) {
            System.out.printf("%s %s успешно пробежал %d метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог пробежать %d метров\n", type, name, dist);
        }
    }

    public void swim(int dist) {
        if (maxSwim == 0) {
            System.out.printf("%s %s не умеет плавать\n", type, name);
            return;
        }

        if (dist < 0) {
            System.out.println("Введите положительное число");
            return;
        }

        if (dist <= maxSwim) {
            System.out.printf("%s %s успешно проплыл %d метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог проплыть %d метров\n", type, name, dist);
        }
    }
        public static int getCount () {
            return count;
        }
    }

