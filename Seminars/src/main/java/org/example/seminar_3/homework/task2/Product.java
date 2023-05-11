package org.example.seminar_3.homework.task2;

//2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.

public class Product {
    String name;
    String country;
    Double weight;
    Integer price;
    Integer sort;

    public Product(String name, String country, Double weight, Integer price, Integer sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort=" + sort +
                '}';
    }
}
