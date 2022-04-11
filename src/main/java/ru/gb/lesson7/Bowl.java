package ru.gb.lesson7;

public class Bowl {

    private int foodAmount;
    private int addFood;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food increased by %d pts, there is now %d\n", amount, foodAmount);
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;

    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int addFood) {
        this.foodAmount += addFood;
        System.out.printf("%s food added to the bowl\n", addFood);

    }

    public int getAddFood() {
        return addFood;
    }
}
