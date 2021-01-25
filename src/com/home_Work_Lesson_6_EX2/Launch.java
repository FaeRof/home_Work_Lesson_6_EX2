package com.home_Work_Lesson_6_EX2;

import com.home_Work_Lesson_6_EX2.solvingArray.SolvingArray;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        /*
     Есть массив целых числел.
	Необходимо удалить дубликаты из массива и отсортировать.
	На вход метод будет получать первоначальный массив, на выход метод будет возвращать отсортированный массив без дубликатов.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Fill the array with integers via Enter:");
        for (int i = 0; i < array.length; i++) {                            // array initialize
            array[i] = scanner.nextInt();
        }

        scanner.close();                                                    // closing scanner

        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {                            // print array before operations
            System.out.print(array[i] + "  ");
        }
        System.out.println(" ");

        SolvingArray.arrayRemoveDuplicatesAndSort(array);
    }
}
