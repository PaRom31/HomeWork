package ru.gb;

import com.sun.nio.sctp.SctpSocketOption;

import java.security.spec.RSAOtherPrimeInfo;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println(firstTask(10,5));
        secondTask(-40);
        System.out.println(thirdTask(-20));
        fourthTask(5,"Lesson2");
        System.out.println(fifthTask(1800));

    }

    public static boolean firstTask (int first, int second){
        return (first + second >= 10 && first + second <= 20);

    }

    public static void secondTask (int number) {
        if (number >= 0){
            System.out.println("Число положительное");
            }else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean thirdTask (int number){
        return number < 0;

    }
    public static void fourthTask (int number, String string){
        for( int i = 1; i <= number; i++){
            System.out.println(string);
        }
    }
    public static boolean fifthTask (int year){
        if (year % 400 == 0){
          return true;
        } else if (year % 100 == 0){
            return false;
        } else if (year % 4 == 0){
            return true;
        } else {
            return false;
        }


    }


}
