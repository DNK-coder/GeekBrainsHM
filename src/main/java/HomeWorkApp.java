//Задание 1. Задача 1
package main.java;

import java.util.Arrays;

public class HomeWorkApp {
    //Задание 1
    public static int[] changeArr(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    //Задание 2
    public static void createArr(int[] array, int step, int shift){
        for(int i = 0; i < 100; i ++){
            array[i] = shift + i * step;
        }
    }

    //Задание 3
    public static void modifierForArr(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }
    //Задание 4
    public static void createSquareArr(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
    //Задание 5

    public static void lenArr(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    //Задание 6
    public static int minInArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int maxInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }



    //Задание 7
    public static boolean checkbalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }

    //Задание 8 не смог сделать


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
        /*
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
            */


//Третья практическая работа






        //Задание 1
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println("\nЗадание 1:");
        System.out.println(Arrays.toString(changeArr(array01)));

        //Задание 2
        int[] arr2 = new int[100];
        System.out.println("\nЗадание 2:");
        System.out.println("\nbefore:" + Arrays.toString(arr2));
        createArr(arr2, 1, 1);
        System.out.println("\nafter: " + Arrays.toString(arr2));

        //Задание 3
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArr(arrayNumbers);
        System.out.println("\nЗадание 3:");
        System.out.println(Arrays.toString(arrayNumbers));

        //Задание 4
        System.out.println("\nЗадание 4:");
        createSquareArr(5);

        //Задание 5
        System.out.println("\nЗадание 5:");
        lenArr(5, 1); // Task 5 check

        //Задание 6
        System.out.println("\n\nЗадание 6:");
        int[] minMaxArray = {6, 6, 8, 12, 45, 100, 145, 220, 6, 8, 99, 3, 7};
        System.out.println(minInArray(minMaxArray));
        System.out.println(maxInArray(minMaxArray));
        //Задание 7
        System.out.println("\nЗадание 7:");
        int[] forCheckBalanceArray = {1, 2, 3, 1, 2, 3};
        System.out.println(checkbalance(forCheckBalanceArray));

        //Задание 8
        //Не смог сделать


    }
}