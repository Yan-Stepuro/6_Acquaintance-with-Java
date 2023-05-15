package org.example.seminar_4.homework.task1;

//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int listSize = sc.nextInt();

        for (int i = 0; i < listSize; i++) {
            list.add(sc.nextInt());
        }

        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
