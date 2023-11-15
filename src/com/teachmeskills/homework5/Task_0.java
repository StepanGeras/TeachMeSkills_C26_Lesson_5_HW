package com.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */

public class Task_0 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [][][] numberArray = new int[3][3][3];
        int min = 0;
        int max = 100;

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                for (int k = 0; k < numberArray[i][j].length; k++) {
                    numberArray[i][j][k] = min + (int) (Math.random() * max);
                }
            }
        }

        System.out.println(Arrays.deepToString(numberArray));

        System.out.print("Enter the number by which we will increase: ");
        int number = scan.nextInt();

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                for (int k = 0; k < numberArray[i][j].length; k++) {
                    numberArray[i][j][k] += number;
                }
            }
        }

        System.out.println(Arrays.deepToString(numberArray));

    }

}
