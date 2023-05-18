package org.example.seminar_5.homework.task2;

//2) Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main { // доделать до 18.05
    public static void main(String[] args) {
        String str =
                "Иван Иванов\n" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов";

        String[] names = str.split("\n");


        System.out.println(str);
        System.out.println(Arrays.asList(names));

        GetRepeats(names);
    }

    public static void GetRepeats(String[] names) {
        HashMap<String, Integer> db = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            if (db.containsKey(names[i])) {
                db.put(names[i], db.get(names[i]) + 1);
            } else {
                db.put(names[i], 1);
            }
        }
        System.out.println(db);

    }
}
