package com.company;

public class Tester {
    private String fio;
    private String project;
    private String position;
    private Laptop laptop;

    Tester(String fio, String project, String position, Laptop laptop) {
        this.fio = fio;
        this.project = project;
        this.position = position;
        this.laptop = laptop;
    }

    void sayHi() {
        System.out.println("Меня зовут " + fio + ".");
        if (laptop != null) {
            System.out.println("У меня есть ноутбук, модель " + laptop.model + ".");
        } else {
            System.out.println("У меня нет рабочего ноутбука.");
        }
    }
}