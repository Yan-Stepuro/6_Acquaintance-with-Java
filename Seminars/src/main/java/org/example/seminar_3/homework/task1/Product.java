package org.example.seminar_3.homework.task1;
////1. Дан массив записей: наименование товара, цена, сорт.
public class Product {
    String name;
    Integer price;
    Integer sort;

    public Product(String name, Integer price, Integer sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sort=" + sort +
                '}';
    }
}
