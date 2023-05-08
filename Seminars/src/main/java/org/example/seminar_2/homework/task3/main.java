package org.example.seminar_2.homework.task3;

import java.util.Arrays;

//3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class main {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 13, -8, 6, 5, -17, 2, -45, -32, 7}; //21 {4, 13, 21, 6, 5, 21, 2, 21, 21, 7}
        int sumIndex = getSumIndex(arr);
        System.out.println(Arrays.toString(changeArr(arr, sumIndex)));
    }

    public static int getSumIndex(int[] arr) {
        int sumIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > 9 && arr[i] < 100) || (arr[i] < -9 && arr[i] > -100)) {
                sumIndex += i;
            }
        }
        return sumIndex;
    }

    public static int[] changeArr(int[] arr, int sumIndex) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 0) {
                arr[i] = sumIndex;
            }
        }
        return arr;
    }
}
