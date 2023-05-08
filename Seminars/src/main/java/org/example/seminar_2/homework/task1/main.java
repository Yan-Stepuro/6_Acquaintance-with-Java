package org.example.seminar_2.homework.task1;

//1) Дана последовательность N целых чисел. Найти сумму простых чисел.
public class main {
    public static void main(String[] args) {
        String str = "4 13 8 6 5 17 2 45 32 7"; // 44
        System.out.println(getSum(str));
    }

    public static boolean isSimple(Integer number) {
        if(number < 2) return false;

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
    public static int getSum(String str) {
        String[] strNums = str.split(" ");
        int result = 0;

        for (int i = 0; i < strNums.length; i++) {
            int number = Integer.parseInt(strNums[i]);

            if(isSimple(number)) {
                result += number;
            }
        }
        return result;
    }
}
