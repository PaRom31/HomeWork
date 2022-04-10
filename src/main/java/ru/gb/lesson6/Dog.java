package ru.gb.lesson6;

public class Dog extends Animal {


    public Dog(String name, int run, int swim) {

        super(name, run, swim);

    }

    @Override
    public void run() {
        if (getRun() > 500) {
            System.out.printf("%s ran 500m and can no longer!\n", getName());
        } else if (getRun() <= 500) {
            System.out.printf("%s run %s m\n", getName(), getRun());
        }


    }

    @Override
    public void swim() {
        if (getSwim() > 10) {
            System.out.printf("%s can't swim more than 10m!\n", getName());
        } else if (getSwim() <= 10) {
            System.out.printf("%s swim %s m\n", getName(), getSwim());
        }
    }
}
