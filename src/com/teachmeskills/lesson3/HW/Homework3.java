package com.teachmeskills.lesson3.HW;
import java.util.Scanner;
/*
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */
public class Homework3 {
    public static void main(String[] args) {
        System.out.println("What's is temperature outside?");
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();

        if(t>-5){
            System.out.println("Warm");
        } else if (t<=-5 & t>-20) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }
    }
}

