package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task31();
        //task56();
        //task81();
        //task106();
        task131();
    }

    private static void task31() {
        /**
         * Дана последовательность чисел а1, а2, ..., an. Указать наименьшую длину числовой оси, содержащую все эти числа.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности : ");
        int n = in.nextInt();//Считываем значение
        int array[] = new int[n];//Создаем массив
        int max = 0, min = n;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n + 1);//Заполняем массив
            if (max < array[i]) {//Условие при котором находим маскимальное значение
                max = array[i];
            }
            if (min > array[i]) {//Условие при котором находим минимальное значение
                min = array[i];
            }
        }
        System.out.println("Выводим нашу последовательность чисел: " + Arrays.toString(array));
        System.out.println("Выводим максимальное значение последовательности : " + max);
        System.out.println("Выводим минимальное значение последовательности : " + min);
        System.out.println("Выводим наименьшую длину числовой оси : " + (max - min));
    }

    /**
     * Удалить последний элемент массива вещественных чисел.
     */
    private static void task106() {
        float arr[] = new float[100];//Создаем массив
        for (int i = 0; i < 100; i++) {
            arr[i] = (float) (Math.random() * 100 + 1);//Заполняем
        }
        System.out.println(Arrays.toString(arr));
        arr = Arrays.copyOf(arr, arr.length - 1);//Копируем без последнего элемента
        System.out.println(Arrays.toString(arr));

    }

    /**
     * Дан вектор {zi}, i = 1, ..., 50. Вычислить длину этого вектора:L=sqrt(z^2+z^2+...+z^2) .
     */
    private static void task56() {
        int n = 50;
        int arr[] = new int[n];//Создаем массив
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);//Заполняем массив
        }
        System.out.println(Arrays.toString(arr));
        double L = 0;
        for (int i = 0; i < n; i++) {
            L += arr[i] * arr[i];//Просчитываем результат
        }
        System.out.println(Math.sqrt(L));//Возводим L под корень
    }

    /**
     * Дана последовательность натуральных чисел а1, a2, ..., а15.
     * Определить, есть ли в последовательности хотя бы одна пара одинаковых соседних чисел.
     * В случае положительного ответа определить порядковые номера чисел первой из таких пар.
     */
    private static void task81() {
        int N = 15;
        int arr[] = new int[N];//Создаем массив
        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);//Заполняем
        }
        for (int j = 0; j < N - 1; j++) {
            if (arr[j] == arr[j + 1]) {//Создаем условие для сравнения
                System.out.println("Порядковые номера одинаковых чисел :"+(j + 1) + " " + (j + 2));//Если оно находить одинаковые соседние числа , то выводит их порядковые номера
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Дана последовательность целых чисел а1, а2, ..., an.
     * Образовать новую последовательность, выбросив из исходной те члены, которые равны min (а1, а2, ..., an).
     */
    private static void task131() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности : ");
        int n = in.nextInt();//Считываем n
        int arr[] = new int[n];//Создаём массив
        for (int i = 0; i < n; i++) {

            arr[i] = (int) (Math.random() * 100 + 1);//Заполняем массив
        }
        System.out.println(Arrays.toString(arr));//Выводим массив
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {//Сравниваем
                min = arr[i];
            }
        }
        System.out.println("Минимальное число в нашей последовательности :" + min);//Выводим минимальное число в последовательности
        int temp = 0;
        for (int i = 0; i < 2; i++) {
            int temp1 = 0;
            int temp2 = 0;
            while (temp2 < arr.length - 1) {
                if (arr[temp2] == min) {
                    temp2++;//Перебираем массив
                    temp++;
                }
                arr[temp1] = arr[temp2];
                temp1++;
                temp2++;
            }
            arr[temp2 - temp] = arr[arr.length - 1];//От длины массива отнимаем 1
        }
        if (temp == 0) {//Сравниваем
            arr = Arrays.copyOf(arr, arr.length - 1);//От длины массива отнимаем 1
        } else {
            arr = Arrays.copyOf(arr, arr.length - temp);//От длины массива отнимаем переменную
        }
        System.out.println(Arrays.toString(arr));//Выводим отредактированный массив
    }
}

