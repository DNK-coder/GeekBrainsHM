//Задание 1. Задача 1
package main.java;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
//Задание 1. Задача 2
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
//Задание 1. Задача 3
    static void checkSumSign() {

        Scanner in = new Scanner(System.in);
        System.out.println("\nСуммирование переменных");
        System.out.println("Напиши число А:");
        int a = (in.nextInt());
        System.out.println("Напиши число B:");
        int b = (in.nextInt());
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
//Задание 1. Задача 4
    static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nНапишите цифру чтобы получить цвет");
        System.out.println("Напиши число:");
        int value = (in.nextInt());
        if ((value) <= 0) {
            System.out.println("Красный");
        }  else if ((value) > 1 && (value) < 99 ) {
            System.out.println("Желтый");
        } else if ((value) >= 100) {
            System.out.println("Зеленый");
        }
    }
//Задание 1. Задача 5
    static void  compareNumbers() {

        Scanner in = new Scanner(System.in);
        System.out.println("\nСуммирование переменных");
        System.out.println("Напиши число А:");
        int a = (in.nextInt());
        System.out.println("Напиши число B:");
        int b = (in.nextInt());
        if (a >= b) {
            System.out.println("a >= b");
        }
        else if (a < b);{
            System.out.println("a < b");
        }
    }

}

