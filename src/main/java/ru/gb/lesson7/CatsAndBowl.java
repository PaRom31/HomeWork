package ru.gb.lesson7;

public class CatsAndBowl {

    public static void main(String[] args) {
        catsAndBowl();


    }

    private static void catsAndBowl() {

        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murzik", 40),
                new Cat("Vaska", 100),
                new Cat("Murka", 70),
                new Cat("Matroskin", 50)
        };

        Bowl bowl = new Bowl();
        bowl.putFood(200);
        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.printf("The remainder in the bowl %d\n", bowl.getFoodAmount());
            if (!cat.satiety) {
                do {
                    bowl.addFood(100);

                } while (cat.satiety);
                cat.eat(bowl);
            }
        }
        System.out.printf("The remainder in the bowl %d\n", bowl.getFoodAmount());

    }
}
