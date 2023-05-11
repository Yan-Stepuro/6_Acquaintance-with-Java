package org.example.seminar_3.homework.task1;

//1. Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Масло высший сорт", 100, 1);
        Product pr2 = new Product("Мука высший сорт", 50, 1);
        Product pr3 = new Product("Хлеб высший сорт", 20, 1);
        Product pr4 = new Product("Масло", 90, 2);
        Product pr5 = new Product("Мука", 40, 2);
        Product pr6 = new Product("Хлеб высший", 101, 2);
        Product pr7 = new Product("Масло", 80, 3);
        Product pr8 = new Product("Мука", 35, 3);
        Product pr9 = new Product("Хлеб", 5, 3);
        List<Product> productList = new ArrayList<>();
        productList.add(pr1);
        productList.add(pr2);
        productList.add(pr3);
        productList.add(pr4);
        productList.add(pr5);
        productList.add(pr6);
        productList.add(pr7);
        productList.add(pr8);
        productList.add(pr9);
        System.out.println(productList);
        int maxPrice = 10;

        for (Product product : productList) {
            if (product.name.contains("высший") && (product.sort == 1 || product.sort == 2)) {
                if (product.price > maxPrice) {
                    maxPrice = product.price;
                }
            }
        }
        System.out.println(maxPrice);
    }
}
