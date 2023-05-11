package org.example.seminar_3.homework.task3;

//3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
// и год издания после 2010 г, включительно.


import org.example.seminar_3.homework.task2.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Books> bookList = GetBooks();
        System.out.println(GetBooks());

        for (Books book : bookList) {
            if (book.year >= 2010 && book.writerFirstName.contains("a") && isSimple(book.sheets)) {
                System.out.println(book.name);
            }
        }
    }

    public static List<Books> GetBooks() {
        List<Books> bookList = new ArrayList<>();
        bookList.add(new Books("name1", "Ivanov", 1000.00, 2009, 17));
        bookList.add(new Books("name2", "Petrova", 1000.00, 2010, 23));
        bookList.add(new Books("name3", "Sidorova", 1000.00, 2011, 7));
        bookList.add(new Books("name4", "Kirova", 1000.00, 2012, 10));
        bookList.add(new Books("name5", "Vvvvvvv", 1000.00, 2012, 15));
        return bookList;
    }

    public static boolean isSimple(Integer number) {
        if(number < 2) return false;

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
