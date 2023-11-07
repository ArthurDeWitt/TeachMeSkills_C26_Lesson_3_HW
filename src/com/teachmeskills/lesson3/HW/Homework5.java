package com.teachmeskills.lesson3.HW;
/*
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */
public class Homework5 {
    public static void main(String[] args) {
        int i = 7;
        while (i < 100){
            System.out.println(i);
            i = i + 7;
        }
    }
}
