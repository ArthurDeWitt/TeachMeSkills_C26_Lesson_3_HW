package com.teachmeskills.lesson3.HW;
import java.util.Scanner;
/*
Напишите программу, которая будет принимать на вход число из консоли и на выход
будет выводить сообщение четное число или нет. Для определения четности числа
используйте операцию получения остатка от деления (операция выглядит так: '% 2').
 */
public class Homework2 {
    public static void main(String[] args) {
        // Ввод числа в консоль
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        // Условие проверки чётности и возврат результата
        if (a % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
