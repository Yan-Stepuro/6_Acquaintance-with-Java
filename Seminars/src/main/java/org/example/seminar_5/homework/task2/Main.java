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


import java.util.*;
import java.util.stream.Collectors;

public class Main {
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

        String[] names = str.split("\n| ");
        GetRepeats(names);
    }

    public static void GetRepeats(String[] names) {
        Map<String, Integer> db = new TreeMap<>();

        for (int i = 0; i < names.length; i++) {
            db.putIfAbsent(names[i], 0);
            db.put(names[i], db.get(names[i]) + 1);
        }

        for (int i = 0; i < names.length; i++) {
            if (db.get(names[i]).equals(1)) {
                db.remove(names[i]);
            }
        }
//        System.out.println(db);

        db.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

//        List<Map.Entry<String, Integer>> list = db.entrySet().stream()
//                .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
//                .collect(Collectors.toList());
//        System.out.println(list);
    }
}
