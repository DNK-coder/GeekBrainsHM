//Задание 1. Задача 1
package main.java;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {

        //Первая практическая работа
/*
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
//Практическая работа 1. Задача 2
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
//Практическая работа 1. Задача 3
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
//Практическая работа 1. Задача 4
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
//Практическая 1. Задача 5
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
        }*/

        //Вторая практическая работа
        method_one();
        method_two();
        method_three();
        method_four();
        method_five();
    }

    //Практическая работа 2. Задание 1
    static void method_one() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nНапиши два числа, и узнай лежит ли сумма этих чисел в пределах?");
        System.out.println("Напиши число А:");
        int a = (in.nextInt());
        System.out.println("Напиши число B:");
        int b = (in.nextInt());

        if ((a + b) > 9 && (a + b) < 21) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    //Практическая работа 2. Задание 2
    static void method_two() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nНапиши число положительное или отрицательное со знаком минус, и получи" +
                " сообщение в консоль.");
        System.out.println("Напиши число:");
        int a = (in.nextInt());
        if (a >= 0) {
            System.out.println("Положительное");
        } else if (a < -1) {
            System.out.println("Отрицательное");
        }
    }

    //Практическая работа 2. Задание 3
    static void method_three() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nНапиши число положительное или отрицательное со знаком минус, и получи" +
                " сообщение в консоль. \nFalse - положительное. \nTrue - отрицательное.");
        System.out.println("Напиши число:");
        int a = (in.nextInt());
        if (a >= 0) {
            System.out.println("False");
        } else if (a < -1) {
            System.out.println("True");
        }
    }

    //Практическая работа 2. Задание 4
    static void method_four() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nНапиши строку а затем число, чтобы вывести " +
                "на экран количество строк, ранее заданному числу." +
                "\nИ получи сообщение на экран");
        System.out.println("Напиши строку:");
        String str = (in.nextLine());
        System.out.println("Напиши число:");
        int i = (in.nextInt());
        for (int r = 0; r < i; r++)
            System.out.println(str);
    }

    //Практическая работа 2. Задание 5
    static void method_five() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nНапишите интересующий вас год чтобы узнать високосный он или нет.");
        System.out.println("Напишите год:");
        int i = (in.nextInt());
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            System.out.println("Год високосный");
        } else
            System.out.println("Год не високосный");
    }
}
