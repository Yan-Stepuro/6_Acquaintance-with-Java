package org.example.seminar_3.homework.task4;

//4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println(numbers);

        System.out.println(Max(numbers));
        System.out.println(Min(numbers));
        System.out.println(Avg(numbers));

    }

//    public static List<Integer> GetList(int size) {
//        List<Integer> numbers = new ArrayList<>();
//
//        for (int i = 1; i <= size; i++) {
//            numbers.add(i);
//        }
//
//        return numbers;
//    }

    public static Integer Max(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static Integer Min(List<Integer> numbers) {
        int min = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= min) {
                min = numbers.get(i);
            }
        }

        return min;
    }

    public static Double Avg(List<Integer> numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return (double) sum / numbers.size();
    }
}
