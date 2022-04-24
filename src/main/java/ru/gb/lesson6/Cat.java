package ru.gb.lesson6;

public class Cat extends Animal {

    public Cat(String name, int run, int swim) {

        super(name, run, swim);

    }

    @Override
    public void run() {
        if (getRun() > 200) {
            System.out.printf("%s ran 200m and can no longer!\n", getName());
        } else if (getRun() <= 200) {
            System.out.printf("%s run %s m\n", getName(), getRun());
        }
    }


    @Override
    public void swim() {
        if (getSwim() != 0) {
            System.out.printf("%s can't swim!\n", getName());
        }
    }
}
