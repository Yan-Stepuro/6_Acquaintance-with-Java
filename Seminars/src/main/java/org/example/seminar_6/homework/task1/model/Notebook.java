package org.example.seminar_6.homework.task1.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Notebook {
    int ram;
    Integer HDD;
    String os;
    String color;

    public Notebook(int ram, Integer HDD, String os, String color) {
        this.ram = ram;
        this.HDD = HDD;
        this.os = os;
        this.color = color;
    }

    public Notebook() {
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", HDD=" + HDD +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     *
     * @return список ноутбуков
     */
    public static Set<Notebook> getNotebooks() {
        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(new Notebook(4, 256, "Windows", "black"));
        notebookSet.add(new Notebook(8, 512, "Windows", "black"));
        notebookSet.add(new Notebook(8, 1024, "Linux", "silver"));
        notebookSet.add(new Notebook(16, 1024, "Linux", "silver"));
        notebookSet.add(new Notebook(32, 2048, "Windows", "red"));
        return notebookSet;
    }

    public int getRam() {
        return ram;
    }

    public Integer getHDD() {
        return HDD;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
