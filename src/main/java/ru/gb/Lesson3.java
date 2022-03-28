package ru.gb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        invertArray();
        oneHundredArray(100);
        multiplyingIntoArray();
        fillingDiagonalsArray();
        inputArray(5, 15);
        largerSmallerNumbersArray(5);
        int arr[] = {2, 2, 2, 1, 2, 2, 10, 1};
        checkBalance(arr);


    }

    public static void invertArray() {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void oneHundredArray(int length) {
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplyingIntoArray() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillingDiagonalsArray() {
        int arr[][] = new int[5][5];
        int secondDiagonal = arr.length - 1;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (y == x) {
                    arr[y][x] = 1;
                }
                if (x == secondDiagonal) {
                    secondDiagonal = secondDiagonal - 1;
                    arr[y][x] = 1;
                }
                System.out.print(arr[y][x] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] inputArray(int len, int initialValue) {

        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void largerSmallerNumbersArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                arr[0] = arr[i];
            }
        }
        System.out.println("Lager number " + arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                arr[i] = arr[0];
            } else arr[0] = arr[i];
        }
        System.out.println("Smaller number " + arr[0]);

    }

    public static void checkBalance(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int a = arr.length - 1;
        int b = arr.length - a;


        for (int j = 0; j < arr.length - 1; j++) {
            int sum2 = 0;
            for (int x = 0; x < arr.length - a; x++) {
                sum2 += arr[x];
            }
            a = --a;
            int sum1 = 0;
            for (int i = b; i < arr.length; i++) {
                sum1 += arr[i];
            }
            b = ++b;

            boolean checkBalance = true;
            if (sum1 == sum2) {
                System.out.println(checkBalance);
            }
        }
    }


}

