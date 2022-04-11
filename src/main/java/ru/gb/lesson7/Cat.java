package ru.gb.lesson7;

public class Cat {

    private String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Bowl bowl) {
        if (appetite > bowl.getFoodAmount()) {
            satiety = false;
            System.out.printf("%s didn't eat! There's not enough food in the bowl! Satiety %s\n", name, satiety);
            feedTheCat(bowl);
        } else {
            satiety = true;
            bowl.decreaseFood(appetite);
            System.out.printf("Cat %s has eaten %d food. Satiety %s\n", name, appetite, satiety);
        }
    }

    private void feedTheCat(Bowl bowl) {
        if (!satiety) {
            bowl.getAddFood();
        }
    }
}
