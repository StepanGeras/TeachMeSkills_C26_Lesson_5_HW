package com.teachmeskills.homework5;

import java.util.Arrays;

/**
 * 1. Шахматная доска
 * 	Создать программу для раскраски шахматной доски с помощью цикла.
 * 	Создать двумерный массив String'ов 8х8. С помощью циклов задать
 * 	элементам циклам значения B(Black) или W(White). Результат работы
 * 	программы:
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 */

public class Task_1 {

    public static void main(String[] args) {

        String [][] stringArray = new String[8][8];

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                if ((i + j) % 2 == 0){
                    stringArray[i][j] = "W";
                } else {
                    stringArray[i][j] = "B";
                }

            }
        }

        System.out.println(Arrays.deepToString(stringArray));

    }

}
