package org.example.seminar_2.homework.task2;

//2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

public class main {
    public static void main(String[] args) {
//        String str = "4 13 8 6 5 17 2 45 32 7"; // false
        String str = "4 13 15 17 19 21 22 23 24 25"; // true
        System.out.println(checkRise(str));
    }

    public static boolean checkRise(String str) {
        String[] strNums = str.split(" ");
        boolean check = true;

        for (int i = 1; i < strNums.length; i++) {
            int number = Integer.parseInt(strNums[i]);
            int previous = Integer.parseInt(strNums[i - 1]);

            if(number <= previous) check = false;
        }
        return check;
    }

}
