package org.example.seminar1_homework.task2;

//2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//        Пример ввода:
//        1 2 1 2 -1 1 3 1 3 -1 0
//        Логика расчета:
//        2 -1 переход -> 2 в сумму
//        3 -1 переход -> 3 в сумму
//        Пример вывода: 5

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumDiff(scanner));
    }

    /**
     *
     * @param scanner - сканнер
     * @return вывести сумму чисел, после которых идет отрицательное число
     */
    public static int sumDiff(Scanner scanner) {
        int sum = 0;
        int a = scanner.nextInt();

        while (a != 0) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;
        }
        return sum;
    }
}