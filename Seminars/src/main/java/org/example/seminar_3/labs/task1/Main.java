package org.example.seminar_3.labs.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1.	Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар,
// и объем поставляемой партии в штуках.
// Найти страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
public class Main {
    public static void main(String[] args) {
        Products pr = new Products("qwe", "zxc", 3);
        Products pr2 = new Products("qwe", "zxc2", 3);
        Products pr3 = new Products("qwe", "zxc2", 3);
        List<Products> productsList = new ArrayList<>();
        productsList.add(pr);
        productsList.add(pr2);
        productsList.add(pr3);
        System.out.println(productsList);
        Scanner sc = new Scanner(System.in);
        String searchProductName = sc.nextLine();
        Integer exportVolume = 0;
        List<String> countryList = new ArrayList<>();

        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).name.equals(searchProductName)) {
                exportVolume += productsList.get(i).volume;

                if (!countryList.contains(productsList.get(i).country)) {
                    countryList.add(productsList.get(i).country);
                }
            }
        }
        System.out.println("countryList = " + countryList);
        System.out.println("exportVolume = " + exportVolume);
    }
}
