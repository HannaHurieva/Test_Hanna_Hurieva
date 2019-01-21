package com.alevel.task_2;

import java.util.Scanner;

/* Ход коня по шахматной доске.
 Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
 Программа должна проверить, возможно ли это сделать.*/
public class task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startingPositionX, startingPositionY, nextPositionX, nextPositionY;
        do {
            System.out.println("Input  the coordinates of current position of the horse:");
            startingPositionX = in.nextInt();
            startingPositionY = in.nextInt();
        } while ((startingPositionX > 8 || startingPositionX < 0) ||
                (startingPositionY > 8 || startingPositionY < 0));
        do {
            System.out.println("Input  the coordinates of next position of the horse:");
            nextPositionX = in.nextInt();
            nextPositionY = in.nextInt();
        } while ((nextPositionX > 8 || nextPositionX < 0) ||
                (nextPositionY > 8 || nextPositionY < 0));
        int diffX = Math.abs(nextPositionX - startingPositionX);
        int diffY = Math.abs(nextPositionY - startingPositionY);
        if ((diffX == 2 && diffY == 1) || (diffX == 1 && diffY == 2)) {
            System.out.println("It is possible");
        } else System.out.println("It is NOT possible - the horse doesn't walk like that!");
    }
}