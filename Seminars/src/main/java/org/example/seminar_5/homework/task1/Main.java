package org.example.seminar_5.homework.task1;

//1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
//        Пример:
//        Россия идет вперед всей планеты. Планета — это не Россия.
//        Запрос: Россия
//        Ответ: Россия - 2
//        toLoverCase().
//        (Усложнение - игнорировать пунктуацию)* - регулярные выражения

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Россия идет вперед россия россия всей планеты. Планета — это не Россия.";
        Scanner sc = new Scanner(System.in);
        String request = sc.nextLine();

        CountWord(request, str);

    }

    public static void CountWord(String request, String str) {
        String[] words = str.toLowerCase().split(" ");

        HashMap<String, Integer> db = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (db.containsKey(words[i])) {
                db.put(words[i], db.get(words[i]) + 1);
            } else {
                db.put(words[i], 1);
            }
        }
        System.out.println(db);

        for (var entry : db.entrySet()) {
            if (entry.getKey().equals(request.toLowerCase())) {
                System.out.println(request + " = " + entry.getValue());
            }
        }
    }
}
