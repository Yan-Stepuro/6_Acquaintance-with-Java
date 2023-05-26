package org.example.seminar_6.homework.task1;

//Задание на дом :
//        • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        • Создать множество ноутбуков.
//        • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import org.example.seminar_6.homework.task1.model.Filter;
import org.example.seminar_6.homework.task1.model.Notebook;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = Notebook.getNotebooks();
        viewNotebooks(notebooks);

        Filter filterNotebooks = new Filter();
        Set<Notebook> filteredNotebooks = filterNotebooks.filterNotebooks(notebooks);
        viewNotebooks(filteredNotebooks);
    }

    /**
     * выводит множество
     * @param notebooks множество ноутбуков
     */
    public static void viewNotebooks(Set<Notebook> notebooks) {
        System.out.println("Доступные ноутбуки: ");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }
}
