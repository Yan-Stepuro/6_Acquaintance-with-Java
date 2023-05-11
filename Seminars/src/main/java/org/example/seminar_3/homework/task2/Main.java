package org.example.seminar_3.homework.task2;

//2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = GetProducts();
        System.out.println(GetProducts());
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт: ");
        int inputSort = Integer.parseInt(sc.nextLine());
        List<String> productName = new ArrayList<>();
        int minPrice = productList.get(0).price;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).sort == inputSort) {
                if (productList.get(i).price <= minPrice) {
                    minPrice = productList.get(i).price;
                }
            }
        }

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).sort == inputSort) {
                if (productList.get(i).price == minPrice) {
                    productName.add(productList.get(i).name);
                }
            }
        }
        System.out.println("productName = " + productName);
    }

    public static List<Product> GetProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("name1", "Russia", 105.2, 100, 1));
        productList.add(new Product("name2", "Russia", 105.2, 90, 1));
        productList.add(new Product("name3", "Russia", 105.2, 80, 1));
        productList.add(new Product("name4", "Russia", 105.2, 70, 2));
        productList.add(new Product("name5", "Russia", 105.2, 60, 2));
        productList.add(new Product("name6", "Russia", 105.2, 50, 2));

        return productList;
    }


}
