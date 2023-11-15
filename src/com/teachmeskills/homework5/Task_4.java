package com.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 4. Создайте двумерный массив. Выведите на консоль диагонали массива.
 */
public class Task_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the first matrix: ");
        int line = scan.nextInt();
        int column = scan.nextInt();

        int min = 0;
        int max = 100;
        int count = 0;
        int [][] numberArray = new int[line][column];

        if (line > column){
            count = column;
        } else {
            count = line;
        }

        int [] diagonal =  new int [count];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                numberArray[i][j] = min + (int) (Math.random() * max);
            }
        }

        for (int i = 0; i < count; i++) {
            diagonal[i] = numberArray[i][i];
        }

        System.out.println(Arrays.deepToString(numberArray));
        System.out.println(Arrays.toString(diagonal));

    }

}
