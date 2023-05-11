package org.example.seminar_3.homework.task3;

//3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.


public class Books {
    String name;
    String writerFirstName;
    Double price;
    Integer year;
    Integer sheets;

    public Books(String name, String writerFirstName, Double price, Integer year, Integer sheets) {
        this.name = name;
        this.writerFirstName = writerFirstName;
        this.price = price;
        this.year = year;
        this.sheets = sheets;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", writerFirstName='" + writerFirstName + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", sheets=" + sheets +
                '}';
    }
}
