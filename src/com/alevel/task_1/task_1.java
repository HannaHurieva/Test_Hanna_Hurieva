package com.alevel.task_1;

import java.util.Scanner;

// Найти количество различных элементов массива
public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of array:");
        int length = in.nextInt();
        int[] inputArray = new int[length];
        System.out.println("Input the numbers of array:");
        for (int i = 0; i < length; i++) {
            inputArray[i] = in.nextInt();
        }
        System.out.println("The number of different array elements = " + getCountUnique(inputArray));
    }

    private static int getCountUnique(int[] array) {
        int countUnique = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    countUnique--;
                    break;
                }
            }
            countUnique++;
        }
        return countUnique;
    }
}