package org.example.seminar_3.labs.task1;

public class Products {
    String name;
    String country;
    Integer volume;

    public Products(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                '}';
    }
}
