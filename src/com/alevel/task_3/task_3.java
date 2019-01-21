package com.alevel.task_3;

import java.util.Scanner;

/* Ход коня по шахматной доске.
 Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
 Программа должна проверить, возможно ли это сделать.*/
public class task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input  the coordinates of the vertices of the triangle");
        System.out.println("A (x1, y1), B (x2, y2), C (x3, y3) :");
        double[] coordinates = new double[6];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = in.nextDouble();
        }
        double area = Math.abs((coordinates[0] - coordinates[4]) * (coordinates[3] - coordinates[5]) -
                (coordinates[2] - coordinates[4]) * (coordinates[1] - coordinates[5])) / 2;
        System.out.println("The area of triangle ABC = " + area);
    }
}