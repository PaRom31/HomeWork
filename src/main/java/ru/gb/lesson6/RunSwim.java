package ru.gb.lesson6;

public class RunSwim {

    public static void main(String[] args) {

        Animal[] animals = {

                new Dog("Bobik", 550, 15),
                new Dog("Sharik", 100, 5),
                new Cat("Murzik", 100, 0),
                new Cat("Barsik", 300, 10),
                new Animal("Vaska", 300, 20)
        };

        int dog = 0;
        int cat = 0;
        int anim = 0;


        for (Animal animal : animals) {
            animal.run();
            animal.swim();
            anim++;

            if (animal instanceof Dog) {
                dog++;
            }
            if (animal instanceof Cat) {
                cat++;
            }
            // По заданию не понятно общее кол-во животных выводить или нет
            // anim = animals.length - dog - cat;

        }
        System.out.printf("%s dog\n", dog);
        System.out.printf("%s cat\n", cat);
        System.out.printf("%s animal\n", anim);
    }
}


