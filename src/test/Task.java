package test;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите %d элемент ", (i + 1));
            array[i] = scanner.nextInt();
        }


        sort(array);

        System.out.println("Массив после сортировки:");
        print(array);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d-й элемент:%d\n", (i + 1), array[i]);
        }
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}




