package com.company;

public class Main {

    public static void main(String[] args) {

        Tester aida = new Tester();
        aida.setFio("Алиева Аида Мамедовна");
        aida.project = "ЕРИБ";
        aida.position = "Старший инженер-тестировщик";

        Tester svetlana = new Tester();
        svetlana.setFio("Ефимова Светлана Юрьевна");
        svetlana.project = "ЕФС";
        svetlana.position = "Инженер-тестировщик";

        Tester alsu = new Tester();
        alsu.setFio("Зиганшина Алсу Ришатовна");
        alsu.project = "НКП";
        alsu.position = "Руководитель проекта";
        Laptop laptop = new Laptop();
        laptop.setModel("HP Pavilion 15-cc600");
        alsu.setLaptop(laptop);

        aida.sayHi();
        svetlana.sayHi();
        alsu.sayHi();
    }
}