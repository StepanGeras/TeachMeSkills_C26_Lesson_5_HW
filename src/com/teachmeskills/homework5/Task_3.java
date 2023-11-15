package com.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * 	всех элементов массива.
 */

public class Task_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the first matrix: ");
        int line = scan.nextInt();
        int column = scan.nextInt();

        int min = 0;
        int max = 100;
        int sum = 0;
        int [][] numberArray = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                numberArray[i][j] = min + (int) (Math.random() * max);
                sum += numberArray[i][j];
            }
        }

        System.out.println(Arrays.deepToString(numberArray));
        System.out.println(sum);

    }

}
