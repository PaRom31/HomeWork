package ru.gb.lesson1;

public class HomeWorkApp {

    public static void main(String[] args){
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }
    private static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    private static void checkSumSing(){
        int a = -50;
        int b = 3;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }
    private static void printColor(){
        int value = 200;
        if (value <= 0){
            System.out.println("Красный");
        }else if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers(){
        int a = 10;
        int b = 20;
        if (a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }

    }
}
