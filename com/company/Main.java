package com.company;

public class Main {

    public static void main(String[] args) {

        Tester aida = new Tester("Алиева Аида Мамедовна", "ЕРИБ", "Старший инженер-тестировщик", null);

        Tester svetlana = new Tester("Ефимова Светлана Юрьевна", "ЕФС", "Инженер-тестировщик", null);

        Tester alsu = new Tester("Зиганшина Алсу Ришатовна", "НКП", "Руководитель проекта", new Laptop());

        aida.sayHi();
        svetlana.sayHi();
        alsu.sayHi();
    }
}