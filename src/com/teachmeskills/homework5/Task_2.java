package com.teachmeskills.homework5;

import java.util.Arrays;

/**
 * 2. Умножение двух матриц
 * 	Создайте два массива целых чисел размером 3х3 (две матрицы).
 * 	Напишите программу для умножения двух матриц.
 * 	Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * 	Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * 	Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class Task_2 {

    public static void main(String[] args) {

        int [][] numberArrays1 = {{1,0,0,0}, {0,1,0,0}, {0,0,0,0}};
        int [][] numberArrays2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int [][] productOfMatrices = new int [numberArrays1.length][numberArrays2[0].length];

        for (int i = 0; i < numberArrays1.length; i++) {
            for (int j = 0; j < numberArrays2[0].length; j++) {
                for (int k = 0; k < numberArrays2[0].length; k++) {
                    productOfMatrices[i][j] += numberArrays1[i][k] * numberArrays2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(productOfMatrices));

    }

}
