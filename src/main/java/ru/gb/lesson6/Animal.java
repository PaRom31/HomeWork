package ru.gb.lesson6;

public class Animal {

    private String name;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim) {

        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void run() {
        System.out.printf("%s run %s m\n", name, run);

    }

    public void swim() {
        System.out.printf("%s swim %s m\n", name, swim);
    }

    public String getName() {
        return this.name;
    }

    public int getRun() {
        return this.run;
    }

    public int getSwim() {
        return swim;
    }
}
