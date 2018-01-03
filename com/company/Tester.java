package com.company;

public class Tester {
    private String fio;
    String project;
    String position;
    private Laptop laptop;

    private String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    private Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    void sayHi() {
        System.out.println("Меня зовут " + getFio() + ".");
        if (laptop != null) {
            System.out.println("У меня есть ноутбук, модель " + getLaptop().getModel() + ".");
        } else {
            System.out.println("У меня нет рабочего ноутбука.");
        }
    }
}